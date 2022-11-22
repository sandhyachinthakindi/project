package com.myweb.wepage.newproject1.servlets;


import javax.servlet.http.HttpServlet;



import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.myweb.wepage.newproject1.daoclasses.Userclass;
import com.myweb.wepage.newproject1.members.Admin_page;
import com.myweb.wepage.newproject1.members.User_page;


public class Loginservlet extends HttpServlet{
	
Userclass userclass = new Userclass();
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		RequestDispatcher rd = null;
		
		String email = req.getParameter("e");
		String password = req.getParameter("p");
		
		User_page user_page = userclass.selectUser_pageByEmailAndPassword(email, password);
    	if(user_page != null) {
    		//HttpSession session = req.getSession();
    		//session.setAttribute("EMPLOYEEDATA", employee);
    		req.setAttribute("user_data", user_page);
				
			rd = req.getRequestDispatcher("./update.html");
		} else {
			req.setAttribute("LOGINSTATUS", "invalid");
			
			rd = req.getRequestDispatcher("./Loginfail.jsp");
		}
    	
    	rd.forward(req, resp);
	}
		
}