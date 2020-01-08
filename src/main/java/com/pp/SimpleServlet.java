package com.pp;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * Servlet implementation class SimpleServlet
 */
@WebServlet("/hello")
public class SimpleServlet extends HttpServlet {
   private static final long serialVersionUID = 1L;
   @Override
   protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
         throws ServletException, IOException {
	   
	  int i=10000;
	  int j=10000;
	  int k=10000;
	  int l=10000;
	  int kl=10000;
	  int ll=10000;
	  
      resp.setContentType("text/plain");
      resp.getWriter().write("Hello World! Maven Web Project Example........");
   }
}
