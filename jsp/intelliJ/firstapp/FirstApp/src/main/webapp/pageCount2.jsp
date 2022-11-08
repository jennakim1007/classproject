<%--
  Created by IntelliJ IDEA.
  User: cheoho-hi
  Date: 2022-11-08
  Time: 오후 3:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

  <%
    // Object 형태로 받으므로 String 으로 받을 수 있도록 명시적 형변환 해야함
    String cntStr = (String)application.getAttribute("cnt");
    int cnt = cntStr == null ? 0 : Integer.parseInt(cntStr);
    out.print("페이지 방문 수 : " + cnt);
    application.setAttribute("cnt", String.valueOf(++cnt));
  %>

</body>
</html>
