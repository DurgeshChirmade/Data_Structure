package com.sort;

public class Employee {

	private int empid;
	private String ename;
	private float salary;

	public Employee() {
		this.empid = 0;
		this.ename = null;
		this.salary = 0.0f;
	}

	public Employee(int empid, String ename, float salary) {
		super();
		this.empid = empid;
		this.ename = ename;
		this.salary = salary;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Nodes [empid=" + empid + ", ename=" + ename + ", salary=" + salary + "]";
	}
}
