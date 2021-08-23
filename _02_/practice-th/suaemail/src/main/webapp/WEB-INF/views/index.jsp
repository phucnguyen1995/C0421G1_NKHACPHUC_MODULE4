<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 8/22/2021
  Time: 4:21 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <h1>Email Validate</h1>
  <h3 style="color:red">${message}</h3>


<%--  để chữ a cho hiểu rõ bản chất luồng đi không đặt tên trùng--%>

  <form action="/validate" method="post">
    <input type="text" name="a"><br>
    <input type="submit" value="Validate">
  </form>
  </body>
</html>
