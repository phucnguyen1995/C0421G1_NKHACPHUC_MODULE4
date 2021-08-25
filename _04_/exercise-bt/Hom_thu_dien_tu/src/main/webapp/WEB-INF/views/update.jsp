<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 8/25/2021
  Time: 12:04 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3>Home</h3>
<form:form action="update-email" method="post" modelAttribute="email">
    <fieldset>
        <legend>Settings</legend>
        <table>
            <tr>
                <td><form:label path="language">Languages:</form:label></td>
                <td><form:select path="language" items="${languages}"/></td>
            </tr>
            <tr>
                <td><form:label path="pageSize">Page Size:</form:label></td>
                <td><span>Show</span><form:select path="pageSize" items="${size}"/><span>emails per page</span></td>
            </tr>
            <tr>
                <td><form:label path="spamsFilter">Spams filter:</form:label></td>
                <td><form:checkbox path="spamsFilter"/><span>Enable spams filter</span></td>
            </tr>
            <tr>
                <td><form:label path="signature">Signature:</form:label></td>
                <td><form:textarea path="signature"/></td>
            </tr>
            <tr>
                <td><form:button type="submit">Update</form:button></td>
                <td><form:button type="reset">Cancel</form:button></td>
            </tr>
        </table>
    </fieldset>
</form:form>
</body>
</html>
