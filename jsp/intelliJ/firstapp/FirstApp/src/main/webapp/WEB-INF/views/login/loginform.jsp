<%--
  Created by IntelliJ IDEA.
  User: cheoho-hi
  Date: 2022-11-15
  Time: 오전 11:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<body>

  <h1>로그인</h1>
  <hr>

  <form method="post">

    <table>

      <tr>
        <td>아이디</td>
        <td><input type="text" name="userid" value="${cookie.reID.value}"></td>
      </tr>
      <tr>
        <td>비밀번호</td>
        <td><input type="password" name="pw" id="pw"></td>
      </tr>
      <tr>
       <td></td>
       <td>아이디 저장하기<input type="checkbox" name="idremember" id="idremember" ${cookie.reID.value ne null ? 'checked' : ''}></td>
      </tr>
      <tr>
        <td></td>
       <td>remember-me<input type="checkbox" name="rememberme" id="rememberme"></td>
      </tr>
      <tr>
        <tlopld></tlopld>
        <td><input type="submit" value="로그인"></td>
      </tr>


    </table>


  </form>



</body>
</html>
