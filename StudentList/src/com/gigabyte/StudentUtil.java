package com.gigabyte;

import java.sql.Statement;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentUtil 
{
	static String sql="select * from studentsd";
	public static ArrayList<Student> getStudent() throws SQLException, ClassNotFoundException
	{
		ArrayList<Student> student=new ArrayList<Student>();
		Connection con=DbConnection.getConnection();
		Statement st=con.createStatement();
	    ResultSet rs=st.executeQuery(sql);
	    while(rs.next())
	    {
	    	int id=rs.getInt("id");
	    	String fname=rs.getString("fname");
	    	String lname=rs.getString("lname");
	    	String email=rs.getString("email");
	    	student.add(new Student(id, fname, lname, email));
	    	
	    }
	    con.close();
	    return student;
		
	}

}
