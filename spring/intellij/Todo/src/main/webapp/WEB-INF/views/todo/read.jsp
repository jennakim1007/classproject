<%--
  Created by IntelliJ IDEA.
  User: cheoho-hi
  Date: 2022-11-17
  Time: 오후 5:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Read Todo</title>
</head>
<body>
<h1>상세보기</h1>

    <table>
        <tr>
            <td>번호</td>
            <td><input type="text" name="tno" value="" readonly></td>
        </tr>
        <tr>
            <td>할 일</td>
            <td><input type="text" name="todo" id="todo" value="" readonly></td>
        </tr>
        <tr>
            <td>기한</td>
            <td><input type="date" name="dueDate" id="dueDate" value="" readonly></td>
        </tr>
        <tr>
            <td>상태</td>
            <td><input type="checkbox" name="finished" id="finished" ${todo.finished ? 'checked' : ''} disabled></td>
        </tr>
    </table>

    <a>수정/삭제</a>
    <a>목록으로 돌아가기</a>

</body>
</html>
