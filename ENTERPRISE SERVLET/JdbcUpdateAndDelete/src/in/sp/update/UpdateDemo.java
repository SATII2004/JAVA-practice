package in.sp.update;

public class UpdateDemo 
{
	public static void main (String[] args) throws Exception
	{
		Class.forName("org.postgresql.Driver");
		
		
		String URL = "jdbc:postgresql://localhost:5432/jdbcdb";
		String PASSWORD = "postgres";
		String USERNAME = "postgres";
	
		Connection con = DriverManager.getConnection(URL,USERNAME,PASSWORD);
		
		
		
		
		
	}

}
