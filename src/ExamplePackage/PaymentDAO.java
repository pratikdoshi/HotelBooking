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

public class PaymentDAO {
	
	static Statement ps = null;
	static Connection db = null;
	static int rs =0;
	
		public static boolean book (PaymentBean b) throws SQLException
		{
			boolean booked= false;
			
			/*db = ConnectionManager.getConnection();
			ps = db.createStatement();
			String stm = "INSERT INTO payment (room_id, total) VALUES ('b.getRoom_id()', 'b.getTotal()')";
			rs = ps.executeUpdate(stm);
			
			if(rs != null)
			{
				booked=true;
				return booked;
			}
			else{
				return booked;	
			}*/
			return true;
		}
}
