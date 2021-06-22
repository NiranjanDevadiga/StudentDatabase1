// page 7 -- take the new students details coming from new student html page
package com.gigabyte;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



/**
 * Servlet implementation class NewStudentServlet
 */
@WebServlet("/NewStudentServlet")
public class NewStudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public NewStudentServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id= Integer.parseInt( request.getParameter("id")) ; // it will take the student id from new student html page
		String fname=request.getParameter("fname");// it will take the student fname from new student html page
		String lname=request.getParameter("lname");// it will take the student lname from new student html page
		String email=request.getParameter("email");// it will take the student emailid from new student html page
		Student newStudent=new Student(id,fname,lname,email); // we will pass all the data to student beans for initializing
		AddStudent obj=new AddStudent(); // here we created the object of the add student class
		try {
			obj.addToDb(newStudent); // addtoDb method of addstudent class will add the student data to the data base-- page 8
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		RequestDispatcher disp=request.getRequestDispatcher("/NewStudent.html"); // once we add the new student data to the database we transfer control to the new student html page
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
