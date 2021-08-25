<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 8/23/2021
  Time: 9:17 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<h3>
    <c:if test="${result == null}">
        <p>Khach hàng không hài lòng nên không chọn món nào</p>
<%--        c2--%>
<%--        ${mess}--%>
    </c:if>

    <c:if test="${result != null}">
        <p>Khach hang chon cac mon:</p>
        <c:forEach var="c" items="${result}">
           ${c}
        </c:forEach>
    </c:if>
</h3>
</body>
</html>
