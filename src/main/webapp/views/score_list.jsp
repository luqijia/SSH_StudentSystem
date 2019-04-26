<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html>
<head>
<%
	pageContext.setAttribute("APP_PATH", request.getContextPath());
%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="renderer" content="webkit|ie-comp|ie-stand">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport"
	content="width=device-width,initial-scale=1,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no" />
<meta http-equiv="Cache-Control" content="no-siteapp" />
<!--[if lt IE 9]>
<script type="text/javascript" src="lib/html5shiv.js"></script>
<script type="text/javascript" src="lib/respond.min.js"></script>
<![endif]-->
<link rel="stylesheet" type="text/css"
	href="${APP_PATH}/static/h-ui/css/H-ui.min.css" />
<link rel="stylesheet" type="text/css"
	href="${APP_PATH}/static/h-ui.admin/css/H-ui.admin.css" />
<link rel="stylesheet" type="text/css"
	href="${APP_PATH}/static/lib/Hui-iconfont/1.0.8/iconfont.css" />
<link rel="stylesheet" type="text/css"
	href="${APP_PATH}/static/h-ui.admin/skin/default/skin.css" id="skin" />
<link rel="stylesheet" type="text/css"
	href="${APP_PATH}/static/h-ui.admin/css/style.css" />
<!--[if IE 6]>
<script type="text/javascript" src="lib/DD_belatedPNG_0.0.8a-min.js" ></script>
<script>DD_belatedPNG.fix('*');</script>
<![endif]-->
<title>用户管理</title>
</head>
<body>
	<nav class="breadcrumb">
		<i class="Hui-iconfont">&#xe67f;</i> 首页 <span class="c-gray en">&gt;</span>
		成绩管理 <span class="c-gray en">&gt;</span> 成绩列表 <a
			class="btn btn-success radius r"
			style="line-height: 1.6em; margin-top: 3px"
			href="javascript:location.replace(location.href);" title="刷新"><i
			class="Hui-iconfont">&#xe68f;</i></a>
	</nav>
	<div class="page-container">

		<div class="cl pd-5 bg-1 bk-gray mt-20">
			<span class="l"><a href="javascript:;"
				onclick="member_add('添加成绩','score_add.jsp','','510')"
				class="btn btn-primary radius"><i class="Hui-iconfont">&#xe600;</i>
					添加成绩</a></span> <span class="r">共有数据：<strong id="recordsTotal"></strong> 条
			</span>
		</div>
		<div class="mt-20">
			<table
				class="table table-border table-bordered table-hover table-bg table-sort"
				id="students_table">
				<thead>
					<tr class="text-c">
						<th width="25"><input type="checkbox" name="" value=""></th>
						<th>学号</th>
						<th>姓名</th>
						<th>班级</th>
						<th>院系</th>
						<th>课程名称</th>
						<th>授课老师</th>
						<th>分数</th>
						<th>操作</th>
					</tr>
				</thead>
			</table>
		</div>
	</div>
	<!--_footer 作为公共模版分离出去-->
	<script type="text/javascript"
		src="${APP_PATH}/static/lib/jquery/1.9.1/jquery.min.js"></script>
	<script type="text/javascript"
		src="${APP_PATH}/static/lib/layer/2.4/layer.js"></script>
	<script type="text/javascript"
		src="${APP_PATH}/static/h-ui/js/H-ui.min.js"></script>
	<script type="text/javascript"
		src="${APP_PATH}/static/h-ui.admin/js/H-ui.admin.js"></script>
	<!--/_footer 作为公共模版分离出去-->

	<!--请在下方写此页面业务相关的脚本-->
	<script type="text/javascript"
		src="${APP_PATH}/static/lib/My97DatePicker/4.8/WdatePicker.js"></script>
	<script type="text/javascript"
		src="${APP_PATH}/static/lib/datatables/1.10.0/jquery.dataTables.min.js"></script>
	<script type="text/javascript"
		src="${APP_PATH}/static/lib/laypage/1.2/laypage.js"></script>
	<script type="text/javascript">
$(function(){
	$('#students_table').DataTable({
		"bProcessing" : true, //DataTables载入数据时，是否显示‘进度’提示 
		"bServerSide" : false, //是否启动服务器端数据导入,包括过滤的内容也是由服务器端返回的(从当前数据中检索也是发送请求到服务器来得到数据),这里不需要,因此设置为false,如果为true,则客户端的过滤效果会失效
		"bStateSave" : true, //是否打开客户端状态记录功能,此功能在ajax刷新纪录的时候不会将个性化设定回复为初始化状态 
        "aaSorting": [[ 1, "asc" ]],//默认第几个排序
        "bFilter" : true, //是否启动过滤、搜索功能
        "sAjaxSource": "scoreinfo.action",
        "aoColumnDefs":[
        	{"sClass": "text-c","aTargets":[0,1,2,3,4,5,6,7,8]},
        	{"orderable":false,"aTargets":[0,2,4,5,7,8]}// 制定列不参与排序
        ],
        "aoColumns": [
        	{"sDefaultContent": "<input type='checkbox' value='1' name=''/>"},
            { "mData": "studentId"},
            { "mData": "studentName"},
            { "mData": "className"},
            { "mData": "deptName"},
            { "mData": "courseName"},
            { "mData": "teacherName"},
            { "mData": "score"},
            {"sDefaultContent": "<a title='编辑' href='javascript:;' onclick='member_edit(\"编辑\",\"score_edit.jsp\",this,\"\",\"510\")' class='ml-5 edit' style='text-decoration:none'><i class='Hui-iconfont'>&#xe6df;</i></a><a title='删除' href='javascript:;' onclick='member_del(this)' class='ml-5' style='text-decoration:none'><i class='Hui-iconfont'>&#xe6e2;</i></a>"}
        ],
        "fnInitComplete": function(oSettings, json) {  //回调函数
            document.getElementById("recordsTotal").innerText = json.iTotalRecords;
          }
	});
});

/*学生-添加*/
function member_add(title,url,w,h){
	layer_show(title,url,w,h);
}

/*学生-编辑*/
var aData;//用于子页面调用
function member_edit(title,url,_this,w,h){
	var nRow = $(_this).parents('tr')[0];//得到这一行
    aData = $("#students_table").dataTable().fnGetData(nRow);
	layer_show(title,url,w,h);
}

/*学生-删除*/
function member_del(_this){
	var row = $(_this).parents('tr')[0];//得到这一行
    var data = $("#students_table").dataTable().fnGetData(row);
	console.log("member_del.data="+data);
	layer.confirm('确认要删除吗？',function(index){
		$.ajax({
			type: "POST",
			url: "scoreinfodel.action",
			data:data,
			dataType: "json",
			success: function(data){
				$(_this).parents("tr").remove();
				console.log(data);
				layer.msg("已删除!",{icon:1,time:1000});
                location.reload(); //删除成功后重新加载当前页面
			},
			error:function(data) {
				console.log("fail del");
			}
		});		
	});
}
</script>
</body>
</html>