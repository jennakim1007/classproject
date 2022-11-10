<%--
  Created by IntelliJ IDEA.
  User: jenna
  Date: 2022-11-10
  Time: 오후 10:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Read Todo</title>
</head>
<body>

<input type="text" name="title" id="">
<input type="date" name="date" value="2022.11.10">
<a href="/todo/modify?no=${param.no}">Modify/Remove</a>
<a href="/todo/list">List</a>

</body>
</html>
