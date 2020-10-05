<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c" %>
<%@page isELIgnored="false" %>
<html>
<head>
    <title>Register User</title>
</head>
<body>
<h2>find flights</h2>
<form action="findFlights" method="post">
    <pre>
        <h2>User Registration</h2>
From:<input type="text" name="from"/>
  To:<input type="text" name="to"/>
Depature Date:<input type="text" name="depatureDate ">

<input type="submit" value="search"/>

</pre>
</form>



</body>
</html>