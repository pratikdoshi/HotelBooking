package ExamplePackage;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SignUpServlet
 */
@WebServlet("/SignUpServlet")
public class SignUpServlet extends HttpServlet {
	boolean s=false;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try
		{	    
		     UserBean user = new UserBean();
		     user.setUserName(request.getParameter("username"));
		     user.setPassword(request.getParameter("password"));
		     user.setFirstName(request.getParameter("firstname"));
		     user.setLastName(request.getParameter("lastname"));
		     user.setPhoneno(request.getParameter("phoneno"));
		     s = UserDAO.signup(user);
			   		    
		     if (s==true)
		     {
			        
		          response.sendRedirect("LoginPage.jsp"); //logged-in page      		
		     }
			        
		     else 
		          response.sendRedirect("SignUp.jsp"); //error page 
		} 
				
				
		catch (Throwable theException) 	    
		{
		     System.out.println(theException); 
		}
	}



}
