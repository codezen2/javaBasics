package com.sapient.vo;

public class Emp implements Comparable<Emp>{
	
	/*eid,ename,sal;
	 *1.	display employees in desc order of salary
	 *2. 	Display employees in order of employee name
	 *3. 	collect all the employees in the new list whose salary >=25k
	 *4.	count no of employees earning >=25k
	 *5.	Sum all the employees salary using reduce method
	 *6.  	Update the employees salary by 10%
	 *7. 	Find the maximum earning salary
	 */
	
	private int eid;
	private String ename;
	private Double sal;
	
	public Emp(int eid, String ename, double sal) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.sal = sal;
	}

	public int getEid() {
		return eid;
	}

	public String getEname() {
		return ename;
	}

	public Double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

	@Override
	public int compareTo(Emp emp) {
		Integer e1=this.eid;
		Integer e2=emp.eid;
		return e1.compareTo(e2);
	}
	
	
	
	
}
