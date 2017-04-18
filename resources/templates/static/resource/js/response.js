/*请求失败响应处理*/

function response(status,result){
	
	//未登录
	if(status==401){
		parent.onLogin();
	}
	//异常
	else if(status==500){
		parent.art.dialog({
			content: '服务器异常，请稍后重试！',
			lock:true,
			time:2
		});
	}/*
	//资源未找到
	else if(status==404){
		
	}
	//插入出错
	else if(status==460){
		
	}
	//插入资源因为另一种原因出错
	else if(status==461){
		
	}
	//更新出错
	else if(status==462){
		
	}
	//请求的资源的当前资源之间存在冲突（资源已经被修改）
	else if(status==463){
		
	}
	//删除出错
	else if(status==464){
		
	}
	//删除因为条件不满足出错（有关联关系不可以删除）
	else if(status==465){
		
	}*/
	//回调
	if (result != "" && result != null && result != undefined) {
		result();
	}
}
/*
 * 请求成功响应处理
 * 0：成功
 * 1：失败
 * 2：存在关联
 */
/*function responseSuccess(status,result){
	
	//回调
	if (result != "" && result != null && result != undefined) {
		result();
	}
}*/