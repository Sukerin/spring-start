<!DOCTYPE html>
<html lang="en">
<head>
    
    
    <meta charset="UTF-8">
    <link rel="stylesheet" href="../css/ui.jqgrid.css" />


    <!-- jquery插件包-必要 -->
    <!-- 这个是所有jquery插件的基础，首先第一个引入 -->
    <script type="text/javascript" src="../js/jquery-1.11.0.min.js"></script>

    <!-- jqGrid插件包-必要 -->
    <script type="text/javascript" src="../js/jquery.jqGrid.min.js"></script>

    <!-- jqGrid插件的多语言包-非必要 -->
    <!-- statictics/js/i18n下还有其他的多语言包，可以尝试更换看效果 -->
    <script type="text/javascript" src="../js/i18n/grid.locale-cn.js"></script>


    <title>Title</title>
</head>
<body>
  休息休息

  <table id="list2"></table>
  <div id="pager2"></div>
  <br>
</body>
<script>
    $(function(){
        //页面加载完成之后执行
        pageInit();
    });
    function pageInit(){
        //创建jqGrid组件
        $("#list2").jqGrid(
                {
                    page:0,
                    url : '/user/',//组件创建完成之后请求数据的url
                    datatype : "json",//请求数据返回的类型。可选json,xml,txt
                    colNames : [ 'id', 'name', 'age', 'imgUrl', 'Tax','Total', 'Notes' ],//jqGrid的列显示名字
                    colModel : [ //jqGrid每一列的配置信息。包括名字，索引，宽度,对齐方式.....
                        {name : 'id',index : 'id',width : 55},
                        {name : 'name',index : 'name',width : 90},
                        {name : 'age',index : 'age',width : 100},
                        {name : 'imgUrl',index : 'imgUrl',width : 80,align : "right"},
                        {name : 'tax',index : 'tax',width : 80,align : "right"},
                        {name : 'total',index : 'total',width : 80,align : "right"},
                        {name : 'note',index : 'note',width : 150,sortable : false}
                    ],
                    rowNum : 10,//一页显示多少条
                    rowList : [ 10, 20, 30 ],//可供用户选择一页显示多少条
                    pager : '#pager2',//表格页脚的占位符(一般是div)的id
//                    sortname : 'id',//初始化的时候排序的字段
//                    sortorder : "desc",//排序方式,可选desc,asc
                    mtype : "get",//向后台请求数据的ajax的类型。可选post,get
                    viewrecords : true,
                    caption : "JSON Example",//表格的标题名字
                    jsonReader:{
                        root: "_embedded.user",  //数据模型
                        page: "page.number",//数据页码
                        total: "page.totalPages",//数据总页码
                        records: "page.totalElements",//数据总记录数
                        repeatitems: false,//如果设为false，则jqGrid在解析json时，会根据name(colmodel 指定的name)来搜索对应的数据元素（即可以json中元素可以不按顺序）
//                        cell: "_embedded.user",//root 中row 行
                        id: "id"//唯一标识/
                    }


                });
        /*创建jqGrid的操作按钮容器*/
        /*可以控制界面上增删改查的按钮是否显示*/
        $("#list2").jqGrid('navGrid', '#pager2', {edit : false,add : false,del : false});
    }
</script>
</html>