<%--
  Created by IntelliJ IDEA.
  User: Iliya Kaslana
  Date: 2018/6/14
  Time: 16:19
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
    欢迎您， <s:property value="name"></s:property>
    <br><s:property value="#session.account"></s:property>
    <br><s:property value="#application.money"></s:property>
    <br><s:property value="#{'one':'aa','two':'bb'}['one']"></s:property>
    <br><s:property value="@com.yuan.iliya.helloworld.HelloworldAction@staticTest"></s:property>

</body>
</html>
