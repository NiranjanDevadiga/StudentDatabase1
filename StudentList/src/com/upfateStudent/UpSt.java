// page 17--- this class take the data from updatesrvlet and update the data to the dtabase
package com.upfateStudent;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.gigabyte.DbConnection;
import com.gigabyte.Student;

public class UpSt 
{
	static String sql="update data.studentsd set fname=?,lname=?,email=? where id=?";
	public void upStud(Student upStudent) throws ClassNotFoundException, SQLException 
	{
		Connection con=DbConnection.getConnection();
		PreparedStatement st=con.prepareStatement(sql);
		st.setString(1, upStudent.getFname());
		st.setString(2, upStudent.getLname());
		st.setString(3, upStudent.getEmail());
		st.setInt(4, upStudent.getId());
		st.executeUpdate();
		con.close();
		
	}

}
