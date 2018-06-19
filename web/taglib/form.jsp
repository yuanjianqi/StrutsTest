<%--
  Created by IntelliJ IDEA.
  User: Iliya Kaslana
  Date: 2018/6/18
  Time: 16:41
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
    <s:debug></s:debug> <br>
    <s:bean name="com.yuan.iliya.crud.entity.Customer" var="customer1">
        <s:param name="id">1</s:param>
        <s:param name="age">20</s:param>
        <s:param name="email">123456@qq.com</s:param>
        <s:param name="name">小明</s:param>
    </s:bean>

    <s:bean name="com.yuan.iliya.crud.entity.Customer" var="customer2">
        <s:param name="id">2</s:param>
        <s:param name="age">16</s:param>
        <s:param name="email">654321@qq.com</s:param>
        <s:param name="name">小敏</s:param>
    </s:bean>
    <s:set value="{#customer1,#customer2}" var="list"></s:set>

    <s:radio name="radio1" list="#list" listKey="id" listValue="name"/>
    <br>
    <s:checkboxlist list="#list" name="checkbox1" listKey="id" listValue="name"/>
    <br/>
    <s:select list="#list" name="select1" listKey="id" listValue="name" headerValue="请选择用户" headerKey="" multiple="false" size="5" label="名字"/>
    <br/>
    <s:combobox list="#list" listKey="id" listValue="name" name="test" />


</body>
</html>
