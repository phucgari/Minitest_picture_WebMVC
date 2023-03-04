<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 3/4/2023
  Time: 10:56 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Editing ${requestScope["picture"].getId()}</title>
</head>
<body>
<a href="/picture">return to list</a>
<h2>Editing of ${requestScope["picture"].getCode()}</h2>
<form method="post">
<table>
  <tr>
    <th>Code</th>
    <td><input type="text" name="code" value="${requestScope["picture"].getCode()}"></td>
  </tr>
  <tr>
    <th>Price</th>
    <td><input type="number" name="price" value="${requestScope["picture"].getPrice()}"></td>
  </tr>
  <tr>
    <th>Height</th>
    <td><input type="number" name="height" value="${requestScope["picture"].getHeight()}"></td>
  </tr>
  <tr>
    <th>Width</th>
    <td><input type="number" name="width" value="${requestScope["picture"].getWidth()}"></td>
  </tr>
  <tr>
    <th>Material</th>
    <td><input type="text" name="material" value="${requestScope["picture"].getMaterial()}"></td>
  </tr>
  <tr>
    <th>Description</th>
    <td><input type="text" name="description" value="${requestScope["picture"].getDescription()}"></td>
  </tr>
  <tr>
    <th><button type="submit">Save</button></th>
  </tr>
</table>
</form>
</body>
</html>
