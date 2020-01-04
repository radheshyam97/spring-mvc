package com.rit.model;

public class UserDetails {
	private String uname;
	private String pass;

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	@Override
	public String toString() {
		return "UserDetails [uname=" + uname + ", pass=" + pass + ", getUname()=" + getUname() + ", getPass()="
				+ getPass() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

}
