<%@ page import="com.yuan.iliya.crud.entity.Customer" %>
<%@ page import="java.sql.Timestamp" %>
<%@ page import="java.sql.Date" %><%--
  Created by IntelliJ IDEA.
  User: Iliya Kaslana
  Date: 2018/6/17
  Time: 17:37
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
<s:debug/><br>
    <%
        request.setAttribute("request","请求的值");
        request.setAttribute("customer",new Customer(10,"16681367","李四光"));
        session.setAttribute("cus",new Customer(16,"12313","明渊青"));
    %>
    输出value值：<s:property value="#request['request']"/><br>
    输出缺省值:  <s:property value="#request['request2']" default="这是缺省值"/><br>
    输出栈顶对象: <s:property/><br>

    <s:property value="'<hr>'"/><br>
    <s:property value="'<hr>'" escapeHtml="false"/><br>
    
    <s:set var="tempage" value="#request['customer'].age" />
    <s:property value="#tempage"/><br>

    <s:set var="i" value="1"/>
    输出i值：<s:property value="#i"/> <br>
    <s:set var="i" value="#i+1"/>
    输出i++的值: <s:property value="#i"/> <br>

    <s:set var="v1" value="'request范围内的值'" scope="request"/>
    <s:set var="v2" value="'page范围的值'" scope="page"/>
    <s:set var="v3" value="'action范围内的值'" scope="action"/>

    request: <s:property value="#v1"/> <br>
    page: <s:property value="#v2"/> <br>
    action: <s:property value="#v3"/> <br>

    <s:push value="#session.cus">
        age:<s:property value="age"/> <br>
        name:<s:property value="name"/> <br>
    </s:push>

    <s:bean name="com.yuan.iliya.crud.entity.Customer" var="customer2">
        <s:param name="age" value="20"/>
        <s:param name="name" value="'林颖啊合租'"/>
        <s:param name="email" value="91749817"/>
    </s:bean>
    年龄<s:property value="#customer2.age"/><br>

    <%
        Timestamp timestamp = Timestamp.valueOf("2018-06-17 00:00:00");
        Date date = new Date(timestamp.getTime());
        request.setAttribute("date",date);
    %>

    日期为: <s:date name="#request.date" format="yyyy-MM-dd"></s:date><br/>
    <s:url action="login" namespace="/" var="url">
        <s:param name="name" value="777"/>
        <s:param name="password" value="7777"></s:param>
    </s:url>
    <s:property value="#url"/><br/>
    <s:a href="%{url}">超链接</s:a>

</body>
</html>
