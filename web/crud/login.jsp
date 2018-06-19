<%--
  Created by IntelliJ IDEA.
  User: Iliya Kaslana
  Date: 2018/6/15
  Time: 21:48
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
    <s:form action="customer_login.action" method="POST">
        <s:textfield name="id" label="userId"></s:textfield>
        <s:submit value="submit"/>
    </s:form>

</body>
</html>
