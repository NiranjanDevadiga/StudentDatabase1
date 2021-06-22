// page 16-- it will take the updated data from editstudent page and and updated in the database
package com.upfateStudent;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.gigabyte.Student;

/**
 * Servlet implementation class UpdateServlet
 */
@WebServlet("/UpdateServlet")
public class UpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id= Integer.parseInt( request.getParameter("id")) ; // it will take the id from edit student jsp
		String fname=request.getParameter("fname");// it will take the fname from edit student jsp
		String lname=request.getParameter("lname");// it will take the lname from edit student jsp
		String email=request.getParameter("email");// it will take the emailid from edit student jsp
		Student upStudent=new Student(id,fname,lname,email); // pass it to the student bean
		UpSt obj=new UpSt();// create object of the Upst class
		try {
			obj.upStud(upStudent); // upstud method update the student details in database
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		RequestDispatcher disp=request.getRequestDispatcher("/EditStudent.jsp");// it will transfer the control to the edit student jso file
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
