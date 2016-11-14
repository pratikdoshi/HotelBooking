package ExamplePackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class RoomDAO {
	static Statement ps = null;
	static Connection db = null;
	static ResultSet rs =null;
	static ArrayList<RoomBean> list=new ArrayList<RoomBean>();
	public static ArrayList<RoomBean> checkAvailable(RoomBean rb) throws ClassNotFoundException, SQLException
	{
		String roomtype=rb.getRoom_type();
		db = ConnectionManager.getConnection();
		ps = db.createStatement();
		String stm = "select * from room where isAvailable=1 and room_type= '"+roomtype+"'"; 
		rs= ps.executeQuery(stm);
		//return rs;
		 while(rs.next())
          {
			int room_ID=rs.getInt(1);
          	String type=rs.getString(2);
      		double price=rs.getDouble(4);
      		String image=rs.getString(5);
      		String features=rs.getString(3);
      		
              RoomBean t=new RoomBean();
              t.setRoom_type(type);
              t.setRfeatures(features);
              t.setR_image(image);
              t.setRprice(price);
              t.setRoom_id(room_ID);
              
              list.add(t);
          }
		 return list;
          
      } 
     
      
     
     
	}