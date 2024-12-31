package in.sati.backend;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class MyServlet extends HttpServlet
{
	protected void doGet(HttpServletRequest request , HttpServletResponse response) throws ServletException, IOException
	{
		PrintWriter out = response.getWriter();
		
		out.print("I am Satsih. for browser");
		
		System.out.println("I AM SATISH");
		
	}

}
