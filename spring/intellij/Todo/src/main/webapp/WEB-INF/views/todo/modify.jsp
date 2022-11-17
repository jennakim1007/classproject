<%--
  Created by IntelliJ IDEA.
  User: cheoho-hi
  Date: 2022-11-17
  Time: 오후 5:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Modify Todo</title>
</head>
<body>

    <h1>할 일 수정하기</h1>
    <form method="post">
        <table>
            <tr>
                <td>번호</td>
                <td><input type="text" name="tno" value="" readonly></td>
            </tr>
            <tr>
                <td>할일 </td>
                <td><input type="text" name="todo" value="" > </td>
            </tr>
            <tr>
                <td>기한 </td>
                <td><input type="date" name="dueDate" value="" > </td>
            </tr>
            <tr>
                <td>상태 </td>
                <td><input type="checkbox" name="finished" value="1"> </td>
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
        <input type="hidden" name="tno" value="">
        <input type="submit" value="삭제하기">
    </form>

    <a href="/todo">목록으로 돌아가기</a>

</body>
</html>
