package com.rit.dto;

import java.io.Serializable;

public class EmployeeDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int no, salary;
	private String name,desg;
	

	public EmployeeDTO(int no, int salary, String name, String desg) {
		super();
		this.no = no;
		this.salary = salary;
		this.name = name;
		this.desg = desg;
	}
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesg() {
		return desg;
	}
	public void setDesg(String desg) {
		this.desg = desg;
	}

}
