package hello.backend;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Login extends HttpServlet
{
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException , IOException
	{
		System.out.println("I am a service method..");
	}

}
