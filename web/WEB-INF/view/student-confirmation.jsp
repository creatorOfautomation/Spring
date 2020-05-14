<jsp:useBean id="student" scope="request" type="spring.love2code.Student"/>
<%--
  Created by IntelliJ IDEA.
  User: root
  Date: 10.05.20
  Time: 11:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Student Confirmation</title>
</head>
<body>
<h2>Student registered</h2>

Got student:
<br><br>The name: '${student.firstName} ${student.lastName}' from '${student.country}' has favorite language: '${student.favoriteLanguage}' with OS: '${student.os}'
</body>
</html>
