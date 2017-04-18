var setting = {
			view: {
				dblClickExpand: false
			},
			data: {
				simpleData: {
					enable: true
				}
			},
			callback: {
				beforeClick: beforeClick,
				onClick: onClick
			}
		};

		var zNodes;
		var bool =false;
		var controlId = "";
		function beforeClick(treeId, treeNode) {
			if(!bool){
				var check = (treeNode);
				if (!check)
				{ alert("只能选择楼栋...")}
				else{
					if(controlId != null && controlId.length > 0)
					{
						document.getElementById(controlId+"select").style.display="none";
						document.getElementById(controlId+"purge").style.display="inline";	
					}
					else
					{
						document.getElementById("select").style.display="none";
						document.getElementById("purge").style.display="inline";	
					}
					//document.getElementById("purge").style.marginTop="-25px";
					//document.getElementById("purge").style.marginLeft="295px";
				}
			return check;
			}else if(bool){
				var check = (treeNode && !treeNode.isParent);
				if (!check)
				{ alert("只能选择楼栋...")}
				else{
					if(controlId != null && controlId.length > 0)
					{
						document.getElementById(controlId+"select").style.display="none";
						document.getElementById(controlId+"purge").style.display="inline";				
					}
					else
					{
						document.getElementById("select").style.display="none";
						document.getElementById("purge").style.display="inline";	
					}
					//document.getElementById("purge").style.marginTop="-25px";
					//document.getElementById("purge").style.marginLeft="295px";
				}
			return check;
			}
		}
		
		function onClick(e, treeId, treeNode) {
			var zTree = $.fn.zTree.getZTreeObj("treeDemo"),
			nodes = zTree.getSelectedNodes(),
			v = "";
			pqid = "";
			nodes.sort(function compare(a,b){return a.id-b.id;});
			for (var i=0, l=nodes.length; i<l; i++) {
				v += nodes[i].name + ",";
				pqid += nodes[i].pqId + ",";
			}
			if (v.length > 0 ) v = v.substring(0, v.length-1);
			if (pqid.length > 0) pqid = pqid.substring(0,pqid.length-1);
			var cityObj = $("#citySel");
			cityObj.attr("value", v);
			var pqidObj = $("#pqid");
			pqidObj.attr("value",pqid);
			hideMenu();
		}

		function showMenu() {
			var cityObj = $("#citySel");
			var cityOffset = $("#citySel").offset();
			$("#menuContent").css({left:cityOffset.left + "px", top:cityOffset.top + cityObj.outerHeight() + "px"}).slideDown("fast");

			$("body").bind("mousedown", onBodyDown);
			$.fn.zTree.init($("#treeDemo"), setting, zNodes);
			var treeObj = $.fn.zTree.getZTreeObj("treeDemo");
			treeObj.expandAll(false); 
		}
		
		function codeMenu() {
			var cityObj = $("#citySel");
			var cityOffset = $("#citySel").offset();
			$("#menuContent").css({left:cityOffset.left + "px", top:cityOffset.top + cityObj.outerHeight() + "px"}).slideDown("fast");

			$("body").bind("mousedown", onBodyDown);
			$.fn.zTree.init($("#treeDemo"), setting, zNodes);
			var treeObj = $.fn.zTree.getZTreeObj("treeDemo");
			treeObj.expandAll(false); 
		}
		function showMenuInfo(info)
		{
			controlId = info;
			var cityObj = $("#"+info);
			var cityOffset = $("#"+info).offset();
			$("#menuContent").css({left:cityOffset.left + "px", top:cityOffset.top + cityObj.outerHeight() + "px"}).slideDown("fast");

			$("body").bind("mousedown", onBodyDown);
			$.fn.zTree.init($("#treeDemo"), setting, zNodes);
			var treeObj = $.fn.zTree.getZTreeObj("treeDemo");
			treeObj.expandAll(false); 
		}
		function hideMenu() {
			$("#menuContent").fadeOut("fast");
			$("body").unbind("mousedown", onBodyDown);
		}
		function onBodyDown(event) {
			if (!(event.target.id == "menuBtn" || event.target.id == "menuContent" || $(event.target).parents("#menuContent").length>0)) {
				hideMenu();
			}
		}

		$(document).ready(function(){
			//$.fn.zTree.init($("#treeDemo"), setting, zNodes);
		});
		
		function onClickPurgeInfo(info){
			document.getElementById(info).value="";
			document.getElementById(info+"select").style.display="inline";
			document.getElementById(info+"purge").style.display="none";
		}
		
		function onClickPurge(){
			document.getElementById("citySel").value="";
			document.getElementById("select").style.display="inline";
			document.getElementById("purge").style.display="none";
			
			//document.getElementById("select").style.marginTop="-25px";
			//document.getElementById("select").style.marginLeft="295px";
		}
		
	function dealTree()
	{
		var list =  jsonrpc.call("com.yaao.cis.socialMgr.communityFloor.service.FloorService",
				"getFloorParent",null,[]);
			var info = "";
			var last = list.length - 1;
			if( list.length > 0 )
			{
				for(var i = 0; i < list.length; i++)
				{
					info += "{id:"+list[i].id+",pId:"+list[i].pid+",name:'"+list[i].pqmc+"',open:"+list[i].open+"}";
					if(i == last)
					{
						break;
					}
					else
					{
						info += ",";
					}
				}
				eval("zNodes = ["+info+"]");
			}
			else
			{
				zNodes = [];
			}
			
	}