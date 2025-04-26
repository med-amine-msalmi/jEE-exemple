package exemple;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import models.Person;

/**
 * Servlet implementation class Reigister
 */
@WebServlet(urlPatterns={"/register"})
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}
	
	//without validation
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String FullName=request.getParameter("fullname");
		PrintWriter out=response.getWriter();	
		String email=request.getParameter("email");
		LocalDate birthdate=LocalDate.parse(request.getParameter("birthdate"));
		String Gender=request.getParameter("gender");
		String MaritalStatus=request.getParameter("MaritaStatus");
		Person person=new Person(FullName,email,birthdate,Gender,MaritalStatus);
		
		//Add it to the request scope . we store the object in the request or session 
		request.setAttribute("person",person);
		
		//Forward to the jsp 
		RequestDispatcher dispacher=request.getRequestDispatcher("Profile.jsp");
		dispacher.forward(request, response);
		
		
		
	}
	



}

