<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2021/7/13
  Time: 13:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%
        request.setAttribute("key","value");
        request.setAttribute("arr", new String[]{"123","456","789"});
    %>
    <%=request.getAttribute("key")%></br>
    <% pageContext.setAttribute("key2","ufmeyisi"); %>

    ${pageScope.key2}
    <c:if test="${12 == 12}">
        <h1>12等于12</h1>
    </c:if>

    <c:forEach items="${requestScope.arr}" begin="0" end="3" step="1"
    var="item" varStatus="status">
        ${item}
        ${status.last}<br/>
    </c:forEach>

    <c:out default="2" value="${pageScope.key2}"></c:out>

    <c:forTokens items="a,b,c,d,e" delims="," var="item">
        ${item}
    </c:forTokens>


</body>
</html>
