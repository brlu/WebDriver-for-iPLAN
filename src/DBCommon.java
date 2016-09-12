import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.openqa.selenium.WebDriver;

public class DBCommon {
	
	public static Connection db2con;

	String jdbcClassName = "com.ibm.db2.jcc.DB2Driver";
	String url = "jdbc:db2://192.168.7.106:50001/irim";
	String user = "irim";
	String password = "irim007";
	

	public void connectDB(){
		try
		{
			// Load class into memory
			Class.forName(jdbcClassName);
			// Establish connection
			db2con = DriverManager.getConnection(url, user, password);

		}catch(
		ClassNotFoundException t)
		{
			t.printStackTrace();
		}catch(
		SQLException e)
		{
			e.printStackTrace();
		}finally
		{
			if (db2con != null) {
				System.out.println("Connected successfully.");
/*				try {
					db2con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}*/
			}

		}
		//return connection;
		
	}
	
 }	
