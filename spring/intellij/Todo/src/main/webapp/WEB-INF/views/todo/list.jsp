<%--
  Created by IntelliJ IDEA.
  User: cheoho-hi
  Date: 2022-11-17
  Time: 오후 4:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Todo List</title>
</head>
<body>

<h1>Todo List</h1>

    <table border="1">
        <tr>
            <th>번호</th>
            <th>할 일</th>
            <th>기한</th>
            <th>완료여부</th>
        </tr>
        <tr>
            <td>번호 테스트</td>
            <td><a href="/todo/modify">할 일 테스트</a></td>
            <td>기한 테스트</td>
            <td>완료여부 테스트</td>
        </tr>
    </table>

    <a href="/todo/register">할 일 등록</a>



</body>
</html>
