package com.myweb.wepage.newproject1.dao;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DataBaseClass {
	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
		}catch(ClassNotFoundException ce) {
			
			ce.printStackTrace();
		}
	}
	
	public Connection getDbConnection() {
		Connection con=null;
		try {
			
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/data2","sandhyarani","sandhya@1272001");
			
		}catch(SQLException e) {
			
			e.printStackTrace();
		
		}
		return con;
	}
	public void closeStatement(Statement stmt) {
		try {
			if(stmt!=null) {
				stmt.close();
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void closeResultSet(ResultSet rs) {
		try {
			if(rs!=null) {
				rs.close();
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void closeDbConnection(Connection con) {
		try {
			if(con!=null) {
				con.close();
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}

}
