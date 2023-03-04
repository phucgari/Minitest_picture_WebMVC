<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 3/4/2023
  Time: 11:54 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>create new picture</title>
</head>
<body>
<form method="post">
  <table>
    <tr>
      <th>Id</th>
      <td><input type="text" name="id" placeholder="id"></td>
    </tr>
    <tr>
      <th>Code</th>
      <td><input type="text" name="code" placeholder="code"></td>
    </tr>
    <tr>
      <th>Price</th>
      <td><input type="number" name="price" placeholder="price"></td>
    </tr>
    <tr>
      <th>Height</th>
      <td><input type="number" name="height" placeholder="height"></td>
    </tr>
    <tr>
      <th>Width</th>
      <td><input type="number" name="width" placeholder="width"></td>
    </tr>
    <tr>
      <th>Material</th>
      <td><input type="text" name="material" placeholder="material"></td>
    </tr>
    <tr>
      <th>Description</th>
      <td><input type="text" name="description" placeholder="description"></td>
    </tr>
    <tr>
      <th><button type="submit">Add</button></th>
    </tr>
  </table>
</form>
</body>
</html>
