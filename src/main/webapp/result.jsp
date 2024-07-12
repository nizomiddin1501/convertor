<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 7/12/2024
  Time: 3:03 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
  <title>Conversion Result</title>
  <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css"
        integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>
<body>
<div class="container">
  <h2>Conversion Result</h2>
  <p>Amount in <%= request.getAttribute("fromCurrency") %>: <%= request.getAttribute("amount") %></p>
  <p>Converted Amount in <%= request.getAttribute("toCurrency") %>: <%= request.getAttribute("convertedAmount") %></p>
  <a href="index.jsp" class="btn btn-secondary">Convert Another Amount</a>
</div>
</body>
</html>