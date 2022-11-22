package com.myweb.wepage.newproject1.daoclasses;
import java.sql.Connection;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.myweb.wepage.newproject1.dao.DataBaseClass;
import com.myweb.wepage.newproject1.members.User_page;



public class Userclass extends  DataBaseClass{


		public User_page selectUser_pageByEmailAndPassword(String email, String password) {
			User_page user_page = null;
			
			Connection con = null;
	    	Statement stmt = null;
	    	ResultSet rs = null;
	    	
	        try {
	        	con = getDbConnection();
				stmt = con.createStatement();
				
				String sql = "SELECT user_name" +
							" FROM user WHERE " +
							"user_email='" + email + 
							"' AND user_pass='" + password +
							"'";
				
				rs = stmt.executeQuery(sql);
				if (rs.next()) {
					user_page = new User_page();
					
					user_page.setUser_name(rs.getString(1));
					user_page.setUser_email(rs.getString(2));
					user_page.setUser_pass(rs.getString(3));
					
					
				}
			} catch (SQLException sqlEx) {
				sqlEx.printStackTrace();
			} finally {
				closeResultSet(rs);
				closeStatement(stmt);
				closeDbConnection(con);
			}
			
			return user_page;
		}
		
		public  boolean insertUser_page(User_page user_page) {
			boolean status = false;
			
			Connection dbCon = null;
			Statement stmt = null;
			
			try {
				dbCon = getDbConnection();
				stmt = dbCon.createStatement();
				
				String sql = "INSERT INTO user VALUES('"
							 +user_page.getUser_name() + 
							 "', '" + user_page.getUser_email() + 
							 "','" + user_page.getUser_pass() + "')";
							
							
				int row = stmt.executeUpdate(sql);
				if (row != 0) {
					status = true;
				}
			} catch (SQLException sqlEx) {
				sqlEx.printStackTrace();
			} finally {
				closeStatement(stmt);
				closeDbConnection(dbCon);
			}
			
			return status;
		}
		
		
		

		
		
	}


