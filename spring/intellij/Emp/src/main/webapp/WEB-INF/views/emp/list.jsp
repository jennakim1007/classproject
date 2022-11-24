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
</head>
<body>

  <h1>Emp List</h1>
  <hr>

  <a href="/emp/register">사원 등록</a>

    <table border="1">
        <tr>
            <th>사원번호</th>
            <th>사원이름</th>
            <th>직급</th>
            <th>관리자</th>
            <th>입사일</th>
            <th>급여</th>
            <th>보너스</th>
            <th>부서번호</th>
            <th>관리</th>
        </tr>

        <c:forEach items="${empList}" var="emp">
        <tr>
                <th>${emp.empno}</th>
                <th>${emp.ename}</th>
                <th>${emp.job}</th>
                <th>${emp.mgr}</th>
                <th>${emp.hiredate}</th>
                <th>${emp.sal}</th>
                <th>${emp.comm}</th>
                <th>${emp.deptno}</th>
                <th><a href="/emp/edit?empno=${emp.empno}">수정</a>
                    |
                    <a href="/emp/delete?empno=${emp.empno}">삭제</a>
                </th>
            </tr>
        </c:forEach>
    </table>



</body>
</html>
