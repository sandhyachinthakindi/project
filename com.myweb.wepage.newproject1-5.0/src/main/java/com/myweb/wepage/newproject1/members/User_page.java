
package com.myweb.wepage.newproject1.members;

public class User_page {
	
	private String user_name;
	private String user_email;
	private String user_pass;
	
	

	public User_page() {}

	public User_page( String user_name, String user_email, String user_pass) {
		super();
		
		this.user_name = user_name;
		this.user_email = user_email;
		this.user_pass = user_pass;
	}

	

	

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getUser_email() {
		return user_email;
	}

	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}

	public String getUser_pass() {
		return user_pass;
	}

	public void setUser_pass(String user_pass) {
		this.user_pass = user_pass;
	}

	@Override
	public String toString() {
		return "User_page [user_name=" + user_name + ", user_email=" + user_email + ", user_pass=" + user_pass + "]";
	}

	

}
