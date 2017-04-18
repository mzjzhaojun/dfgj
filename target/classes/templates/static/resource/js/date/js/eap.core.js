/**
* jQuery EAP_FRAMWORK
* 
* HGF
* 
*/
(function($) {
	
	Function.prototype.eapExtend = function (parent, overrides)
    {
        if (typeof parent != 'function') return this;
        //保存对父类的引用
        this.base = parent.prototype;
        this.base.constructor = parent;
        //继承
        var f = function () { };
        f.prototype = parent.prototype;
        this.prototype = new f();
        this.prototype.constructor = this;
        //附加属性方法
        if (overrides) $.extend(this.prototype, overrides);
    };
	
	Function.prototype.delayInvoke = function(o, delay, args) {
		
		var fn = this;
		return setTimeout(function() {fn.apply(o, args || []);}, delay);
	};
	
	$.setRegional = function(key, value){
		if (!$.regional) $.regional = {};
		$.regional[key] = value;
	};
	
	$.eap = {
		
		version: 'V1.0.0',
		managerCount: 0,
		managerIdPrev: 'eap',
		keyCode: {
			ENTER: 13, ESC: 27, END: 35, HOME: 36,
			SHIFT: 16, TAB: 9,
			LEFT: 37, RIGHT: 39, UP: 38, DOWN: 40,
			DELETE: 46, BACKSPACE:8
		},
		getId: function (prev)
        {
            prev = prev || this.managerIdPrev;
            var id = prev + (1000 + this.managerCount);
            this.managerCount++;
            return id;
        },
		
		//命名空间、核心
		core: {},
		
		//命名空间、组件
		widget: {}
	};
	
	$.eap.core.Component = function(options) {
		
		this.options = options;
		this.events = this.events || {};
	};
	
	$.extend($.eap.core.Component.prototype, {
		
		//触发事件
		//data (可选) Array(可选)传递给事件处理函数的附加参数
		trigger: function (arg, data)
		{
			var name = arg.toLowerCase();
			var event = this.events[name];
			if (!event) return;
			data = data || [];
			if ((data instanceof Array) == false)
			{
				data = [data];
			}
			for (var i = 0; i < event.length; i++)
			{
				var ev = event[i];
				if (ev.handler.apply(ev.context, data) == false)
					return false;
			}
		},

		//绑定事件
		bind: function (arg, handler, context)
		{
			if (typeof arg == 'object')
			{
				for (var p in arg)
				{
					this.bind(p, arg[p]);
				}
				return;
			}
			if (typeof handler != 'function') return false;
			var name = arg.toLowerCase();
			var event = this.events[name] || [];
			context = context || this;
			event.push({ handler: handler, context: context });
			this.events[name] = event;
		},

		//取消绑定
		unbind: function (arg, handler)
		{
			if (!arg)
			{
				this.events = {};
				return;
			}
			var name = arg.toLowerCase();
			var event = this.events[name];
			if (!event || !event.length) return;
			if (!handler)
			{
				delete this.events[name];
			}
			else
			{
				for (var i = 0, l = event.length; i < l; i++)
				{
					if (event[i].handler == handler)
					{
						event.splice(i, 1);
						break;
					}
				}
			}
		},
		
		hasBind: function (arg)
        {
            var name = arg.toLowerCase();
            var event = this.events[name];
            if (event && event.length) return true;
            return false;
        }
	});
	
	$.eap.core.UIComponent = function(element, options) {
		
		$.eap.core.UIComponent.base.constructor.call(this, options);
		
		this.element = element;
		this._init();
		this._render();
	};
	
	$.eap.core.UIComponent.eapExtend($.eap.core.Component, {
		
		_init: function() {
			
			
		},
		
		_render: function() {
			
			
		}
	});
	
	/**
	 * 扩展String方法
	 */
	$.extend(String.prototype, {
		isPositiveInteger:function(){
			return (new RegExp(/^[1-9]\d*$/).test(this));
		},
		isInteger:function(){
			return (new RegExp(/^\d+$/).test(this));
		},
		isNumber: function(value, element) {
			return (new RegExp(/^-?(?:\d+|\d{1,3}(?:,\d{3})+)(?:\.\d+)?$/).test(this));
		},
		trim:function(){
			return this.replace(/(^\s*)|(\s*$)|\r|\n/g, "");
		},
		startsWith:function (pattern){
			return this.indexOf(pattern) === 0;
		},
		endsWith:function(pattern) {
			var d = this.length - pattern.length;
			return d >= 0 && this.lastIndexOf(pattern) === d;
		},
		replaceSuffix:function(index){
			return this.replace(/\[[0-9]+\]/,'['+index+']').replace('#index#',index);
		},
		trans:function(){
			return this.replace(/&lt;/g, '<').replace(/&gt;/g,'>').replace(/&quot;/g, '"');
		},
		encodeTXT: function(){
			return (this).replaceAll('&', '&amp;').replaceAll("<","&lt;").replaceAll(">", "&gt;").replaceAll(" ", "&nbsp;");
		},
		replaceAll:function(os, ns){
			return this.replace(new RegExp(os,"gm"),ns);
		},
		replaceTm:function($data){
			if (!$data) return this;
			return this.replace(RegExp("({[A-Za-z_]+[A-Za-z0-9_]*})","g"), function($1){
				return $data[$1.replace(/[{}]+/g, "")];
			});
		},
		replaceTmById:function(_box){
			var $parent = _box || $(document);
			return this.replace(RegExp("({[A-Za-z_]+[A-Za-z0-9_]*})","g"), function($1){
				var $input = $parent.find("#"+$1.replace(/[{}]+/g, ""));
				return $input.val() ? $input.val() : $1;
			});
		},
		isFinishedTm:function(){
			return !(new RegExp("{[A-Za-z_]+[A-Za-z0-9_]*}").test(this)); 
		},
		skipChar:function(ch) {
			if (!this || this.length===0) {return '';}
			if (this.charAt(0)===ch) {return this.substring(1).skipChar(ch);}
			return this;
		},
		isValidPwd:function() {
			return (new RegExp(/^([_]|[a-zA-Z0-9]){6,32}$/).test(this)); 
		},
		isValidMail:function(){
			return(new RegExp(/^\w+((-\w+)|(\.\w+))*\@[A-Za-z0-9]+((\.|-)[A-Za-z0-9]+)*\.[A-Za-z0-9]+$/).test(this.trim()));
		},
		isSpaces:function() {
			for(var i=0; i<this.length; i+=1) {
				var ch = this.charAt(i);
				if (ch!=' '&& ch!="\n" && ch!="\t" && ch!="\r") {return false;}
			}
			return true;
		},
		isPhone:function() {
			return (new RegExp(/(^([0-9]{3,4}[-])?\d{3,8}(-\d{1,6})?$)|(^\([0-9]{3,4}\)\d{3,8}(\(\d{1,6}\))?$)|(^\d{3,8}$)/).test(this));
		},
		isUrl:function(){
			return (new RegExp(/^[a-zA-z]+:\/\/([a-zA-Z0-9\-\.]+)([-\w .\/?%&=:]*)$/).test(this));
		},
		isExternalUrl:function(){
			return this.isUrl() && this.indexOf("://"+document.domain) == -1;
		}
	});
	
	ArrayUtil = {
		
		contains: function(_array, item) {
			
			var i = _array.length;
			while (i--) {
				if (_array[i] == item) {
					return true;
				}
			}
			return false;
		}
	};
	
} (jQuery));


