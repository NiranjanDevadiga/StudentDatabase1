// page 11--- delete the student record from database
package com.deletestudent;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.gigabyte.DbConnection;

public class DeleteStudent 
{
	static String sql="delete from data.studentsd where id=?"; // query for deleting the student record from database

	public void deletStudent(int id) throws ClassNotFoundException, SQLException 
	{
		Connection con=DbConnection.getConnection(); // get the connection from dbconnection class
		PreparedStatement st=con.prepareStatement(sql);
		st.setInt(1, id);// delete this student record from database
		st.executeUpdate();
		con.close();
		
		
	}

}
