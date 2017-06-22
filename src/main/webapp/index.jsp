<%--
  Created by IntelliJ IDEA.
  User: PoliceUncle
  Date: 2017/5/15
  Time: 22:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>haha</title>
    <script type="application/javascript" src="js/jquery.min.js"></script>
</head>
<body>
    <button id="myButton">试试</button>
    <table id="myTable">
        <tr>
            <td>编号</td>
            <td>主机名</td>
            <td>ip地址</td>
            <td>端口号</td>
            <td>连接状态</td>
            <td>服务</td>
        </tr>
    </table>
</body>
<script type="application/javascript">
    $("#myButton").on("click",function () {
        $.ajax({
            url:'${pageContext.request.contextPath}/yinmeizi/hostStation.do',
            type:'GET', //GET
            async:true,    //或false,是否异步
            timeout:5000,    //超时时间
            dataType:'json',    //返回的数据格式：json/xml/html/script/jsonp/text
            success:function(data,textStatus,jqXHR){
                console.log(data)
                var table = $("#myTable")
                var tr = $("<tr></tr>");
                $.each(data, function (index, element) {
                    var td = $("<td>"+element+"</td>");
                    td.appendTo(tr);
                });
                tr.appendTo(table);
            }
        })
    })
</script>
</html>
