package com.sapient.vo;

public class Dept implements Comparable<Dept>{
	private int deptId;
	private String deptName;
	
	public int getDeptId() {
		return deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public Dept(int deptId, String deptName) {
		super();
		this.deptId = deptId;
		this.deptName = deptName;
	}

	public String toString() {
		return deptId+" "+deptName;
	}

	public int compareTo(Dept d) {
		Integer e1=this.deptId;
		Integer e2=d.deptId;
		return e1.compareTo(e2);
	}
}
