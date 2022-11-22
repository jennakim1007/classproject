<%--
  Created by IntelliJ IDEA.
  User: cheoho-hi
  Date: 2022-11-18
  Time: 오전 10:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <style>
        img {
            height: 40px;
        }
    </style>
</head>
<body>

    <h1>Todo Project</h1>

    <p>프로젝트 설명</p>

    <ul>
        <li>프로젝트 이름 : </li>
        <li>프로젝트 기능 : </li>
        <li><a href="/todo/list">Todo List</a></li>

        <c:if test="${loginInfo eq null}">
        <li><a href="/login">로그인</a></li>
        <li><a href="/member/register">회원 가입</a></li>
        </c:if>

        <c:if test="${loginInfo ne null}">
        <li>ID : ${loginInfo.uid}</li>
        <li>Name : ${loginInfo.uname}</li>
        <li>Photo :
            <%--  ${loginInfo.uphoto} --%>
            <img src="/uploadfile/member/${loginInfo.uphoto}">
        </li>
        <li><a href="/logout">로그아웃</a></li>
        </c:if>

    </ul>




</body>
</html>
