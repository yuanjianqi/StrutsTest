<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="com.yuan.iliya.crud.entity.Customer" %><%--
  Created by IntelliJ IDEA.
  User: Iliya Kaslana
  Date: 2018/6/17
  Time: 22:05
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
        int length = 15;
        request.setAttribute("length",length);

    %>

    <s:if test="#request.length < 10">
        小孩子
    </s:if>
    <s:elseif test="#request.length > 18">
        成年人
    </s:elseif>
    <s:else>萝莉</s:else><br/>

    输出1到10的值 : <s:iterator var="i" begin="1" end="10" step="1">
        <s:property value="#i"></s:property>
    </s:iterator>

    <%
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 10; i++){
            list.add("这是：" + i);
        }

        request.setAttribute("list",list);
    %>

    <br>循环遍历List: <br><s:iterator value="#request.list" var="string">
        <s:property value="#string"></s:property> <br>
    </s:iterator>

    <%
        List<Customer> customers = new ArrayList<>();
        for (int i = 0; i < 5; i++){
            Customer customer = new Customer();
            customer.setId(i);
            customer.setAge(18 + i);
            customer.setEmail("chongqing" + i);
            customer.setName("张三" + i);
            customers.add(customer);
        }

        request.setAttribute("customers", customers);
    %>

    遍历List对象: <br>
    <s:iterator value="#request.customers" status="state">
        索引= <s:property value="#state.index"/> &nbsp;&nbsp;
        <s:property value="id"/>&nbsp;&nbsp;
        <s:property value="age"/>&nbsp;&nbsp;
        <s:property value="email"/>&nbsp;&nbsp;
        <s:property value="name"/>&nbsp;&nbsp;
        <br> <br>
    </s:iterator>

    <s:set value="{1,2,3,4}" var="list1"/>
    <s:set value="{7,8,9,10}" var="list2"/>
    <s:append var="numbers">
        <s:param value="#list1"/>
        <s:param value="#list2"/>
    </s:append>

    <s:iterator value="#numbers" var="number">
        <s:property value="#number"/><br/>
    </s:iterator>

    <s:generator separator="," val="'a,b,c,d,e,f,g'" var="myList"/>
    <s:iterator value="#myList" var="list">
        <s:property value="#list"></s:property>
        <br>
    </s:iterator>

    <s:merge var="numbers2">
        <s:param value="#list1"></s:param>
        <s:param value="#list2"></s:param>
    </s:merge>
    <s:iterator value="#numbers2" var="number">
        <s:property value="#number"/><br>
    </s:iterator>

    <s:subset source="#list1" count="2" start="1">
        <s:iterator>
            <s:property/>
        </s:iterator>
    </s:subset>


</body>
</html>
