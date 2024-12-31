package sati.backend;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeParseException;

@WebServlet("/UserInformation_and_AgeCalculation")
public class AgeCalculator extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        // Extract form data
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String dobStr = request.getParameter("dob");

        try {
            // Parse date of birth
            LocalDate dob = LocalDate.parse(dobStr);
            LocalDate currentDate = LocalDate.now();

            // Calculate age
            int age = Period.between(dob, currentDate).getYears();

            // Generate output
            out.println("<html><body>");
            out.println("<p><b>Greeting: </b>\"Hello, " + name + "!\"</p>");
            out.println("<p><b>Email: </b>\"" + email + "\"</p>");
            out.println("<p><b>Age: </b>\"You are " + age + " years old.\"</p>");
            out.println("</body></html>");
        } catch (DateTimeParseException e) {
            // Error handling for invalid date format
            out.println("<html><body>");
            out.println("<h2>Error: Invalid date of birth format.</h2>");
            out.println("</body></html>");
        }
    }
}




/*
 mvc=model view controller;
 
 */
