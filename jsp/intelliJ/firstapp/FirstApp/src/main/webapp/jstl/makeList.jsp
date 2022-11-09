<%@ page import="com.firstcoding.firstapp.member.Member" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: cheoho-hi
  Date: 2022-11-09
  Time: 오후 2:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

  <%
    List<Member> members = new ArrayList<>();
    members.add(new Member("cool0", "1110", "cool0"));
    members.add(new Member("cool1", "1111", null));
    members.add(new Member("cool2", "1112", "cool0"));
    members.add(new Member("cool3", "1113", "cool0"));
    members.add(new Member("cool4", "1114", null));
    members.add(new Member("cool5", "1115", null));
    members.add(new Member("cool6", "1116", "cool0"));
    members.add(new Member("cool7", "1117", null));
    members.add(new Member("cool8", "1118", "cool0"));
    members.add(new Member("cool9", "1119", "cool0"));

    session.setAttribute("members", members);

  %>

</body>
</html>
