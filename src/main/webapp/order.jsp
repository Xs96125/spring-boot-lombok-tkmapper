<%@page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" %>
<%@page isELIgnored="false" %>
<html>
    <head>
        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/easyUI/themes/default/easyui.css">
        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/easyUI/themes/icon.css">
        <script type="text/javascript" src="${pageContext.request.contextPath }/easyUI/jquery.min.js"></script>
        <script type="text/javascript" src="${pageContext.request.contextPath }/easyUI/jquery.easyui.min.js"></script>
        <script type="text/javascript" src="${pageContext.request.contextPath }/easyUI/easyui-lang-zh_CN.js"></script>
        <script type="text/javascript">
            $(function(){
                $("#orderrrTable").datagrid({
                    url:"${pageContext.request.contextPath }/o/query",
                    striped:true,
                    fitColumns:true

                });

            });
            //为操作添加两个超链接
            function mydeleteeeFormatter(value, row, index){

                return "<a href='javascript:void(0)' onclick='deleteBtn("+row.id+")'>删除订单</a>";

            }


        </script>
    </head>
    <body>
        <table id="orderrrTable">
            <thead>
                <tr>
                    <th data-options="field:'id',width:1">订单编号</th>
                    <th data-options="field:'orderTime',width:1">订单创建时间</th>
                    <th data-options="field:'addressId',width:1">收货人</th>
                    <th data-options="field:'userId',width:1">地址</th>
                    <th data-options="field:'vvv',formatter:mydeleteeeFormatter",width:1">操作</th>

                </tr>
            </thead>

        </table>
    </body>
</html>