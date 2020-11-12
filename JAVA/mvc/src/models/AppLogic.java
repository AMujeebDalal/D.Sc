package models;

import java.sql.Connection;
import java.sql.PreparedStatement;

import DbConnections.Connect;

public class AppLogic {

	
	
	public static int insertData(InsertData d){
		int i=0;
		try{	
			
			
	Connection con=	Connect.getDbInstance();
		
	PreparedStatement ps=con.prepareStatement("insert into login(username,password,email) values(?,?,?)");
	
	ps.setString(1,d.getUsername());
	ps.setString(2,d.getPassword());
	ps.setString(3,d.getEmail());
	
i=	ps.executeUpdate();
	
	}
	catch(Exception e){
		e.printStackTrace();
	}		
		return i;
	}
	
	
	
	
}
