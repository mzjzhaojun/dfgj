/*分页*/

var pageNo = 1;// 当前页
var totalCount = 0;// 总条数
var pageCount = 0;// 总页数
var pageSize = 10;// 每页10条

$(function() {
	var appElement = document.querySelector('[ng-controller=controller]');
	var $scope = angular.element(appElement).scope();

	// 搜索
	$scope.onSearch = function() {
		pageNo = 1;
		$scope.pageList();
	}
	// 首页单击事件
	$(document).delegate("#homePage", "click", function() {
		var homePage_a = $("#homePage").children("a");
		var id = homePage_a.attr("id");
		if (id == "homePage1") {
			pageNo = 1;
			$scope.pageList();
		}
	});
	// 上一页单击事件
	$(document).delegate("#previousPage", "click", function() {
		var previousPage_a = $("#previousPage").children("a");
		var id = previousPage_a.attr("id");
		if (id == "previousPage1") {
			pageNo = pageNo - 1;
			$scope.pageList();
		}
	});
	// 下一页单击事件
	$(document).delegate("#nextPage", "click", function() {
		var nextPage_a = $("#nextPage").children("a");
		var id = nextPage_a.attr("id");
		if (id == "nextPage1") {
			pageNo = pageNo + 1;
			$scope.pageList();
		}
	});
	// 具体页面单击事件
	$(document).on("click", ".pagination>li", function() {
		$(".pagination>li").removeClass("active");
		$(this).addClass("active");
		var nextPage_a = $(this).children("a");
		var id = nextPage_a.attr("id");
		var str = id.substring(0, 8);
		if (str == "nextPage") {
			id = id.substring(8, id.length);
			pageNo = id;
			parent.currentPage = id;
			$scope.pageList();
		}

	});
	// 向下选页数
	$(document)
			.on(
					"click",
					"#next",
					function() {
						var nextPage_a = $(this).children("a");
						var id = nextPage_a.attr("id");
						id = parseInt(id.substring(4, id.length));
						if (id <= parseInt(pageCount)) {
							var html = "";
							var nextPage = 3;
							var start = id - 3;
							html += '<li id="Previous"><a href="javascript:;" id="Previous'
									+ start + '">&laquo;</a></li>';
							var count = 0;// 循环次数
							for (var i = id - 2; i <= id; i++) {
								count++;
								if (count > 3) {
									break;
								} else {
									html += ' <li><a href="javascript:;" id="nextPage'
											+ i + '">' + i + '</a></li>';
								}
								nextPage = i;
							}
							html += '<li id="next"><a href="javascript:;" id="next'
									+ (nextPage + 1) + '" >&raquo;</a></li>';
							$(".pagination").html(html);
						}
					});
	// 向上选页数
	$(document)
			.on(
					"click",
					"#Previous",
					function() {
						var nextPage_a = $(this).children("a");
						var id = nextPage_a.attr("id");
						id = id.substring(8, id.length);
						if (id > 0) {
							var html = "";
							var nextPage = 3;
							var start = id - 1;// 上一页
							html += '<li id="Previous"><a href="javascript:;" id="Previous'
									+ start + '">&laquo;</a></li>';
							var count = 0;// 循环次数
							for (var i = id; i <= id + 3; i++) {
								count++;
								if (count > 3) {
									break;
								} else {
									html += ' <li><a href="javascript:;" id="nextPage'
											+ i + '">' + i + '</a></li>';
								}
								nextPage = i;
							}
							html += '<li id="next"><a href="javascript:;" id="next'
									+ (nextPage + 1) + '" >&raquo;</a></li>';
							$(".pagination").html(html);
						}
					});
	// 尾页单击事件
	$(document).delegate("#shadowe", "click", function() {
		var shadowe_a = $("#shadowe").children("a");
		var id = shadowe_a.attr("id");
		if (id == "shadowe1") {
			pageNo = pageCount;
			$scope.pageList();
		}
	});
	// 跳转
	$(document).delegate(".jump_div", "click", function() {
		var count = $("#jump").val();
		if (!isNaN(count) && count != "") {
			if (count <= pageCount && count >= 1) {
				pageNo = count;
				$scope.pageList();
			}

		}
	});
	// 页数发生改变事件
	$(document).on("change", "#pageSize", function() {
		pageSize = $("#pageSize").val();
		parent.currentPage = 1;
		$scope.pageList();
	});
});

function paging() {

	$("#totalCount").html(totalCount);
	$("#pageNo").html(pageNo);
	$("#pageCount").html(pageCount);
	if (pageNo == 1) {
		var homePage_a = $("#homePage").children("a");
		homePage_a.css("color", "#cccccc");
		homePage_a.attr("id", "homePage2");
		var previousPage_a = $("#previousPage").children("a");
		previousPage_a.css("color", "#cccccc");
		previousPage_a.attr("id", "previousPage2");
	} else if (pageNo > 1) {
		var homePage_a = $("#homePage").children("a");
		homePage_a.css("color", "#616161");
		homePage_a.attr("id", "homePage1");
		var previousPage_a = $("#previousPage").children("a");
		previousPage_a.css("color", "#616161");
		previousPage_a.attr("id", "previousPage1");
	}
	if (pageCount == 1 || pageNo == pageCount) {
		var nextPage_a = $("#nextPage").children("a");
		nextPage_a.css("color", "#cccccc");
		nextPage_a.attr("id", "nextPage2");
		var shadowe_a = $("#shadowe").children("a");
		shadowe_a.css("color", "#cccccc");
		shadowe_a.attr("id", "shadowe2");
	} else if (pageCount > 1) {
		var nextPage_a = $("#nextPage").children("a");
		nextPage_a.css("color", "#616161");
		nextPage_a.attr("id", "nextPage1");
		var shadowe_a = $("#shadowe").children("a");
		shadowe_a.css("color", "#616161");
		shadowe_a.attr("id", "shadowe1");
	}
	var op = '<option value="10">10</option>'
			+ '<option value="20">20</option>'
			+ '<option value="50">50</option>';
	$("#pageSize").html(op);
	$("#pageSize").val(pageSize);
}
function initPage() {
	var totalPage = parseInt(pageCount);
	var currentPage = parseInt(parent.currentPage);
	var nextPage = 3;
	var start = 1;
	start = currentPage != 1 ? currentPage - 1 : currentPage;
	if (currentPage < totalPage) {
		nextPage = currentPage + 1;
	} else {
		nextPage = currentPage;
	}
	if (nextPage < totalPage) {
		nextPage = currentPage != 1 ? nextPage : 3;
	}
	var page = start - 1;
	var html = "";
	html += '<li id="Previous"><a href="#" id="Previous' + page
			+ '">&laquo;</a></li>';
	for (var i = start; i <= nextPage; i++) {
		html += ' <li><a href="#" id="nextPage' + i + '">' + i + '</a></li>';
	}
	html += '<li id="next"><a href="#" id="next' + (nextPage + 1)
			+ '" >&raquo;</a></li>';
	$(".pagination").html(html);
	$("#nextPage" + parent.currentPage).parent().addClass("active");
}
function removeSearch() {
	var appElement = document.querySelector('[ng-controller=controller]');
	var $scope = angular.element(appElement).scope();
	$("body>h5>input").val("");
	$scope.onSearch();
}
