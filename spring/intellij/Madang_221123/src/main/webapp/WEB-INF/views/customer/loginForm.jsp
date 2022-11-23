<%--
  Created by IntelliJ IDEA.
  User: cheoho-hi
  Date: 2022-11-23
  Time: 오후 12:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

    <h1>로그인</h1>

    <form method="post">
        <table>
            <tr>
                <td>회원번호 : </td>
                <td><input type="number" name="custid" id="custid"></td>
            </tr>
            <tr>
                <td>이름 : </td>
                <td><input type="text" name="name" id="name"></td>
            </tr>
            <tr>
                <td></td>
                <td><input type="reset"><input type="submit" value="로그인"></td>
            </tr>
        </table>
    </form>

    <a href="/index">홈으로 돌아가기</a>


</body>
</html>
