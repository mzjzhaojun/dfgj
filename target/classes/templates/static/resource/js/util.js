//绑定angular不能自动装配的文本框对应的数据
function initbind(param){
	var appElement = document.querySelector('[ng-controller='+param+']');
	var $scope = angular.element(appElement).scope();
	var bindEle = $(document).find(".inputchange");
	var len = bindEle.length;
	for(var i = 0;i<len;i++){
		var model = $(bindEle[i]).attr("ng-model");
		model = model.substr(9,model.length);
		$scope.formData[model] = $(bindEle[i]).val();
	}
}
//比较两个日期大小
function dateCompare(startdate,enddate){   
	  var arr=startdate.split("-");    
	  var starttime=new Date(arr[0],arr[1],arr[2]);    
	  var starttimes=starttime.getTime();
	    
	  var arrs=enddate.split("-");    
	  var lktime=new Date(arrs[0],arrs[1],arrs[2]);    
	  var lktimes=lktime.getTime();   
	  if(starttimes>=lktimes)    
		  return false;   
	  else  
		  return true;   
}  