package ExamplePackage;

import java.text.*;
import java.util.*;

import javax.servlet.http.HttpSession;

import java.sql.*;

public class UserDAO 	
{
   static Connection currentCon = null;
   static ResultSet rs = null;  
	
	
	
   public static UserBean login(UserBean bean) {
	
      //preparing some objects for connection 
      Statement stmt = null;    
	
      String username = bean.getUsername();    
      String password = bean.getPassword();   
	    
      String searchQuery =
            "select * from userdata where username='"
                     + username
                     + "' AND password='"
                     + password
                     + "'";
	    
   // "System.out.println" prints in the console; Normally used to trace the process
   System.out.println("Your user name is " + username);          
   System.out.println("Your password is " + password);
   System.out.println("Query: "+searchQuery);
	    
   try 
   {
      //connect to DB 
      currentCon = ConnectionManager.getConnection();
      stmt=currentCon.createStatement();
      rs = stmt.executeQuery(searchQuery);	        
      boolean more = rs.next();
	       
      // if user does not exist set the isValid variable to false
      if (!more) 
      {
         System.out.println("Sorry, you are not a registered user! Please sign up first");
         bean.setValid(false);
      } 
	        
      //if user exists set the isValid variable to true
      else if (more) 
      {
         String firstName = rs.getString("FirstName");
         String lastName = rs.getString("LastName");
	     	
         System.out.println("Welcome " + firstName);
         bean.setFirstName(firstName);
         bean.setLastName(lastName);
         bean.setValid(true);
      }
   } 

   catch (Exception ex) 
   {
      System.out.println("Log In failed: An Exception has occurred! " + ex);
   } 
	    
   //some exception handling
   finally 
   {
      if (rs != null)	{
         try {
            rs.close();
         } catch (Exception e) {}
            rs = null;
         }
	
      if (stmt != null) {
         try {
            stmt.close();
         } catch (Exception e) {}
            stmt = null;
         }
	
      if (currentCon != null) {
         try {
            currentCon.close();
         } catch (Exception e) {
         }

         currentCon = null;
      }
   }

return bean;
	
   }	

   public static boolean signup(UserBean bean) {
	
	   	boolean s = false;
	      //preparing some objects for connection 
	      Statement stmt = null;    
	      String username = bean.getUsername();    
	      String password = bean.getPassword();
	      String fname = bean.getFirstName();
	      String lname = bean.getLastName();
	      String phoneno = bean.getPhoneno();
	      /*String searchQuery =
		            "select * from userdata where username='"
		                     + username
		                     + "' AND password='"
		                     + password
		                     + "'";
			    */
	     
	   // "System.out.println" prints in the console; Normally used to trace the process
	   System.out.println("Your user name is " + username);          
	   System.out.println("Your password is " + password);
	   System.out.println("Your password is " + fname);
	  // System.out.println("Query: "+searchQuery);
		    
	   try 
	   {
		   Class.forName("com.mysql.jdbc.Driver");
	      //connect to DB 
	      currentCon = ConnectionManager.getConnection();
	      stmt=currentCon.createStatement();
	     
	        String ins = "INSERT into userdata (USERNAME,FIRSTNAME,LASTNAME,PASSWORD,PHONE_NO)  VALUES ('"+username+"', '"+fname+"', '"+lname+"', '"+password+"', '"+phoneno+"')";
	        stmt.executeUpdate(ins);
	        s = true;
	     
		        
	      //if user exists set the isValid variable to true
	     
	   } 

	   catch (Exception ex) 
	   {
	      System.out.println("Log In failed: An Exception has occurred! " + ex);
	   } 
		    
	   //some exception handling
	   finally 
	   {
	      if (rs != null)	{
	         try {
	            rs.close();
	         } catch (Exception e) {}
	            rs = null;
	         }
		
	      if (stmt != null) {
	         try {
	            stmt.close();
	         } catch (Exception e) {}
	            stmt = null;
	         }
		
	      if (currentCon != null) {
	         try {
	            currentCon.close();
	         } catch (Exception e) {
	         }

	         currentCon = null;
	      }
	   }

	return s;
		
	   }	
   
   
  public static boolean confirmBooking(UserBean bean,SelectedRoom room){
	  String username="";
	   	boolean s = false;
	   
	      Statement stmt = null; 
	      
	     
		      String todate = room.getToDate().toString();
		      String fromdate = room.getFromDate().toString();
		      int vehicleprice =room.getVehicleprice();
		      int roomprice = room.getRoomPrice();
		      int mealprice = room.getMealprice();
		      int totalprice = room.getTotalprice();
		      String roomid =room.getRoomid();
	   
	   try 
	   {
		   if(bean.getUsername()!=null){
	    	   username = bean.getUsername();  
	      }
	      else{
	    	
	      }
		      
		   Class.forName("com.mysql.jdbc.Driver");
	      currentCon = ConnectionManager.getConnection();
	      stmt=currentCon.createStatement();
	        String ins = "INSERT into payments (username, room_id, vehicle_price, room_price, total_price, meal_price, from_date, to_date)  VALUES ('"+username+"', '"+roomid+"', '"+vehicleprice+"', '"+roomprice+"', '"+totalprice+"', '"+mealprice+"', '"+fromdate+"', '"+todate+"')";
	        stmt.executeUpdate(ins);
	        s = true;
	   } 

	   catch (Exception ex) 
	   {
	      System.out.println("Log In failed: An Exception has occurred! " + ex);
	   } 
		    
	   //some exception handling
	   finally 
	   {
	      if (rs != null)	{
	         try {
	            rs.close();
	         } catch (Exception e) {}
	            rs = null;
	         }
		
	      if (stmt != null) {
	         try {
	            stmt.close();
	         } catch (Exception e) {}
	            stmt = null;
	         }
		
	      if (currentCon != null) {
	         try {
	            currentCon.close();
	         } catch (Exception e) {
	         }

	         currentCon = null;
	      }
	   }

	return s;
		
  } 

}
