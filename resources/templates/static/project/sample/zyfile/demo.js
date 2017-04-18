/*
www.198zone.com
*/

$(function(){
	// 初始化插件
	$("#demo").zyUpload({
		width            :   "650px",                 // 宽度
		height           :   "100px",                 // 宽度
		itemWidth        :   "120px",                 // 文件项的宽度
		itemHeight       :   "100px",                 // 文件项的高度
		url              :   "http://localhost:18001/dfgj/dfgj/v1/file/list/upload",  // 上传文件的路径
		multiple         :   true,                    // 是否可以多个文件上传
		dragDrop         :   false,                    // 是否可以拖动上传文件
		del              :   true,                    // 是否可以删除文件
		finishDel        :   false,  				  // 是否在上传文件完成后删除预览
		needFlage : "0",//是否必须选择图片0是是，1是否
		uploadInput : $("#button1"),
		/* 外部获得的回调接口 */
		onSuccess : function(response) {
			var data = JSONUTIL.decode(response); // 文件上传成功的回调方法
			if (data.succeed) {
				if (data.statusCode == "200") {
					var url = data.result[0];
					imgurl += url + "|";
				}
			}
		},
		onComplete : function(responseInfo) {
			submitForm(); // 上传完成的回调方法
		}
	},{inputId:"url"});
});

