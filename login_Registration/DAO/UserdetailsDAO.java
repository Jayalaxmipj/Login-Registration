package com.fujitsu.login_Registration.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UserdetailsDAO {
	public ResultSet getDetails()
	{
		String url = "jdbc:mysql://localhost:3306/student";
		String db_uname="root";
		String db_pwd="sahana@07";
		Connection con;
		PreparedStatement stmt;
		ResultSet rs=null;
		String sql="select * from user1";
	
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection(url,db_uname, db_pwd);
			stmt=con.prepareStatement(sql);
			
			 rs=stmt.executeQuery(sql);
			
			return rs;
		}
			catch(Exception e)
		{
				e.printStackTrace();
		}
		return rs;
	}

}
