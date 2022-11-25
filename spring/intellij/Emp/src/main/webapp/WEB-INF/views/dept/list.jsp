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
<body class="bg-light">

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

    <main role="main" class="container">

        <div class="d-flex align-items-center p-3 my-3 text-white-50 bg-dark rounded box-shadow">
            <div class="lh-100">
                <h6 class="mb-0 text-white lh-100 mb-2">부서 리스트</h6>
                <small>부서를 등록, 수정, 삭제 합니다.</small>
            </div>
        </div>


    <table class="table table-hover">
        <thead class="thead-light">
        <tr>
            <th>부서번호</th>
            <th>부서이름</th>
            <th>부서위치</th>
            <th>관리</th>
        </tr>
        </thead>

        <c:forEach items="${deptList}" var="dept">
        <tr>
                <th>${dept.deptno}</th>
                <th>${dept.dname}</th>
                <th>${dept.loc}</th>
                <th><a class="btn btn-outline-primary" href="/dept/edit?deptno=${dept.deptno}">수정</a>
                    <a class="btn btn-outline-danger" href="/dept/delete?deptno=${dept.deptno}">삭제</a>
                </th>
            </tr>
        </c:forEach>
    </table>

    <a class="btn btn-primary" href="/dept/register">부서 등록</a>

    </main>

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
