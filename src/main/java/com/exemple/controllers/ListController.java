
package com.exemple.controllers;

import java.io.IOException;
import java.util.List;

import com.exemple.dao.PersonDao;
import com.exemple.models.Person;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.RequestDispatcher;
/**
 * Servlet implementation class ListController
 */

@WebServlet(urlPatterns={"/list"})
public class ListController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	PersonDao personDao=new PersonDao();
    public ListController() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		List<Person> persons;
		persons=personDao.getAllPersons();
		request.setAttribute("Persons", persons);
		RequestDispatcher dispacher=request.getRequestDispatcher("views/list.jsp");
		dispacher.forward(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Long DeletedId=Long.parseLong(request.getParameter("id"));
		personDao.DeleteById(DeletedId);
		response.sendRedirect(request.getContextPath() + "/list");
	}

}
