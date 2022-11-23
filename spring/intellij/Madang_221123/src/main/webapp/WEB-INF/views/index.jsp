<%--
  Created by IntelliJ IDEA.
  User: cheoho-hi
  Date: 2022-11-23
  Time: 오후 3:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>Title</title>
</head>
<body>

    <h1>Madang</h1>

    <c:if test="${customerInfo eq null}">
    <a href="customer/login">로그인</a>
    <a href="customer/register">회원가입</a>
    </c:if>

    <c:if test="${customerInfo ne null}">
        회원이름 : ${customerInfo.name}
        <br>
        <a href="/logout">로그아웃</a>
        <a href="customer/modify">회원수정</a>
    </c:if>


</body>
</html>
