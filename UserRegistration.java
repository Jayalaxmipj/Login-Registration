package com.fujitsu.login_Registration;

import java.io.IOException;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fujitsu.login_Registration.DAO.UserRegistrationDao;
import com.fujitsu.login_Registration.model.User;

/**
 * Servlet implementation class UserRegistration
 */
@WebServlet("/UserRegistration")
public class UserRegistration extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		UserRegistrationDao dao;
		System.out.println("Running user registration controller");
		
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		int phone=Integer.parseInt(request.getParameter("phone"));
		String address=request.getParameter("address");
		
		Random random=new Random();
		int userId= random.nextInt(999);
		System.out.println(userId);
		User newUser= new User(userId,username,password,phone,address);
		System.out.println(newUser);
		
		dao=new UserRegistrationDao();
		boolean result=dao.registerUser(newUser);
		
		if(result)
		{
			System.out.println("user registered sucessfully");
		}
		else
		{
			System.out.println("internal server error");
			
			
		}
	}

}
