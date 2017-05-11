$(function() {
	var appElement = document.querySelector('[ng-controller=controller]');
	var $scope = angular.element(appElement).scope();
	if ($scope != undefined) {
		if (parent.menubuttons != undefined) {
			for (var i = 0; i < parent.menubuttons.length; i++) {
				if (parent.menubuttons[i].code == "info") {
					$scope.isShowInfo = true;
				}
				if (parent.menubuttons[i].code == "update") {
					$scope.isShowUpdate = true;
				}
				if (parent.menubuttons[i].code == "delete") {
					$scope.isShowDelete = true;
				}
				if (parent.menubuttons[i].code == "searchlist") {
					$scope.isSearchList = true;
				}
				if (parent.menubuttons[i].code == "sava") {
					$scope.isSava = true;
				}
				if (parent.menubuttons[i].code == "post") {
					$scope.isPost = true;
				}
				if (parent.menubuttons[i].code == "cancel") {
					$scope.isCancel = true;
				}
				if (parent.menubuttons[i].code == "turncustomer") {
					$scope.isTurncustomer = true;
				}
				if (parent.menubuttons[i].code == "updateresponsible") {
					$scope.isUpdateresponsible = true;
				}
				if (parent.menubuttons[i].code == "export") {
					$scope.isExport = true;
				}
				if (parent.menubuttons[i].code == "import") {
					$scope.isImport = true;
				}
			}
		}

	}

})

/* 请求失败响应处理 */
function response(status) {
	if (status == 401) {
		parent.art.dialog({
			content : '登陆用户已过期,请重新登陆系统！',
			lock : true,
			time : 2,
			ok : function() {
				parent.onLogin();
			},
		});
		parent.onLogin();
	} else if (status == 400) {
		parent.art.dialog({
			content : '请求资源地址错误，请联系网络管理员！',
			lock : true,
			time : 2,
			ok : function() {
			},
		});
	} else if (status == 404) {
		parent.art.dialog({
			content : '请求资源已经不存在，请联系网络管理员！',
			lock : true,
			time : 2,
			ok : function() {
			},
		});
	} else if (status == 405) {
		parent.art.dialog({
			content : '请求资源方法不正确，请联系网络管理员！',
			lock : true,
			time : 2,
			ok : function() {
			},
		});
	} else if (status == 406) {
		parent.art.dialog({
			content : '服务器不能理解的请求，请联系网络管理员！',
			lock : true,
			time : 2,
			ok : function() {
			},
		});
	} else if (status == 408) {
		parent.art.dialog({
			content : '请求超时，请联系网络管理员！',
			lock : true,
			time : 2,
			ok : function() {
			},
		});
	} else if (status == 415) {
		parent.art.dialog({
			content : '请求的参数格式错误，请联系网络管理员！',
			lock : true,
			time : 2,
			ok : function() {
			},
		});
	} else if (status == 500) {
		parent.art.dialog({
			content : '服务器出现异常了，请联系网络管理员！',
			lock : true,
			time : 2,
			ok : function() {
			},
		});
	}
}
