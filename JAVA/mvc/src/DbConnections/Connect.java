package DbConnections;

import java.sql.Connection;
import java.sql.DriverManager;

public class Connect {

	
	
	
	
	static Connection con;
	
	private Connect() {
		// TODO Auto-generated constructor stub
	}
	
	static{
		try{
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","root");
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
	
public static Connection	getDbInstance(){
	
		return con;
	}
	
	
	
}
