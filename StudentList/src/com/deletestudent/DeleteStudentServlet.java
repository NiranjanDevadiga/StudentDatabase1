// page 10--- it will take student id from delete student html page and delete the student record in database
package com.deletestudent;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DeleteStudentServlet
 */
@WebServlet("/DeleteStudentServlet")
public class DeleteStudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteStudentServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id=Integer.parseInt(request.getParameter("id"));//it will take student id from delete student html page
		DeleteStudent ob=new DeleteStudent(); // create the object of the delete student class
		PrintWriter out=response.getWriter();
		try {
			ob.deletStudent(id); // pass the id to the deleteStudent id method og delete student class to delete the data from the student database
		} catch (ClassNotFoundException e) {
			out.println("id is not found");
			
		} catch (SQLException e) {
			out.println("id is not found");
			
		}
		RequestDispatcher disp=request.getRequestDispatcher("/DeleteStudent.html");// oce we delete the record from the database transfer the control to the deletestudent html page 
		disp.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
