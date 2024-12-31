package in.sati;

import java.sql.DriverManager;

public class InsertDemo 
{
	public static void main(String[] args) throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		System.out.println("Driver class loaded succesfully");
		
		DriverManager.getConnection("jdbc:mysql://localhost:330/jdbc_db","root","root");
		
		
	}

}
