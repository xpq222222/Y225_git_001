<%--
  Created by IntelliJ IDEA.
  User: admin001
  Date: 2019/12/5
  Time: 11:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <c:forEach items="${list}" var="account">
        ${account.name}------------${account.age}-----------${account.balance}
    </c:forEach>
</body>
</html>
