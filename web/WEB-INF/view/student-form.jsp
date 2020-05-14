<%--
  Created by IntelliJ IDEA.
  User: root
  Date: 10.05.20
  Time: 11:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Student Form</title>
</head>
<body>
<form:form action="processForm" modelAttribute="student">
    First name: <form:input path="firstName"/>
    <br><br>
    Last name: <form:input path="lastName"/>
    <br><br>
    Country:
    <form:select path="country">
        <form:options items="${student.countryOptions}"/>
    </form:select>
    <br><br>

    Favorite Language: <br><br>
    Java <form:radiobutton path="favoriteLanguage" value="Java"/>
    Python <form:radiobutton path="favoriteLanguage" value="Python"/>
    C++ <form:radiobutton path="favoriteLanguage" value="C"/>
    <br><br>
    Operating System:
    <br><br>
    Windows <form:checkbox path="os" value="windows"/>
    MacOS <form:checkbox path="os" value="macos"/>
    Linux <form:checkbox path="os" value="linux"/>
    <br><br>

    <input type="submit" value="Submit">
</form:form>
</body>
</html>
