<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 3/4/2023
  Time: 9:31 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>All Picture List</title>
</head>
<body>
<h3>${requestScope["message"]}</h3>
<a href="/picture?action=create">Create new Picture</a>
<form method="get">
    <table>
        <tr>
            <th>Id</th>
            <th>Code</th>
            <th>Price</th>
            <th>Description</th>
            <th>Edit</th>
            <th>Delete</th>
        </tr>
        <c:forEach items="${pictures}" var="picture">
            <tr>
                <td>${picture.id}</td>
                <td>${picture.code}</td>
                <td>${picture.price}</td>
                <td><a href="/picture?action=description&id=${picture.id}">Description</a></td>
                <td><a href="/picture?action=edit&id=${picture.id}">Edit</a></td>
                <td><a href="/picture?action=delete&id=${picture.id}">Delete</a></td>
            </tr>
        </c:forEach>
    </table>
</form>
</body>
</html>
