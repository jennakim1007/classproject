<%@ page import="com.firstcoding.firstapp.member.Member" %>
<%@ page import="com.firstcoding.firstapp.product.Product" %><%--
  Created by IntelliJ IDEA.
  User: cheoho-hi
  Date: 2022-11-09
  Time: 오후 12:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
//    request -> session -> application
    request.setAttribute("name", "손흥민");
    session.setAttribute("name", "이강인");

    Member member = new Member();
    member.setId("cool");
    member.setPw("1234");
    member.setName("COOL");

    session.setAttribute("member", member);

    session.setAttribute("product", new Product());



%>

<html>
<head>
    <title>Title</title>
</head>
<body>

    <%-- Object 다형성 -> 명시적 형변환 불필요 --%>
    <h4> 표현식 : <%= request.getAttribute("name")%> </h4>
    <h4> 표현언어(el) : ${requestScope.name}</h4>

    <%-- 찾으려는 Obj 값이 없는 경우 --%>
    <h4> 표현식 : <%= request.getAttribute("id")%> </h4> <%-- null --%>
    <h4> 표현언어(el) : ${requestScope.id}</h4> <%--아무것도 안나옴 --%>

    <h4>param(code) : ${param.code}</h4>

    <h4>pageContext : ${pageContext.request.requestURL}</h4>
    <h4>pageContext : ${pageContext.request.requestURI}</h4>
    <h4>pageContext : ${pageContext.request.contextPath}</h4>
    <h4>contextPath : <%=request.getContextPath()%></h4>

    <h4>sessionScope : ${sessionScope.name}</h4>
    <h4>name : ${name}</h4> <%--console : 손흥민--%>

    <hr>

    ${true} / ${false} / ${100} / ${1.2} / ${'안녕'} / ${null}

    <hr>

    <h4>${sessionScope.member}</h4>
    <h4>
        ${member} / ${member.id} / ${member.pw} / ${member.name} / ${member.info}
    </h4>

    <hr>

    <h4>
        첫 번째 상품 : ${product.list[0]}, 가격 : ${product.price}
    </h4>

</body>
</html>
