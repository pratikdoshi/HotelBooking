package ExamplePackage;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/RoomServlet")
public class RoomServlet extends HttpServlet {
	
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try{
			RoomBean room = new RoomBean();
		    room.setRoom_type(request.getParameter("roomtype"));
		    SelectedRoom sroom=new SelectedRoom();
		    if(request.getParameter("date-start")!=null){
			    sroom.setFromDate(request.getParameter("date-start").toString());
			    System.out.println("hi"+request.getParameter("date-start").toString());
			    }
			    if(request.getParameter("date-end")!=null){
			    sroom.setToDate(request.getParameter("date-end").toString());
			    System.out.println("hi"+request.getParameter("date-end").toString());
			    }
			    if(request.getParameter("roomtype")!=null){
			    if(request.getParameter("roomtype").equals("Standard Room")){
			    	sroom.setRoomPrice(100);
			    }
			    else if(request.getParameter("roomtype").equals("Family Room")){
			 sroom.setRoomPrice(150);
			    }
			    else if(request.getParameter("roomtype").equals("Suite")){
			 sroom.setRoomPrice(200);
			    }
			    }
			    HttpSession session = request.getSession(true);	    
		        session.setAttribute("SelectedRoomSession",sroom); 
		    System.out.println("type="+request.getParameter("roomtype"));
			ArrayList<RoomBean> available = RoomDAO.checkAvailable(room);
			request.setAttribute("list", available);
			RequestDispatcher rd=request.getRequestDispatcher("DisplayRoom.jsp");
			//System.out.println(rd);
			rd.forward(request, response);			
			
		}
		catch(Throwable e){
			System.out.println(e);
		}
	}

	

}
