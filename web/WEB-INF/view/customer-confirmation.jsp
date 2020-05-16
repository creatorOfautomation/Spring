<%--
  Created by IntelliJ IDEA.
  User: root
  Date: 10.05.20
  Time: 22:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Customer confirmation</title>
</head>
<body>
<h2>Customer registered</h2>

Name: '${customer.firstName} ${customer.lastName}';

<br><br> Free passes '${customer.freePasses}'
<br><br> Postal code '${customer.postalCode}'
<br><br> Course code '${customer.courseCode}'
<br><br> Link to social '${customer.link}'
</body>
</html>
