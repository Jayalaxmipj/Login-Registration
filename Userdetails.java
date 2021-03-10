package com.fujitsu.login_Registration;

import java.io.IOException;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fujitsu.login_Registration.DAO.UserRegistrationDao;
import com.fujitsu.login_Registration.model.User;

/**
 * Servlet implementation class Userdetails
 */
@WebServlet("/Userdetails")
public class Userdetails extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		UserRegistrationDao dao=new UserRegistrationDao();
		ResultSet rs=dao.getDetails();
		User user;
		ArrayList arr=new ArrayList();
		try {
			while(rs.next())
			{
				arr.add("id : "+(rs.getInt(1)));
				arr.add("username : "+(rs.getString(2)));
				arr.add("password : "+(rs.getString(3)));
				arr.add("phone : "+(rs.getInt(4)));
				arr.add("address : "+(rs.getString(5)));
				System.out.println("\n");
				
				
			}
			request.setAttribute("arr", arr);
			request.getRequestDispatcher("admin.jsp").forward(request, response);
			for(int i=0;i<arr.size();i++)
				System.out.println(arr.get(i));
			}
		catch(Exception e)
		{
			e.printStackTrace();
			
		}
		System.out.println("end of dopost");
		
		
	}

}
