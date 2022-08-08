<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>

<h1><%= "Hello World!" %></h1>

<br/>
<a href="hello-servlet">Hello Servlet</a><br>
<a href="hello2?search=점심먹자">점심먹자(get)</a><br>
<form action="/hello2" method="post">
    <label for="search">post전송</label>
    <input type="text" id="search" name="search">
    <input type="submit" value="점심먹자">
</form>

</body>
</html>