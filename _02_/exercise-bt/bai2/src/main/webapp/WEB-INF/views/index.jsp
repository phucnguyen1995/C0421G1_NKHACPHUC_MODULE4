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
<form action="/caculator" method="post">


   <h1>Caculator</h1>
    <p>
    <input type="text" name="a" value="${a}">
    <input type="text" name="b" value="${b}">
    </p>
    <button type="submit" name="operator" value="+">Addition(+)</button>
    <button type="submit" name="operator" value="-">Subtraction(-)</button>
    <button type="submit" name="operator" value="*">Multiplication(X)</button>
    <button type="submit" name="operator" value="/">Division(/)</button>

    <c:if test="${result != null}">
        <p>Kết quả phép tính là:</p>
        <p>${result}</p>
    </c:if>

</form>
</body>
</html>
