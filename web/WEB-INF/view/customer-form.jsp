<%--
  Created by IntelliJ IDEA.
  User: root
  Date: 10.05.20
  Time: 22:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Customer form</title>
    <style>
        .error {
            color: red
        }
    </style>
</head>
<body>
<i>Fill out the form bellow: </i>

<form:form action="processForm" modelAttribute="customer">

    First name: <form:input path="firstName"/>
    <br> <br>


    Last name (*): <form:input path="lastName" />
    <form:errors path="lastName" cssClass="error"/>
    <br> <br>


    Free passes: <form:input path="freePasses"/>
    <form:errors path="freePasses" cssClass="error"/>
    <br> <br>


    Postal code: <form:input path="postalCode"/>
    <form:errors path="postalCode" cssClass="error"/>
    <br> <br>

    Course code: <form:input path="courseCode"/>
    <form:errors path="courseCode" cssClass="error"/>
    <br> <br>

    Link to social: <form:input path="link"/>
    <form:errors path="link" cssClass="error"/>
    <br> <br>


    <input type="submit" value="Submit">
    <br> <br>
</form:form>
</body>
</html>
