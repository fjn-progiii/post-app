<%-- 
    Document   : login
    Created on : Mar 28, 2019, 6:50:36 PM
    Author     : leonardo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Post App - Login</title>
    </head>
    <body>
        <div>
            <form action="login" method="post">
                <div>
                    <label for="userNameField">Usuário:</label>
                    <input id="userNameField" name="userName"/>
                </div>
                <div>
                    <label for="passwordField">Senha:</label>
                    <input id="passwordField" type="password" name="password"/>
                </div>
                <div>
                    <button type="submit">Entrar</button>
                </div>
            </form>
            <p style="color: red">${msgLoginError}</p>

        </div>
    </body>
</html>
