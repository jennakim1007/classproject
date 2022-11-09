<%--
  Created by IntelliJ IDEA.
  User: cheoho-hi
  Date: 2022-11-09
  Time: 오후 2:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

    <c:url value="index.jsp" var="urlIndex"/>
    ${urlIndex} <br>

    <c:url value="/index.jsp" var="urlIndex2"/>
    ${urlIndex2} <br>

    <%-- 절대경로 상대경로의 개념 이해--%>
    <a href="<c:url value="/index.jsp"/>">홈으로 이동</a>
    <a href="<c:url value="/el/elObj.jsp"/>">elObject</a>

    <c:url value="/jstl/jstl_choosewhen.jsp" var="url">
        <c:param name="sel" value="c"></c:param>
        <c:param name="sindex">1</c:param>
    </c:url>

    ${url}
    <a href="${url}">${url}</a>

</body>
</html>
