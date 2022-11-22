package com.myweb.wepage.newproject1.members;

public class Admin_page {
	private int user_id;
	private String user_name;
	private String user_email;
	private String user_pass;
	
	public Admin_page() {}

	public Admin_page(int user_id, String user_name, String user_email, String user_pass) {
		super();
		this.user_id = user_id;
		this.user_name = user_name;
		this.user_email = user_email;
		this.user_pass = user_pass;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
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
		return "Admin_page [user_id=" + user_id + ", user_name=" + user_name + ", user_email=" + user_email
				+ ", user_pass=" + user_pass + "]";
	}
	

}
