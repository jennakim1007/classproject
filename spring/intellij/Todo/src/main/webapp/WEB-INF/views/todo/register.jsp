<%--
  Created by IntelliJ IDEA.
  User: cheoho-hi
  Date: 2022-11-17
  Time: 오후 4:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Register Todo</title>
</head>
<body>

<h1>할 일 등록</h1>

    <form method="post">
        <table>
            <tr>
                <td>할 일</td>
                <td><input type="text" name="todo" id="todo" placeholder="할 일을 입력하세요."></td>
            </tr>
            <tr>
                <td>기한</td>
                <td><input type="date" name="dueDate" id="dueDate"></td>
            </tr>
            <tr>
                <td></td>
                <td><input type="reset"><input type="submit" value="할 일 등록"></td>
            </tr>
        </table>
    </form>

<a href="/todo">목록으로 돌아가기</a>

</body>
</html>
