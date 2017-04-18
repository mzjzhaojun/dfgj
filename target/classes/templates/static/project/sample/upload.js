function upload(url, fileid, imgvalueid, imgsrcid, result) {// 按钮id 提交地址action
	var fileinput = $('#' + fileid);
	var imgvalueinput = $('#' + imgvalueid);
	var imgsrcinput = $('#' + imgsrcid);
	var interval;
	var up = new AjaxUpload(fileinput, {
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
			imgvalueinput.val(fileurl.url);
			imgsrcinput.attr("src", fileurl.url);
			if (result != "" && result != null && result != undefined) {
				result(fileurl.url);
			}
		}
	});
}