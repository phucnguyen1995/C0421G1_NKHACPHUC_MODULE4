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
    <title>$Title$</title>
  </head>
  <body>
 <form action="/converter" method="post">

   <p>Nhập số tiền đô cần đổi ra tiền việt</p>
   <input type="text" name="usa" value="${usa}">

   <p>Nhập tỉ giá quy đổi</p>
   <input type="text" name="rate" value="${rate}">

   <input type="submit" value="quy đổi">


     <c:if  test="${vnd != null}">
         <p>Kết quả ra tiền việt là: ${vnd} </p>
<%--         <input type="text" name="vnd" value="${vnd}">--%>
     </c:if>

 </form>
  </body>
</html>
