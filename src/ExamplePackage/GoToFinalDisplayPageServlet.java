package ExamplePackage;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class GoToFinalDisplayPageServlet
 */
@WebServlet("/GoToFinalDisplayPageServlet")
public class GoToFinalDisplayPageServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession(true);	  
	    UserBean user= (UserBean) session.getAttribute("currentSessionUser");

	session = request.getSession(true);	  
		    SelectedRoom room= (SelectedRoom) session.getAttribute("SelectedRoomSession"); 
		
		   System.out.println(room.getRoomid().toString());
		  String vehicletype= (request.getParameter("radio")); 
		  System.out.println(request.getParameter("radio"));
		  if(vehicletype.equals("None")){
			  room.setVehicleprice(0);
			  session.setAttribute("SelectedRoomSession", room);
		  }
		  if(vehicletype.equals("Four Wheeler")){
			  room.setVehicleprice(50);
			  session.setAttribute("SelectedRoomSession", room);
		  }
		  else if(vehicletype.equals("Six Wheeler")){
			  room.setVehicleprice(100);
			  session.setAttribute("SelectedRoomSession", room);
		  }
		  else if(vehicletype.equals("Eight Wheeler")){
			  room.setVehicleprice(150);
			  session.setAttribute("SelectedRoomSession", room);
		  }
	 
	      Boolean dec=UserDAO.confirmBooking(user,room);
	      if(dec==true){
	     response.sendRedirect("FinalDisplayInformation.jsp");
	      }
	      else{
	    	  
	      }
	     
		}
		
	
	}


