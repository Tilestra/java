<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Register</title>
    </head>
    <body>
        <form method="post" action="register_servlet">

            Username:
            <input type="text" name="username"/>
            <br/><br/>

            Password:
            <input type="password" name="password"/>
            <br/><br/>

            <input type="submit" value="Register"/>
        </form>
    </body>
</html>
