package satii.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public  class Demo 
{
	public static void main(String[] args)
	{
		try {
		
		String USERNAME = "postgres";
		String PASSWORD = "postgres";
		String URL = "jdbc:postgresql://localhost:5432/drugdetails";
		
		
		Class.forName("org.postgresql.Driver");
		
		Connection connection = DriverManager.getConnection(URL,USERNAME,PASSWORD);
		
		Statement s = connection.createStatement();
		
		String query= "create table druginfo (did integer,dname varchar(50),dcompany varchar(50),dprice float";
		
		
		s.executeUpdate(query);
		
		connection.close();
		
	   }
		catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		
	}
	
	

	

}
