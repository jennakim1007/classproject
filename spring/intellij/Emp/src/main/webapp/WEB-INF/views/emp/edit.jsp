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
</head>
<body>

  <h1>사원 수정</h1>

  <form method="post">
    <table>
      <tr>
        <td>사원번호</td>
        <td><input type="number" name="empno" id="empno" value="${emp.empno}" disabled></td>
      </tr>
      <tr>
        <td>사원이름</td>
        <td><input type="text" name="ename" id="ename" value="${emp.ename}"></td>
      </tr>
      <tr>
        <td>직급</td>
        <td><input type="text" name="job" id="job" value="${emp.job}"></td>
      </tr>
      <tr>
        <td>관리자</td>
        <td><input type="number" name="mgr" id="mgr" value="${emp.mgr}"></td>
      </tr>
      <tr>
        <td>입사일</td>
        <td><input type="date" name="hiredate" id="hiredate" value="${emp.hiredate}"></td>
      </tr>
      <tr>
        <td>급여</td>
        <td><input type="number" name="SAL" id="SAL" value="${emp.sal}"></td>
      </tr>
      <tr>
        <td>보너스</td>
        <td><input type="number" name="comm" id="comm" value="${emp.comm}"></td>
      </tr>
      <tr>
        <td>부서번호</td>
        <td>
          <select name="deptno" id="deptno">
            <option>10</option>
            <option>20</option>
            <option>30</option>
            <option>40</option>
          </select>
        </td>
      </tr>
      <tr>
        <td></td>
        <td><input type="reset" value="초기화"><input type="submit" value="수정"></td>
      </tr>
    </table>
  </form>

</body>
</html>
