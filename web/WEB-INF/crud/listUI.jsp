<%--
  Created by IntelliJ IDEA.
  User: Iliya Kaslana
  Date: 2018/6/15
  Time: 19:48
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
<s:debug/>
    <table align="center" border="1" cellpadding="10" cellspacing="0">
        <tr>
            <td>id</td>
            <td>age</td>
            <td>email</td>
            <td>name</td>
            <td></td>
            <td></td>
        </tr>
        <s:iterator value="customers">
            <tr>
                <td><s:property value="id"/> </td>
                <td><s:property value="age"/> </td>
                <td><s:property value="email"/> </td>
                <td><s:property value="name"/> </td>
                <td><a href="customer_delete.action?id=${id}">delete</a></td>
                <td><a href="customer_editUI.action?id=${id}">edit</a></td>
            </tr>
            
        </s:iterator>

        <a href="customer_addUI.action">新增</a>
        
        
    </table>
    

</body>
</html>
