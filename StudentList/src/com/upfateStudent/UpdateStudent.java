// page 13-- this page fetch the all data belongs to the enterd student id
package com.upfateStudent;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.gigabyte.Student;

/**
 * Servlet implementation class UpdateStudent
 */
@WebServlet("/UpdateStudent")
public class UpdateStudent extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateStudent() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id=Integer.parseInt(request.getParameter("id"));// takes the id from update student html page
		UpdateStudentDb ob=new UpdateStudentDb(); // create the object of the updatestudentdb class
	    ArrayList<Student> stud=new ArrayList<Student>(); // arraylist for storing the student data of entered id
		try {
			stud.add(ob.getStudDetails(id)); // getstudentDetails method of updatestudentdb class takes the entered id and fetch the entered id details from record, after fetching record add the details to the arralist
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		request.setAttribute("studlist", stud); // add the student object returned from updatestudentdb class to the request
		RequestDispatcher disp=request.getRequestDispatcher("/EditStudent.jsp");// transfer the control to the editstudent jsp page
		disp.forward(request, response); // pass the req i.e student object and response
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
