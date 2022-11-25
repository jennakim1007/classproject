<%--
  Created by IntelliJ IDEA.
  User: cheoho-hi
  Date: 2022-11-24
  Time: 오후 4:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>

  <!-- Bootstrap core CSS -->
  <link href="/css/bootstrap/bootstrap.min.css" rel="stylesheet">

  <!-- Custom styles for this template -->
  <link href="/css/bootstrap/offcanvas.css" rel="stylesheet">

</head>
<body>

  <nav class="navbar navbar-expand-lg fixed-top navbar-dark bg-dark">
    <a class="navbar-brand mr-auto mr-lg-0" href="#">OFFICE MANAGER</a>
    <button class="navbar-toggler p-0 border-0" type="button" data-toggle="offcanvas">
      <span class="navbar-toggler-icon"></span>
    </button>
  </nav>

  <div class="nav-scroller bg-white box-shadow">
    <nav class="nav nav-underline">
      <a class="nav-link active" href="/dept/list">부서 관리</a>
      <a class="nav-link" href="/emp/list">직원 관리</a>
    </nav>
  </div>

  <form method="post">
    <table>
      <tr>
        <td>부서번호</td>
        <td><input type="number" name="deptno" id="deptno" value="${dept.deptno}" disabled></td>
      </tr>
      <tr>
        <td>부서이름</td>
        <td><input type="text" name="dname" id="dname" value="${dept.dname}"></td>
      </tr>
      <tr>
        <td>부서위치</td>
        <td><input type="text" name="loc" id="loc" value="${dept.loc}"></td>
      </tr>
      <tr>
        <td></td>
        <td><input type="reset" value="초기화"><input type="submit" value="수정"></td>
      </tr>
    </table>
  </form>

</body>
</html>
