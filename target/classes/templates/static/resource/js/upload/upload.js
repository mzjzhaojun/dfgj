function upload(url, inpHideId, imgsrcid,viewArea) {// 参数1请求地址，参数2隐藏域用于放地址，参数3触发弹出事件，参数4显示区
	var inputId = $('#' + inpHideId);
	var imgsrcinput = $('#' + imgsrcid);
	var viewplace = $("#"+viewArea);
	var interval;
	var up = new AjaxUpload(imgsrcinput, {
		action : url,
		name : 'file',
		data : {
			'url' : imgsrcinput.attr("src")
		},
		onSubmit : function(file, ext) {
			up.setData({
				'url' : imgsrcinput.attr("src")
			});
			this.disable();
			interval = window.setInterval(function() {
			}, 200);
		},
		onComplete : function(file, response) {
			window.clearInterval(interval);
			this.enable();
			response = response.substring(response.indexOf("{"),response.indexOf("}")+1);
	        var fileurl=JSON.parse(response);
	        inputId.val(fileurl.url);
			imgsrcinput.attr("src", fileurl.url);
			viewplace.attr("src", fileurl.url);
		}
	});
}