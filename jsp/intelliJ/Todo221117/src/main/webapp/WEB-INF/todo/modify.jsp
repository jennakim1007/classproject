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

    <h1>수정하기</h1>
    <form method="post">
        <table>
            <tr>
                <td>번호</td>
                <td><input type="text" name="tno" value="${param.tno}" readonly></td>
            </tr>
            <tr>
                <td>할일</td>
                <td><input type="text" name="todo" value="${todo.todo}" > </td>
            </tr>
            <tr>
                <td>기한</td>
                <td><input type="date" name="dueDate" value="${todo.dueDate}" > </td>
            </tr>
            <tr>
                <td>완료여부</td>
                <td><input type="checkbox" name="finished" value=${todo.finished eq true? 'checked' : ''} > </td>
            </tr>
            <tr>
                <td></td>
                <td>
                    <input type="reset">
                    <input type="submit" value="수정하기">
                </td>
            </tr>
        </table>
    </form>

    <form action="/todo/remove" method="post">
        <input type="hidden" name="tno" value="${param.tno}">
        <input type="submit" value="삭제하기">
    </form>

    <a href="/todo/list">목록으로 돌아가기</a>

</body>
</html>
