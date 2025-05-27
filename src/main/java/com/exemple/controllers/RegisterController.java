package com.exemple.controllers;
import java.io.IOException;
import java.time.LocalDate;

import com.exemple.dao.PersonDao;
import com.exemple.models.Person;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Reigister
 */
@WebServlet(urlPatterns={"/register"})
public class RegisterController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private PersonDao personDao=new PersonDao();
	
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}
	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String FullName=request.getParameter("fullname");
		String email=request.getParameter("email");
		LocalDate birthdate=LocalDate.parse(request.getParameter("birthdate"));
		String Gender=request.getParameter("gender");
		String MaritalStatus=request.getParameter("MaritaStatus");
		Person person=new Person(FullName,email,birthdate,Gender,MaritalStatus);
		
		//save the object to the database 
	
		personDao.Save(person);
		
		//Add it to the request scope . we store the object in the request or session 
		request.setAttribute("person",person);
		//forward the object to Profile.jsp
		RequestDispatcher dispacher=request.getRequestDispatcher("views/Profile.jsp");
		dispacher.forward(request,response);
		
	}
	



}

