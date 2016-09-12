import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DB2ConeectionTest {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		Statement stmt = null;
		String productName;
		String locationName;
		Connection con = null;
		String jdbcClassName = "com.ibm.db2.jcc.DB2Driver";
		String url = "jdbc:db2://192.168.7.106:50001/irim";
		String user = "irim";
		String password = "irim007";
		

		/*
		// Load class into memory
		Class.forName(jdbcClassName);
		// Establish connection
		Connection connection = DriverManager.getConnection(url, user, password);
		stmt = connection.createStatement(); 
*/

		DBCommon dbCommon = new DBCommon();
		dbCommon.connectDB();
		con = DBCommon.db2con;
		int item_listener_id = 22;
		CallableStatement cs = con.prepareCall("{call sp_system_listener(?)}");
		cs.setInt(1, item_listener_id);
		cs.execute();
		System.out.println("called");

		//stmt = con.createStatement();
		//stmt.executeQuery("call SP_IPLAN_DASH_TOP5POSWEEK()");
		
		/*
		ResultSet rs = stmt.executeQuery("select productname from product where vendorcode = 'QA1'");
		 while (rs.next()) {
		        productName = rs.getString(1);
		        System.out.println("Product Name = " + productName);
		      }

		rs = stmt.executeQuery("select locationname from location where vendorcode = 'QA1'");
		 while (rs.next()) {
		        locationName = rs.getString(1);
		        System.out.println("Location Name = " + locationName);
		      }
		 */
	}

}
