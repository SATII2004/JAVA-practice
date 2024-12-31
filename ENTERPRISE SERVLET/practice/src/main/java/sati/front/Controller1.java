package sati.front;

import java.io.IOException;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;

@WebServlet("/Controller1")
public class Controller1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

    
   

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Integer collegeId = Integer.parseInt(request.getParameter("cId"));
		Integer collegeName
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
