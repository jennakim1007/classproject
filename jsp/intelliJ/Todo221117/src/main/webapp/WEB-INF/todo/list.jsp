<%--
  Created by IntelliJ IDEA.
  User: jenna
  Date: 2022-11-17
  Time: 오후 8:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>Title</title>
</head>
<body>

    <h1>Todo</h1>

    <table border="1">
        <tr>
            <td>번호</td>
            <td>할일</td>
            <td>기한</td>
            <td>완료여부</td>
        </tr>

        <c:forEach var="list" items="${list}">
        <tr>
            <td>${list.tno}</td>
            <td><a href="/todo/read?tno=${list.tno}">${list.todo}</a></td>
            <td>${list.dueDate}</td>
            <td>${list.finished eq true? '완료' : '진행중'}</td>
        </tr>
        </c:forEach>













    </table>

    <a href="/todo/register">Todo 등록하기</a>

</body>
</html>
