// page 2 ---- to return the student data
package com.gigabyte;

import java.sql.Statement;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentUtil 
{
	static String sql="select * from studentsd"; // it will select all the data from data base
	public static ArrayList<Student> getStudent() throws SQLException, ClassNotFoundException
	{
		ArrayList<Student> student=new ArrayList<Student>(); // craete array list for storing the student data object
		Connection con=DbConnection.getConnection(); // it will take the database connection from getConnection of Db connection class --- page 3
		Statement st=con.createStatement();
	    ResultSet rs=st.executeQuery(sql);
	    while(rs.next())
	    {
	    	int id=rs.getInt("id");// it will take the data from id column in database
	    	String fname=rs.getString("fname");// it will take the data from fname column in database
	    	String lname=rs.getString("lname");// it will take the data from lname column in database
	    	String email=rs.getString("email");// it will take the data from emailid column in database
	    	student.add(new Student(id, fname, lname, email)); // pass the all the data to student bean to intialize --- page 4
	    	
	    }
	    con.close();
	    return student; // returns the student arraylist which contains student object
		
	}

}
