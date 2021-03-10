package com.fujitsu.login_Registration.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.fujitsu.login_Registration.model.User;

public class UserRegistrationDao {

	public boolean registerUser(User user)
	{
		
		
		System.out.println("start of UserRegistrationDAO ::registerUser");
		String url="jdbc:mysql://localhost:3306/test1";
		String db_username="root";
		String db_password="Jayapj*18";
		Connection con;
		PreparedStatement pstmt;
		
		String sql="insert into values(?,?,?,?,?)";
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection(url,db_username,db_password);
			pstmt=con.prepareStatement(sql);
			
			pstmt.setInt(1, user.getId());
			pstmt.setString(2, user.getUsername());
			pstmt.setString(3, user.getPassword());
			pstmt.setInt(4, user.getPhone());
			pstmt.setString(5, user.getAddress());
			
			
			int result=pstmt.executeUpdate();
			if(result>0)
				return true;
			return false;
		}
		
		catch(Exception e){
			e.printStackTrace();
		}
			
			System.out.println("end of UserRegistrationDAO ::registerUser");
			return false;
			
			
			
		}
	}

