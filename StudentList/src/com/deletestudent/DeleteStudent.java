package com.deletestudent;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.gigabyte.DbConnection;

public class DeleteStudent 
{
	static String sql="delete from data.studentsd where id=?";

	public void deletStudent(int id) throws ClassNotFoundException, SQLException 
	{
		Connection con=DbConnection.getConnection();
		PreparedStatement st=con.prepareStatement(sql);
		st.setInt(1, id);
		st.executeUpdate();
		con.close();
		
		
	}

}
