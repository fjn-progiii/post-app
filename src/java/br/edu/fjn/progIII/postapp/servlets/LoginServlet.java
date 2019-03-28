/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fjn.progIII.postapp.servlets;

import br.edu.fjn.progIII.postapp.model.User;
import java.io.IOException;
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

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

    
  public void doPost(HttpServletRequest request, HttpServletResponse response)
  throws ServletException, IOException{
      
      String userName = request.getParameter("userName");
      String password = request.getParameter("password");
      
      if (userName.equalsIgnoreCase("zezim") &&
              password.equals("naotemsenha")){
         User user = new User(userName, password); 
         HttpSession session = request.getSession();
         session.setAttribute("user", user);
         response.sendRedirect("posts.jsp");
      }else{
         request.setAttribute("msgLoginError", "Usuário ou senha inválido!");
         request.getRequestDispatcher("login.jsp")
                .forward(request, response);
      }
  }    
}