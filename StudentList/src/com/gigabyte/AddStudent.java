// page 8--- add the student details to the database
package com.gigabyte;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class AddStudent 
{
    static String sql="insert into data.studentsd values(?,?,?,?)";// quesry for adding the students data to the database
	public void addToDb(Student newStudent) throws ClassNotFoundException, SQLException 
	{
		Connection con=DbConnection.getConnection(); // it will take the database coonnection from dbconnection class
		PreparedStatement st=con.prepareStatement(sql);
		st.setInt(1, newStudent.getId());// this statement add the student id to the database
		st.setString(2, newStudent.getFname());// this statement add the student fname to the database
		st.setString(3, newStudent.getLname());// this statement add the student lname to the database
		st.setString(4, newStudent.getEmail());// this statement add the student emailid to the database
		st.executeUpdate();
		con.close();
	}

}
