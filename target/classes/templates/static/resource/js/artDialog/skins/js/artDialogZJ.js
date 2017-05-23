	var innnerParam=[];
	var outter
	var setDataChilds=[];
	/**
	 * url : 弹出子页面地址
	 * parm : 传递子页面的参数
	 * backFn : 弹出框关闭时回调函数
	 * width : 弹出框宽度(可百分百或正常高度)
	 * height ：弹出框高度
	 * isShade : 是否有背景
	**/
	function artdialogIframe(url,parm,backfn,width,height,isShade,title){
			for(var key in parm) { 
				art.dialog.data(key, parm[key]);
				innnerParam.push(key);
			} 
			art.dialog.open(url,{
				close: function () {
					//backfn();
					backfn();
				   // var win = art.dialog.open.origin;  
				    //win.location.reload();  
				},
				width:width,
				height:height,
				fixed: true,
			    cancel: true,
			    title:title,
			    lock: isShade
			}, false);
	}
	//子页面获取父页面数据
	function getDateParent(){
		var par = parent.innnerParam;
		var parm={};
		
		if(par==null||par.length>0){
			for(var i=0;i<par.length;i++){
				var names=par[i];
				parm[names]=art.dialog.data(par[i]);
			}
		}
		return parm;
	}
	//子页面添加数据供父页面获取
	function setDateChild(param){
		for(var key in param) { 
			art.dialog.data("c"+key, param[key]);
			parent.setDataChilds.push("c"+key);
		}
	}
	//子页面添加数据供父页面获取
	function removeDateChild(){
		var par = setDataChilds;
		if(par==null||par.length>0){
			for(var i=0;i<par.length;i++){
				art.dialog.removeData(par[i]);
			}
		}
		setDataChilds = [];
	}
	//父页面获取子页面数据
	function getDateChild(){
		var parm={};
		var par = setDataChilds;
		if(par==null||par.length>0){
			for(var i=0;i<par.length;i++){
				var names=par[i].substring(1);//
				parm[names]=art.dialog.data(par[i]);
			}
		}
		return parm;
	}
	/**
	 * title：标题
	 * content：内容
	 * isShade : 是否有背景
	**/
	//普通弹出框
	function dialogs(title,content,isShade,time,icon,width,height,isDrag){
		art.dialog({
			id:"oneId",
		    title: title,
		    content: content,
		    lock: isShade,
		    time: time,
		    width:width,
		    height:height,
		    icon:icon,
		    fixed: true,
		});
	}
	
	//气泡复层 在指定id下弹出只想该id的小窗口
	function dialogForBubble(id,content,isShade){
		art.dialog({
			follow: document.getElementById(id),
			content: content,
			lock:isShade
		});
		
	}
	/**
	 * title：标题
	 * content：内容
	 * isShade : 是否有背景
	 * fn1：右按钮的调用方法
	 * fn1title：右按钮的名称
	 * fn2：左按钮的调用方法
	 * fn2title：左按钮的名称
	 * width ：窗口宽度
	 * height ： 窗口高度
	**/
	//自定义按钮
	function dialogForButton(title,content,isShade,fn1,fn1title,fn2,fn2title,width,height){
		if(fn1==null||fn1==""||fn1==undefined)
			fn1=function () {}
		if(fn2==null||fn2==""||fn2==undefined)
			fn2=function () {}
		if(fn1title==null||fn1title==""||fn1title==undefined)
			fn1title = "确定"
		if(fn2title==null||fn2title==""||fn2title==undefined)
			fn2title = "取消"
		art.dialog({
		    title: title,
		    content: content,
		    okValue: fn1title,
		    ok: fn1,
		    width:width,
		    height:height,
		    cancelValue: fn2title,
		    cancel: fn2,
		    lock:isShade
		});
	}
	/**
	 * html : 左下角html
	**/
	//给对话框左下脚添加元素
	function dialogForOther(title,content,isShade,html){
		var d =  art.dialog({
		    title: title,
		    okValue: '确定',
		    content: content,
		    ok: function () {},
		    statusbar: html,
		    lock:isShade
		});
	}
	//充满整个弹出框 无边距 如展示图片与视频
	function fullDialog(title,content){
		art.dialog({
			padding: 0,
		    title: title,
			content: content,
		    lock: true
		});
	}
	//右下角弹出框
	function bmrtDialg(title,content,width,height,time){
		art.dialog({
		    id: 'msg',
		    title: title,
		    content: content,
		    width: width,
		    height: height,
		    left: '100%',
		    top: '100%',
		    fixed: true,
		    drag: false,
		    resize: false,
		    time:time
		})
	}
	function artClose(){
		art.dialog.close();
	}