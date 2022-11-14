<%--
  Created by IntelliJ IDEA.
  User: cheoho-hi
  Date: 2022-11-14
  Time: 오전 11:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri ="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>Todo List</title>
    <style>
        td{
            padding: 5px 10px;
        }
    </style>
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
        <c:forEach items="${list}" var="list">
        <tr>
            <td>${list.tno}</td>
            <td>${list.todo}</td>
            <td>${list.dueDate}</td>
            <td>${list.finished}</td>
        </tr>
        </c:forEach>
    </table>

<a href="/todo/register">할 일 등록</a>



</body>
</html>
