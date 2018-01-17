package com.sapient.vo;

import java.time.LocalDate;
import java.util.Date;

public class Emp implements Comparable<Emp> {
	private int empId;
	private String empName;
	private double sal;
	private int deptId;
	private LocalDate doj;
	private String img;
	private String pwd;

	public Emp(int empId, String empName, double sal, int deptId, LocalDate doj, String img, String pwd) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.sal = sal;
		this.deptId = deptId;
		this.doj = doj;
		this.img = img;
		this.pwd = pwd;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

	public int getDeptId() {
		return deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}

	public LocalDate getDoj() {
		return doj;
	}

	public void setDoj(LocalDate doj) {
		this.doj = doj;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public Emp(int empId, String empName, double sal, int deptId, LocalDate date) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.sal = sal;
		this.deptId = deptId;
		this.doj = date;
	}

	@Override
	public String toString() {
		return empId + " " + empName + " " + sal + " " + deptId + " " + doj;
	}

	@Override
	public int compareTo(Emp emp) {
		Integer e1 = this.empId;
		Integer e2 = emp.empId;
		return e1.compareTo(e2);
	}

}
