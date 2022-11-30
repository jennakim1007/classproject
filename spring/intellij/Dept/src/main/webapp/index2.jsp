<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "Hello World!" %>
</h1>
<br/>
<a href="hello-servlet">Hello Servlet</a>

<%--<script>

   const xhr = new XMLHttpRequest();
   // xhr.open('get','https://jsonplaceholder.typicode.com/todos/1');
   xhr.open('get','/api/v1/depts/150');
   xhr.send();

    xhr.onreadystatechange = () => {
        if(xhr.readyState !== XMLHttpRequest.DONE){
            return;
        }

        if(xhr.status === 200){
            console.log(JSON.parse(xhr.response));
        } else {
            console.log(("error", xhr.status, xhr.statusText));
        }
    }

</script>--%>

<%--<script>--%>

<%--    // let err = "test";--%>

<%--    const request = {--%>
<%--        get(url){return fetch(url)},--%>
<%--        post(url, payload){--%>
<%--            return fetch(url, {--%>
<%--                method : 'POST',--%>
<%--                headers : {'content-Type' : 'application/json'},--%>
<%--                body : JSON.stringify(payload)--%>
<%--            })--%>
<%--        },--%>
<%--        put(url, payload){--%>
<%--            return fetch(url, {--%>
<%--                method : 'PUT',--%>
<%--                headers : {'content-Type' : 'application/json'},--%>
<%--                body : JSON.stringify(payload)--%>
<%--            })--%>
<%--        },--%>
<%--        delete(url){--%>
<%--            return fetch(url, {method : 'DELETE'});--%>
<%--        }--%>
<%--    }--%>

<%--    request.get('/api/v1/depts')--%>
<%--        .then(response => {--%>
<%--            if(!response.ok){--%>
<%--                throw new Error(response.statusText);--%>
<%--            }--%>
<%--            // return response.json()--%>
<%--            return request.get('api/v1/depts/10');--%>
<%--        })--%>
<%--        .then(response => {--%>
<%--            if(!response.ok){--%>
<%--                throw new Error(response.statusText);--%>
<%--            }--%>
<%--            // return response.json()--%>
<%--            return response.json()--%>
<%--        })--%>
<%--        .then(list => console.log(list))--%>
<%--        .catch(err = console.log(err))--%>

<%--    request.post('/api/v1/depts', {deptno:11, dname:'test', loc:'test123'})--%>
<%--        .then(response => {--%>
<%--            if(!response.ok){--%>
<%--                return new Error(response.statusText);--%>
<%--            }--%>
<%--            console.log(response)--%>
<%--        })--%>
<%--        .catch(err =>console.log(err))--%>

<%--    request.put('/api/v1/depts/11', {deptno:11, dname:'기획', loc:'서울'})--%>
<%--        .catch(err => console.log(err))--%>

<%--    request.delete('/api/v1/depts/11')--%>
<%--        .then(response => {--%>
<%--            console.log(response.body)--%>
<%--        })--%>

<%--</script>--%>

<script src="https://cdn.jsdelivr.net/npm/axios/dist/axios.min.js"></script>
<script>

    axios.get('/api/v1/depts/10')
        .then(res => {
            console.log(res.data)
            // 태그 캐스팅 -> 데이터 변경
        })
        .catch(err => console.log(err))

    axios.post('/api/v1/depts', {"deptno": 56, "dname": "DEV123", "loc": "PAN123"})
        .then(res => console.log(res))
        .catch(err => console.log(err))




</script>




</body>
</html>