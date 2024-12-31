package satiServlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/submitForm")
public class MyServlet extends HttpServlet
{
	protected void service(HttpServletRequest req,HttpServletResponse resp) throws ServletException,IOException
	{
		String myname = req.getParameter("name1");
		String myemail = req.getParameter("email1");
		
		System.out.println("HI HELLO NAMSTE");
		
		PrintWriter out = resp.getWriter();
		out.print("NAME: "+myname);
		out.print("EMAIL: "+myemail);
		
		
	}

}
