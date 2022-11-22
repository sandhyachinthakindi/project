package com.myweb.wepage.newproject1.servlets;




import java.io.IOException;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.myweb.wepage.newproject1.daoclasses.Userclass;
import com.myweb.wepage.newproject1.members.User_page;
public class Registerservlet extends HttpServlet{
	
	
	
Userclass userclass = new Userclass();
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		RequestDispatcher rd = null;
		
		String name=req.getParameter("name");
		String email = req.getParameter("e");
		String password = req.getParameter("p");
		
		//User_page user_page = userclass.insertUserclass(id,name,email,password);
		User_page user_page = new User_page(name,email,password);
		boolean status = userclass.insertUser_page(user_page);
		if(status)
		{
			//req.setAttribute("REGISTRATIONSTATUS", "success");
			rd = req.getRequestDispatcher("./index.jsp");
		}else
		{
			//req.setAttribute("REGISTRATIONSTATUS", "failure");
			rd = req.getRequestDispatcher("./index.jsp");
		}
		
		rd.forward(req, resp);
		}

}