<%--
  Created by IntelliJ IDEA.
  User: cheoho-hi
  Date: 2022-11-08
  Time: 오후 4:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%
  // 현재 세션 소멸
  session.invalidate();
  // 메인 페이지로 보내기
  response.sendRedirect("index.jsp");
%>
