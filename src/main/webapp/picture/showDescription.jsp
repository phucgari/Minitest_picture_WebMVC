<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 3/4/2023
  Time: 10:25 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Description of ${requestScope["picture"].getId()}</title>
</head>
<body>
<a href="/picture">return to list</a>
<h2>Description of ${requestScope["picture"].getCode()}</h2>
<table>
  <tr>
    <th>Price</th>
    <td>${requestScope["picture"].getPrice()}</td>
  </tr>
  <tr>
    <th>Height</th>
    <td>${requestScope["picture"].getHeight()}</td>
  </tr>
  <tr>
    <th>Width</th>
    <td>${requestScope["picture"].getWidth()}</td>
  </tr>
  <tr>
    <th>Material</th>
    <td>${requestScope["picture"].getMaterial()}</td>
  </tr>
  <tr>
    <th>Description</th>
    <td>${requestScope["picture"].getDescription()}</td>
  </tr>
</table>
</body>
</html>
