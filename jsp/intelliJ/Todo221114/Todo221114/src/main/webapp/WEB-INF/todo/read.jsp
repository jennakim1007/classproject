<%--
  Created by IntelliJ IDEA.
  User: cheoho-hi
  Date: 2022-11-14
  Time: 오전 11:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Todo Read</title>
</head>
<body>

    <h1>상세보기</h1>

    <table>
        <tr>
            <td>번호</td>
            <td><input type="text" name="tno" value="${param.tno}" readonly></td>
        </tr>
        <tr>
            <td>할 일</td>
            <td><input type="text" name="todo" id="todo" value="${tno.todo}" readonly></td>
        </tr>
        <tr>
            <td>기한</td>
            <td><input type="date" name="dueDate" id="dueDate" value="${todo.dueDate}" readonly></td>
        </tr>
        <tr>
            <td>상태</td>
            <td><input type="checkbox" name="finished" id="finished" ${todo.finished ? 'checked' : ''} disabled></td>
        </tr>
    </table>

    <a href="/todo/modify?tno=${param.tno}">수정/삭제</a>
    <a href="/todo/list">목록으로 돌아가기</a>

</body>
</html>
