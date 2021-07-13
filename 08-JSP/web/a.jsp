<%@ page import="java.util.Map" %>
<%@ page import="java.util.HashMap" %><%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2021/7/12
  Time: 15:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--1.声明类属性--%>
<%!
    private Integer id;
    private String name;
    private static Map<String,Object> map;
%>

<%--2.声明静态代码块--%>
<%!
    static {
        map = new HashMap<String, Object>();
        map.put("key1","value1");
        map.put("key2","value2");
        map.put("key3","value3");
    }
%>
<%--3.声明类方法--%>
<%!
    public int a() {
        return 12;
    }
%>
<%--4.声明内部类--%>
<%= 12.2

%>
</body>
</html>
