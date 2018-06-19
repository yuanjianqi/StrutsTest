<%--
  Created by IntelliJ IDEA.
  User: Iliya Kaslana
  Date: 2018/6/14
  Time: 16:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
</head>
<body>
    <s:form action="login" method="POST">
        <s:textfield name="name" label="username"></s:textfield>
        <s:password name="password" label="password"/>
        <s:submit/>

    </s:form>


</body>
</html>
