<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Product List</title>
</head>
<body>
<h1>Product List</h1>
<br/>
<form action="<c:url value="/delete"/>" method="post">
    <table>
        <thead>
        <tr>
            <th>Deleted</th>
            <th>ProductName</th>
            <th>Price</th>
            <th>Quantity</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${products}" var="p">
            <tr>
                <td>
                    <input type="checkbox" name="delete" value="${p.id}">
                </td>
                <td>${p.productName}</td>
                <td>${p.price}</td>
                <td>${p.quantity}</td>
            </tr>
        </c:forEach>
        </tbody>
    </table>

    <div>
        <input type="submit" value="Delete">
    </div>
</form>

</body>
</html>