<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Login Form</title>
</head>
<body>
    <h2>Login</h2>
    <form action="FormServlet" method="post">
        Username: <input type="text" name="name" required><br><br>
        Password: <input type="password" name="age" required><br><br>
        <input type="submit" value="Login">
    </form>
</body>
</html>
