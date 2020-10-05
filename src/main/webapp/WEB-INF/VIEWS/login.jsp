<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c" %>
<%@page isELIgnored="false" %>
<html>
<head>
    <title>Register User</title>
</head>
<body>
<form action="login" method="post">
    <h2>Login</h2>
    <pre>
        <h2>User Registration</h2>
Username:<input type="text" name="email" placeholder=" Your email"/>
Password:<input type="password" name="password"/>
<input type="submit" value="login"/>

${msg}
</pre>
</form>



</body>
</html>