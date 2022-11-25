<%--
  Created by IntelliJ IDEA.
  User: cheoho-hi
  Date: 2022-11-24
  Time: 오후 4:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
        <html>
<head>
    <title>Title</title>

    <!-- Bootstrap core CSS -->
    <link href="/css/bootstrap/bootstrap.min.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="/css/bootstrap/offcanvas.css" rel="stylesheet">

</head>
<body>

  <h1>Dept List</h1>
  <hr>

  <a href="/dept/register">부서 등록</a>

    <table border="1">
        <tr>
            <th>부서번호</th>
            <th>부서이름</th>
            <th>부서위치</th>
            <th>관리</th>
        </tr>

        <c:forEach items="${deptList}" var="dept">
        <tr>
                <th>${dept.deptno}</th>
                <th>${dept.dname}</th>
                <th>${dept.loc}</th>
                <th><a class="btn btn-info" href="/emp/edit?empno=${emp.empno}">수정</a>
                    <a class="btn btn-primary" href="/emp/delete?empno=${emp.empno}">삭제</a>
                </th>
            </tr>
        </c:forEach>
    </table>


  <!-- Bootstrap core JavaScript
  ================================================== -->
  <!-- Placed at the end of the document so the pages load faster -->
  <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
  <script>window.jQuery || document.write('<script src="js/assets/vendor/jquery-slim.min.js"><\/script>')</script>
  <script src="js/assets/vendor/popper.min.js"></script>
  <script src="js/bootstrap/bootstrap.min.js"></script>
  <script src="js/assets/js/vendor/holder.min.js"></script>
  <script src="js/bootstrap/offcanvas.js"></script>


</body>
</html>
