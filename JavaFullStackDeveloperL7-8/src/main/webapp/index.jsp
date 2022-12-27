<html>
<head>
    <meta charset="UTF-8">
    <title>User Log In</title>
</head>
<body>
<form action="login" method="Post">
    Login:
    <label>
        <input type="text" name="userLogin"/>
    </label>
    <br><br>
    Password:
    <label>
        <input type="password" name="userPassword"/>
    </label>
    <br><br>
    <output typeof="text" name="error"></output>
    <input type="submit" value="Login" />
    <p>${error}</p>
</form>
</body>
</html>