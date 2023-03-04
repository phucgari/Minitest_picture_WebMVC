<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 3/4/2023
  Time: 11:40 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Deleting ${requestScope["picture"].getId()}</title>
</head>
<body>
<a href="/picture">return to full list</a>
<h2>Do you want to delete ${requestScope["picture"].getCode()} ?</h2>
<form method="post">
  <button type="submit">delete</button>
</form>
<form action="/picture">
  <input type="submit" value="Back to list" />
</form>
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
