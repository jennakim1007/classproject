<%--
  Created by IntelliJ IDEA.
  User: cheoho-hi
  Date: 2022-11-15
  Time: 오전 10:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

    <h1>쿠키 값 찾기</h1>

    userid : ${cookie.userid.value}
    uuid : ${cookie.uuid.value}

    검색 쿠키 이름 ${param.cname} <br>
    검색 결과 ${result} <br>


    <br>

        <a href="create">쿠키 생성</a>
        <a href="delete">userid 쿠키 값을 삭제</a>

</body>
</html>
