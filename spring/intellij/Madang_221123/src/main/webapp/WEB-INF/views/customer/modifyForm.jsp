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
    <title>Register</title>
</head>
<body>

  <h1>회원 수정</h1>

  <form method="post">
      <table>
          <tr>
              <td>회원번호 : </td>
              <td><input type="number" name="custid" id="custid" value="${customerInfo.custid}" disabled></td>
          </tr>
          <tr>
              <td>이름 : </td>
              <td><input type="text" name="name" id="name" value="${customerInfo.name}"></td>
          </tr>
          <tr>
              <td>주소 : </td>
              <td><input type="text" name="address" id="address" value="${customerInfo.address}"></td>
          </tr>
          <tr>
              <td>전화번호 : </td>
              <td><input type="text" name="phone" id="phone" value="${customerInfo.phone}"></td>
          </tr>
          <tr>
              <td></td>
              <td><input type="reset"><input type="submit" value="수정하기"></td>
          </tr>
      </table>
  </form>

  <a href="/index">홈으로 돌아가기</a>


</body>
</html>
