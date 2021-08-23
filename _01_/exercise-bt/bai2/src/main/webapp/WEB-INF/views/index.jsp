<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 8/22/2021
  Time: 4:21 PM
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Google dịch</title>
</head>
<body>
<form action="/translate" method="post">


    <p>Nhập từ cần dịch</p>

    <input type="text" name="world" value="${world}">

    <input type="submit" value="tìm">


    <c:if test="${world != null}">
        <p> ${a} </p>
    </c:if>


</form>
</body>
</html>
