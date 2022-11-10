<%--
  Created by IntelliJ IDEA.
  User: jenna
  Date: 2022-11-10
  Time: 오후 10:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>할 일 수정</title>
</head>
<body>

<form method="post">

    <input type="text" name="title">
    <input type="date" name="date" id="2022-11-10">
    <br>
    <input type="submit" value="modify">
</form>

<form action="/todo/remove" method="post">
    <input type="submit" value="remove">
</form>


</body>
</html>
