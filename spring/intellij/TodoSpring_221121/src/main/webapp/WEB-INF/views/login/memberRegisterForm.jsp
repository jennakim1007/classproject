<%--
  Created by IntelliJ IDEA.
  User: jenna
  Date: 2022-11-21
  Time: 오후 11:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

  <form method="post">
    <table>
      <tr>
        <td>아이디</td>
        <td><input type="text" name="id" id="id"></td>
      </tr>
      <tr>
        <td>비밀번호</td>
        <td><input type="password" name="pw" id="pw"></td>
      </tr>
      <tr>
        <td>이름</td>
        <td><input type="text" name="name" id="name"></td>
      </tr>
      <tr>
        <td>사진</td>
        <td><input type="file" name="profilePic" id="profilePic"></td>
      </tr>
      <tr>
        <td></td>
        <td><input type="submit" value="회원가입"></td>
      </tr>
    </table>
  </form>

</body>
</html>