(function(window) {
	
	var class2type = {};
	var core_toString = class2type.toString;
	
	RequestMethod = {GET:"GET", POST:"POST", PUT:"PUT", DELETE:"DELETE"};
	
	eap = {
		
		version: 'v1.0.0',
		
		//命名空间、核心
		core: {},
		
		//命名空间、组件
		widget: {},
		
		//命名空间、数据
		data: {},
		
		extend : function() {
			
			var src, copyIsArray, copy, name, options, clone,
				target = arguments[0] || {},
				i = 1,
				length = arguments.length,
				deep = false;
		
			// Handle a deep copy situation
			if ( typeof target === "boolean" ) {
				deep = target;
				target = arguments[1] || {};
				// skip the boolean and the target
				i = 2;
			}
		
			// Handle case when target is a string or something (possible in deep copy)
			if ( typeof target !== "object" && !eap.isFunction(target) ) {
				target = {};
			}
		
			// extend jQuery itself if only one argument is passed
			if ( length === i ) {
				target = this;
				--i;
			}
		
			for ( ; i < length; i++ ) {
				// Only deal with non-null/undefined values
				if ( (options = arguments[ i ]) != null ) {
					// Extend the base object
					for ( name in options ) {
						src = target[ name ];
						copy = options[ name ];
		
						// Prevent never-ending loop
						if ( target === copy ) {
							continue;
						}
		
						// Recurse if we're merging plain objects or arrays
						if ( deep && copy && ( eap.isPlainObject(copy) || (copyIsArray = eap.isArray(copy)) ) ) {
							if ( copyIsArray ) {
								copyIsArray = false;
								clone = src && eap.isArray(src) ? src : [];
		
							} else {
								clone = src && eap.isPlainObject(src) ? src : {};
							}
		
							// Never move original objects, clone them
							target[ name ] = eap.extend( deep, clone, copy );
		
						// Don't bring in undefined values
						} else if ( copy !== undefined ) {
							target[ name ] = copy;
						}
					}
				}
			}
		
			// Return the modified object
			return target;
		},
		
		isFunction: function( obj ) {
			return eap.type(obj) === "function";
		},
	
		isArray: Array.isArray || function( obj ) {
			return eap.type(obj) === "array";
		},
		
		isWindow: function( obj ) {
			/* jshint eqeqeq: false */
			return obj != null && obj == obj.window;
		},
		
		type: function( obj ) {
			if ( obj == null ) {
				return String( obj );
			}
			return typeof obj === "object" || typeof obj === "function" ?
				class2type[ core_toString.call(obj) ] || "object" :
				typeof obj;
		},
		
		isPlainObject: function( obj ) {
			var key;
	
			// Must be an Object.
			// Because of IE, we also have to check the presence of the constructor property.
			// Make sure that DOM nodes and window objects don't pass through, as well
			if ( !obj || eap.type(obj) !== "object" || obj.nodeType || eap.isWindow( obj ) ) {
				return false;
			}
	
			try {
				// Not own constructor property must be Object
				if ( obj.constructor &&
					!core_hasOwn.call(obj, "constructor") &&
					!core_hasOwn.call(obj.constructor.prototype, "isPrototypeOf") ) {
					return false;
				}
			} catch ( e ) {
				// IE8,9 Will throw exceptions on certain host objects #9897
				return false;
			}
	
			// Own properties are enumerated firstly, so to speed up,
			// if last one is own, then all properties are own.
			for ( key in obj ) {}
	
			return key === undefined || core_hasOwn.call( obj, key );
		},
		
		each: function( obj, callback, args ) {
			var value,
				i = 0,
				length = obj.length,
				isArray = isArraylike( obj );
	
			if ( args ) {
				if ( isArray ) {
					for ( ; i < length; i++ ) {
						value = callback.apply( obj[ i ], args );
	
						if ( value === false ) {
							break;
						}
					}
				} else {
					for ( i in obj ) {
						value = callback.apply( obj[ i ], args );
	
						if ( value === false ) {
							break;
						}
					}
				}
	
			// A special, fast, case for the most common use of each
			} else {
				if ( isArray ) {
					for ( ; i < length; i++ ) {
						value = callback.call( obj[ i ], i, obj[ i ] );
	
						if ( value === false ) {
							break;
						}
					}
				} else {
					for ( i in obj ) {
						value = callback.call( obj[ i ], i, obj[ i ] );
	
						if ( value === false ) {
							break;
						}
					}
				}
			}
	
			return obj;
		}
	};
	
	eap.each("Boolean Number String Function Array Date RegExp Object Error".split(" "), function(i, name) {
		class2type[ "[object " + name + "]" ] = name.toLowerCase();
	});
	
	eap.core.Component = function(options) {
		
		this.options = options;
		this.events = this.events || {};
	};
	
	eap.extend(eap.core.Component.prototype, {
		
		//触发事件
		//data (可选) Array(可选)传递给事件处理函数的附加参数
		trigger: function (arg, data)
		{
			var name = arg.toLowerCase();
			var event = this.events[name];
			if (!event) return;
			data = data || [];
			if ((data instanceof Array) == false)
			{
				data = [data];
			}
			for (var i = 0; i < event.length; i++)
			{
				var ev = event[i];
				if (ev.handler.apply(ev.context, data) == false)
					return false;
			}
		},

		//绑定事件
		bind: function (arg, handler, context)
		{
			if (typeof arg == 'object')
			{
				for (var p in arg)
				{
					this.bind(p, arg[p]);
				}
				return;
			}
			if (typeof handler != 'function') return false;
			var name = arg.toLowerCase();
			var event = this.events[name] || [];
			context = context || this;
			event.push({ handler: handler, context: context });
			this.events[name] = event;
		},

		//取消绑定
		unbind: function (arg, handler)
		{
			if (!arg)
			{
				this.events = {};
				return;
			}
			var name = arg.toLowerCase();
			var event = this.events[name];
			if (!event || !event.length) return;
			if (!handler)
			{
				delete this.events[name];
			}
			else
			{
				for (var i = 0, l = event.length; i < l; i++)
				{
					if (event[i].handler == handler)
					{
						event.splice(i, 1);
						break;
					}
				}
			}
		},
		
		hasBind: function (arg)
        {
            var name = arg.toLowerCase();
            var event = this.events[name];
            if (event && event.length) return true;
            return false;
        }
	});
	
	eap.data.EAPDataService = function(options) {
 		
 		eap.data.EAPDataService.base.constructor.call(this, options);
 		
 		this._init();
 	};
 	
 	eap.data.EAPDataService.eapExtend(eap.core.Component, {
 		
 		_init:function() {},
 		
 		_query: function(params, success, error) {},
 		
 		list: function(params, success, error) {},
 		
 		insert: function(params, success, error) {},
 		
 		update: function(params, success, error) {},
 		
 		del: function(params, success, error) {},
 		
 		getItem: function(params, success, error) {}
 		
 	});
	
	function isArraylike( obj ) {
		var length = obj.length,
			type = eap.type( obj );
	
		if ( eap.isWindow( obj ) ) {
			return false;
		}
	
		if ( obj.nodeType === 1 && length ) {
			return true;
		}
	
		return type === "array" || type !== "function" &&
			( length === 0 ||
			typeof length === "number" && length > 0 && ( length - 1 ) in obj );
	}
} (window));