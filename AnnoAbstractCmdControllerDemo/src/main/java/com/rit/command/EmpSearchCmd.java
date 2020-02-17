package com.rit.command;

public class EmpSearchCmd {
	
	private int no, salary;
	private String name,desg;
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
	@Override
	public String toString() {
		return "EmpSearchCmd [no=" + no + ", salary=" + salary + ", name=" + name + ", desg=" + desg + "]";
	}
	

}
