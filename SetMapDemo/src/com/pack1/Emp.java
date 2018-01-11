package com.pack1;

public class Emp implements Comparable<Emp> {
	private int empId;
	private String ename;
	private double sal;

	public Emp(int empId, String ename, double sal) {
		super();
		this.empId = empId;
		this.ename = ename;
		this.sal = sal;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return empId + " " + ename + " " + sal;
	}

	@Override
	public int compareTo(Emp emp) {
		// .sort method uses it
		Integer e1 = this.empId;
		Integer e2 = emp.empId;
		return e1.compareTo(e2);
	}

	/**
	 * @return the empId
	 */
	public int getEmpId() {
		return empId;
	}

	/**
	 * @return the ename
	 */
	public String getEname() {
		return ename;
	}

	/**
	 * @return the sal
	 */
	public double getSal() {
		return sal;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		Emp emp = (Emp) obj;
		if (this.empId == emp.empId)
			return true;
		else
			return false;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		// to make some unique element
		return empId;
	}

}
