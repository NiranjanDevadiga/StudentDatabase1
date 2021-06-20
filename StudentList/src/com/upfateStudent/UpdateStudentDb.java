package com.upfateStudent;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.gigabyte.DbConnection;
import com.gigabyte.Student;

public class UpdateStudentDb 
{
	static String sql="select * from data.studentsd where id=?";

	public Student getStudDetails(int id) throws ClassNotFoundException, SQLException 
	{ 
		Connection con=DbConnection.getConnection();
		PreparedStatement st=con.prepareStatement(sql);
		st.setInt(1, id);
		ResultSet rs=st.executeQuery();
		rs.next();
	    int idd=rs.getInt("id");
		String fname=rs.getString("fname");
		String lname=rs.getString("lname");
		String email=rs.getString("email");
		Student stud=new Student(idd, fname, lname, email);
		return stud;
		
		
	}

}

