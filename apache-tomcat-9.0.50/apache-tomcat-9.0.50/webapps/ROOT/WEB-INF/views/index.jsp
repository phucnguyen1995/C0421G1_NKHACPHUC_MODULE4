<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 8/22/2021
  Time: 4:21 PM
  To change this template use File | Settings | File Templates.
--%>

<
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Google dịch</title>
</head>
<body>
<form action="/converter" method="post">
<fieldset>
    <p>Nhập từ cần dịch</p>

    <input type="text" name="world" value="${world}">

    <input type="submit" value="tìm">


    <c:if test="${world != null}">
        <p>Kết quả tim kiếm có nghĩa là :${a} </p>
    </c:if>
</fieldset>


</form>
</body>
</html>
