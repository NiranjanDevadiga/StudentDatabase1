// page 1--- starting
package com.gigabyte;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class StudentServlet
 */

@WebServlet("/StudentServlet")// whnever we call studentServelet this annotation tells us this is the studentservlet 
public class StudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			list(request,response); // it will call list method and passes req and res
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
    // list method
	private void list(HttpServletRequest request, HttpServletResponse response) throws SQLException, ServletException, IOException, ClassNotFoundException {
		ArrayList<Student> student=StudentUtil.getStudent(); // it will take the data from getstudent method of Student util class --- page 2
		request.setAttribute("studentlist", student); // it will add the student object to request
		RequestDispatcher dis=request.getRequestDispatcher("/StudentdataView.jsp"); // it is a dipatcher, it is used to ensfer the control to the one page to another oage, here we use ths for transfer the student data to studentview jsp file to display the student list
		dis.forward(request, response);// we forwrded the request and response to student data view jsp file  --- page 5
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
