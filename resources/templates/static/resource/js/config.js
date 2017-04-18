var sys = {};
sys.loginUrl = "http://localhost:17000/dfgj/login";
sys.loginOutUrl = "http://localhost:17000/dfgj/logout";
sys.accounturl = "http://localhost:17000/dfgj/dfgj/v1/account/user";
sys.sysUrl = "http://localhost:17000/dfgj/dfgj/v1/menu/sysmenu";
sys.fileUrl = "http://localhost:17000/dfgj/dfgj/v1/file";
sys.moreFileUrl = "http://localhost:17000/dfgj/dfgj/v1/file/upload";
sys.KindEditorFileUrl = "http://localhost:17000/dfgj/dfgj/v1/file/kindeditor/uploadFile";

/*系统配置*/
sys.onesys="";
sys.twosys="";
sys.oneorder = 0;

//临时存储  
var TempCache = {  
    cache:function(value){  
        localStorage.setItem("EasyWayTempCache",value);  
    },  
    getCache:function(){  
        return  localStorage.getItem("EasyWayTempCache");  
    },  
    setItem:function(key,value){  
        localStorage.setItem(key,value);  
    },  
    getItem:function(key){  
        return localStorage.getItem(key);  
    },
    setSessionItem:function(key,value){  
    	sessionStorage.setItem(key,value);  
    },  
    getSessionItem:function(key){  
        return JSON.parse(sessionStorage.getItem(key));  
    },  
    removeItem:function(key){  
        return localStorage.removeItem(key);  
    }  
};  
function initSysConf(op1,op2,op3){
	TempCache.setItem('onesys',op1);
	TempCache.setItem('twosys',op2);
	TempCache.setItem('oneorder',op3);
}
function getSysConf(){
	onesys = TempCache.getItem('onesys');
	twosys = TempCache.setItem('twosys');
	oneorder = TempCache.setItem('oneorder');
}
