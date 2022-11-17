<%--
  Created by IntelliJ IDEA.
  User: jenna
  Date: 2022-11-17
  Time: 오후 8:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

    <h1>상세보기</h1>

    <table>
        <tr>
            <td>번호</td>
            <td><input type="text" name="tno" value="${todo.tno}" readonly></td>
        </tr>
        <tr>
            <td>할일</td>
            <td><input type="text" name="todo" value="${todo.todo}" readonly> </td>
        </tr>
        <tr>
            <td>기한</td>
            <td><input type="date" name="dueDate" value="${todo.dueDate}" readonly> </td>
        </tr>
        <tr>
            <td>완료여부</td>
            <td><input type="checkbox" name="finished" ${todo.finished? 'checked' : ''} disabled> </td>
        </tr>
    </table>

    <a href="/todo/modify?tno=${param.tno}">수정/삭제</a> <a href="/todo/list">목록으로 돌아가기</a>


</body>
</html>
