package ExamplePackage;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ShowReservationsServlet
 */
@WebServlet("/ShowReservationsServlet")
public class ShowReservationsServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession(true);	  
	    UserBean user= (UserBean) session.getAttribute("currentSessionUser");
	session = request.getSession(true);	  
		    SelectedRoom room= (SelectedRoom) session.getAttribute("SelectedRoomSession"); 
		    response.sendRedirect("FinalDisplayInformation.jsp");
	}

}
