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
                <th>Surname</th>
                <th>Gender</th>
                <th>Dob</th>
                <th>Phone</th>
                <th>Dermanlara bax</th>
            </tr>
            <c:forEach items="${result}" var="r">
                <tr>
                    <td>${r.id}</td>
                    <td>${r.name}</td>
                    <td>${r.surname}</td>
                    <td>${r.gender}</td>
                    <td>${r.dob}</td>
                    <td>${r.phone}</td>
                    <td><a href="${pageContext.request.contextPath}/GetMedicationList/${r.id}"><input type="button" value="Dermanlara bax"></a> </td>
                </tr>
            </c:forEach>
        </table>
    </c:otherwise>
</c:choose>
</body>
</html>
