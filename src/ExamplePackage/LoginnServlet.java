package ExamplePackage;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginnServlet
 */
@WebServlet("/LoginnServlet")
public class LoginnServlet extends HttpServlet {

public void doGet(HttpServletRequest request, HttpServletResponse response) 
			           throws ServletException, java.io.IOException {

try
{	    

     UserBean user = new UserBean();
     user.setUserName(request.getParameter("username").toString());
     user.setPassword(request.getParameter("password").toString());
     HttpSession session = request.getSession(true);	    
     session.setAttribute("currentSessionUser",user); 
             System.out.println(user.getUsername()+user.getPassword());
     user = UserDAO.login(user);
	   		    
     if (user.isValid())
     {
          response.sendRedirect("UserLogged.jsp"); //logged-in page     
	   
	    
     }
	        
     else 
          response.sendRedirect("invalidLogin.jsp"); //error page 
} 
		
		
catch (Throwable theException) 	    
{
     System.out.println(theException); 
}
       }
	}