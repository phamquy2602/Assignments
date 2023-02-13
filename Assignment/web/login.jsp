<%-- 
    Document   : login
    Created on : Feb 13, 2023, 12:06:23 PM
    Author     : quyde
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Form</title>
<style>
body {
    background-image: url("https://th.bing.com/th/id/R.ba4cc2a9f7a24208ec00c82ed31f454a?rik=ZrjfixKyMvgrnQ&riu=http%3a%2f%2feskipaper.com%2fimages%2fbackground-wallpapers-9.jpg&ehk=MZ7DhIwpFI%2bAkA3Cf2fEzFGhBIZ53TXqEoE2vyFCh5A%3d&risl=&pid=ImgRaw&r=0.jpg");
    background-size: cover;
}

.login-form {
    background-color: rgba(255, 255, 255, 0.7);
    border-radius: 10px;
    padding: 20px;
    width: 400px;
    height: 300px;
    margin: 100px auto;
    box-shadow: 0 0 10px #333;
}

.login-form h3 {
    text-align: center;
    margin-top: 0;
}

.login-form input[type="text"], .login-form input[type="password"] {
    width: 100%;
    padding: 10px;
    margin-top: 20px;
    border: none;
    border-radius: 5px;
    background-color: #f2f2f2;
    font-size: 16px;
}

.login-form input[type="submit"] {
    width: 100%;
    padding: 10px;
    margin-top: 20px;
    border: none;
    border-radius: 5px;
    background-color: #4CAF50;
    color: white;
    font-size: 16px;
    cursor: pointer;
}

.login-form input[type="submit"]:hover {
    background-color: #3e8e41;
}
</style>
</head>
<body>
    <form class="login-form" action="LoginServlet" method="post">
        <h3>Login Form</h3>
        <table>
            <tr>
                <td>Username:</td>
                <td><input type="text" name="username"></td>
            </tr>
            <tr>
                <td>Password:</td>
                <td><input type="password" name="password"></td>
            </tr>
            <tr>
                <td><input type="submit" value="Login"></td>
                <td><input type="reset" value="Reset"></td>
            </tr>
        </table>
    </form>
</body>
</html>
