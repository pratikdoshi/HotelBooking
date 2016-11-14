package ExamplePackage;

import java.util.*;
import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/BookingServlet")
public class BookingServlet extends HttpServlet {
		
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//PaymentBean book = new PaymentBean();
		//book.setRoom_id(Integer.parseInt(request.getParameter("id")));
	    System.out.println("hi"+request.getParameter("id"));
		//book.setTotal(Double.parseDouble(request.getParameter("price")));
		
		/*boolean s = false;
		try {
			s = PaymentDAO.book(book);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
		
		if(s == true)
		{
			 response.sendRedirect("Meal.jsp");
		}
		else
		{
			System.out.println("Please try again!");
			 response.sendRedirect("DisplayRoom.jsp");
		}
		
	}*/
	    SelectedRoom room=new SelectedRoom();
	    HttpSession session = request.getSession(true);	 
	     room =(SelectedRoom) session.getAttribute("SelectedRoomSession");
	    room.setRoomid(request.getParameter("id"));
	    
	     session = request.getSession(true);	    
        session.setAttribute("SelectedRoomSession",room); 
        response.sendRedirect("Meal.jsp");
        
	}
}
