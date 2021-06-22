// page 14 ---- it will take the id from update student page and fetch all the details belongs to that id
package com.upfateStudent;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.gigabyte.DbConnection;
import com.gigabyte.Student;

public class UpdateStudentDb 
{
	static String sql="select * from data.studentsd where id=?"; // query for fetching the details from database

	public Student getStudDetails(int id) throws ClassNotFoundException, SQLException 
	{ 
		Connection con=DbConnection.getConnection(); // take the connection from dbconnection class
		PreparedStatement st=con.prepareStatement(sql);
		st.setInt(1, id); 
		ResultSet rs=st.executeQuery();
		rs.next();
	    int idd=rs.getInt("id");// it will take the id
		String fname=rs.getString("fname"); // it will take the fname from database
		String lname=rs.getString("lname"); // it will take the lname from database
		String email=rs.getString("email"); // it will take the email id from database
		Student stud=new Student(idd, fname, lname, email); // pass the details to the student bean to intialize
		return stud; // pass the student details object back to the update student class
		
		
	}

}

