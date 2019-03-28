<%-- 
    Document   : post.jsp
    Created on : Mar 28, 2019, 7:21:21 PM
    Author     : leonardo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Posts</title>
    </head>
    <body>
        <div>
            <p>Usuário logado: ${user.userName}</p>
        </div>
        <div>
            <div>
                <form action="post" method="post">
                    <div>
                        <input type="text" placeholder="O que vai ser hoje?"
                               name="post"/>
                        <button type="submit">Postar</button>
                    </div>
                </form>
            </div>  
        </div>
        <h3>Posts realizados:</h3>
        <div>
            <p>${postList[0].content}</p>
            <p>${postList[0].createdAt}</p>
        </div>
        <div>
            <p>${postList[1].content}</p>
            <p>${postList[1].createdAt}</p>
        </div>
         <div>
            <p>${postList[2].content}</p>
            <p>${postList[2].createdAt}</p>
        </div>
       
    </body>
</html>
