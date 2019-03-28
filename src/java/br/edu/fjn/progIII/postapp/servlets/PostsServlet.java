/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fjn.progIII.postapp.servlets;

import br.edu.fjn.progIII.postapp.model.Post;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author leonardo
 */
@WebServlet("/post")
public class PostsServlet extends HttpServlet{

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
            throws ServletException, IOException {
        
        
        String content = req.getParameter("post");
        Post post = new Post(content);
        
        HttpSession session = req.getSession();
        List<Post> postList;
   
        if(session.getAttribute("postList") == null){            
            postList = new ArrayList<>();
        }else{
            postList = (List<Post>) session.getAttribute("postList");
        }
         
        postList.add(post);
        session.setAttribute("postList", postList);
        resp.sendRedirect("posts.jsp");
       
    }
    
    
}
