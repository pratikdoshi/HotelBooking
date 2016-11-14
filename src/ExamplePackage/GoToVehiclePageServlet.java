package ExamplePackage;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class GoToVehiclePageServlet
 */
@WebServlet("/GoToVehiclePageServlet")
public class GoToVehiclePageServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 HttpSession session = request.getSession();	  
	    SelectedRoom room= (SelectedRoom) session.getAttribute("SelectedRoomSession"); 
	   System.out.println(room.getRoomid().toString());
	  String mealtype= (request.getParameter("radio")); 
	  System.out.println(request.getParameter("radio"));
	  if(mealtype.equals("None")){
		  room.setMealprice(0);
		  session.setAttribute("SelectedRoomSession", room);
		  
	  }
	  else if(mealtype.equals("Breakfast")){
		  room.setMealprice(50);
		  session.setAttribute("SelectedRoomSession", room);
	  }
	  else if(mealtype.equals("Breakfast + Lunch")){
		  room.setMealprice(100);
		  session.setAttribute("SelectedRoomSession", room);
	  }
	  else if(mealtype.equals("Breakfast + Lunch + Dinner")){
		  room.setMealprice(150);
		  session.setAttribute("SelectedRoomSession", room);
	  }
	  
     response.sendRedirect("Vehicle.jsp");
     
	}
	
}


