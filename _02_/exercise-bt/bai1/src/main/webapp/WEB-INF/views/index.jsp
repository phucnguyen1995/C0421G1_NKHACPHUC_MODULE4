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
 <form action="/order" method="post">

    <p>Sanwich Condiments</p>

    <input type="checkbox" id="vehicle1" name="order" value="Lettuce">

<%--     "order" value="Lettuce"  : để get theo order và hiện ra giá trị đó (Lettuce)--%>
    <label for="vehicle1">Lettuce</label><br>

<%--     <p>--%>
<%--         <input type="checkbox" name="order" value="Lettuce"> Lettuce--%>
<%--     </p>--%>

    <input type="checkbox" id="vehicle2" name="order" value="Tomato">
    <label for="vehicle2"> Tomato</label><br>

    <input type="checkbox" id="vehicle3" name="order" value="Mustard">
    <label for="vehicle3"> Mustard</label><br>

    <input type="checkbox" id="vehicle3" name="order" value="Sprouts">
    <label for="vehicle3"> Sprouts</label><br>
    <input type="submit" value="Save">

<%--cách 2:làm 1 file jsp và ít dòng hơn ở ô <input--%>
<%--    <p>--%>
<%--        <input type="checkbox" name="order" value="Lettuce"> Lettuce--%>
<%--    </p>--%>

<%--    <p>--%>
<%--        <input type="checkbox" name="order" value="Tomato"> Tomato--%>
<%--    </p>--%>

<%--    <p>--%>
<%--        <input type="checkbox" name="order" value="Mustard"> Mustard--%>
<%--    </p>--%>

<%--    <p>--%>
<%--        <input type="checkbox" name="order" value="Sprouts"> Sprouts--%>
<%--    </p>--%>

<%--    <button type="submit">Save</button>--%>

<%--    <c:if test="${save!=null}">--%>
<%--        <c:forEach var="sandwich" items="${save}">--%>
<%--            <p style="color: red;font-size: 50px">${sandwich}</p>--%>
<%--        </c:forEach>--%>
<%--    </c:if>--%>



 </form>
  </body>
</html>
