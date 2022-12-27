<%@taglib uri="http://java.sun.com/jsp/jstl/core"
          prefix="c" %>
<html>
<head>
    <title>All users list</title>
</head>
<body>
<table>
    <thead><td>Name</td><td>Login</td></thead>
    <jsp:useBean id="users" scope="request" type="java.util.List"/>
    <c:forEach var="user" items="${users}">
        <tr>
            <td>${user.name}</td>
            <td>${user.login}</td>
        </tr>
    </c:forEach>
</table>
<form action="logout">
    <input type="submit" value="Logout" />
</form>
</body>
