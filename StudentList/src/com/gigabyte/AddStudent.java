package com.gigabyte;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class AddStudent 
{
    static String sql="insert into data.studentsd values(?,?,?,?)";
	public void addToDb(Student newStudent) throws ClassNotFoundException, SQLException 
	{
		Connection con=DbConnection.getConnection();
		PreparedStatement st=con.prepareStatement(sql);
		st.setInt(1, newStudent.getId());
		st.setString(2, newStudent.getFname());
		st.setString(3, newStudent.getLname());
		st.setString(4, newStudent.getEmail());
		st.executeUpdate();
		con.close();
	}

}
