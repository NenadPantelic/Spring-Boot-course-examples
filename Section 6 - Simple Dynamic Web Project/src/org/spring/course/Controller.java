package org.spring.course;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.spring.course.models.Person;

@WebServlet("/")
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Controller() {
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		List<Person> persons = new ArrayList<Person>() {
			{
				add(new Person("Nenad", 23));
				add(new Person("John", 30));
			}
		};
		request.setAttribute("persons", persons);
		request.getRequestDispatcher("view.jsp").forward(request, response);

	}

}
