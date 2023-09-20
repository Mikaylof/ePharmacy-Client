<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Acer
  Date: 16/08/2023
  Time: 13:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Customer list</title>
</head>
<body>
<c:choose>
    <c:when test="${not empty msg}">
        <label style="color: red">${msg}</label>
    </c:when>
    <c:otherwise>
        <table border="1" style="width: 100%">
            <tr>
                <th>Id</th>
                <th>Name</th>
                <th>Cost</th>
                <th>Manufactured Date</th>
                <th>Expired date</th>
                <th>Customer FullName</th>
            </tr>
            <c:forEach items="${result}" var="r">
                <tr>
                    <td>${r.id}</td>
                    <td>${r.medication_name}</td>
                    <td>${r.medication_cost}</td>
                    <td>${r.manufactured_date}</td>
                    <td>${r.expired_date}</td>
                    <td>${r.respCustomer.name} ${r.respCustomer.surname}</td>
                </tr>
            </c:forEach>
        </table>
    </c:otherwise>
</c:choose>
</body>
</html>
