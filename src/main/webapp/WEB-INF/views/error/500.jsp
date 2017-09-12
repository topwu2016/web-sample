<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%response.setStatus(200);%>

<!DOCTYPE html>
<html>
<head>
    <title>500 - 系统内部错误</title>
</head>

<body>
<h2>500 - 系统发生内部错误.</h2>
<p><a href="<c:url value="/"/>">返回首页</a></p>
</body>
</html>