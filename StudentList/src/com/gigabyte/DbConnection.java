// page 3 ---- to return the database connection
package com.gigabyte;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection 
{
	static String uname="nndevaadiga";
	static String paswrd="nndevaadiga";
	static String url="jdbc:mysql://localhost:3306/data";
	public static Connection getConnection() throws ClassNotFoundException, SQLException
	{
        Class.forName("com.mysql.jdbc.Driver"); // mandatory
		Connection con=DriverManager.getConnection(url, uname, paswrd);
		return con; // it will return the database connection
		
	}

}
