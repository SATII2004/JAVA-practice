package sati.test;

// Import necessary JDBC classes
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class InsertDemo 
{
    public static void main(String[] args) 
    {
        Connection con = null; // Declare Connection outside try block
        try 
        {
            // Step 1: Load the PostgreSQL JDBC driver
            Class.forName("org.postgresql.Driver");
            System.out.println("Driver Class loaded successfully");
            
            // Database connection details
            final String USERNAME = "postgres";  
            final String PASSWORD = "postgres";  
            final String URL = "jdbc:postgresql://localhost:5432/drugdetails"; 
            
            // Step 2: Establish the connection
            con = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            System.out.println("Connection established successfully");
        } 
        catch (ClassNotFoundException e) 
        {
            System.err.println("PostgreSQL JDBC Driver not found. Include it in your library path.");
            e.printStackTrace();
        } 
        catch (SQLException e) 
        {
            System.err.println("Connection failed. Check the console for details.");
            e.printStackTrace();
        } 
        finally 
        {
            // Close the connection if it was established
            if (con != null) 
            {
                try 
                {
                    con.close();
                    System.out.println("Connection closed.");
                } 
                catch (SQLException e) 
                {
                    e.printStackTrace();
                }
            }
        }
    } 
}
