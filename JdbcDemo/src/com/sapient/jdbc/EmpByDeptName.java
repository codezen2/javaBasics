package com.sapient.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class EmpByDeptName {
	public static void main(String[] args) throws ClassNotFoundException, SQLException
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Department name");
		String na=scan.next();
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		String url="jdbc:oracle:thin:@localhost:1521:xe"; //for same pc
		Connection conn=DriverManager.getConnection(url,"system","sapient123");
		
		String sql="select eid ,e.ename,e.sal,d.dname from sap_emp e inner join sap_dept d ON d.did=e.dept_id where d.dname=?";
		PreparedStatement st= conn.prepareStatement(sql);
		st.setString(1,na);
		ResultSet rs=st.executeQuery();
		
		System.out.printf("%10s%20s%20s%20s","ID","NAME","SALARY","DNAME");
		System.out.println("\n_______________________________________________________________________________");
		while(rs.next())
		{
			int id=rs.getInt("EID");
			String name=rs.getString("ename");
			double sal=rs.getDouble("sal");
			String dname=rs.getString("dname");
			System.out.printf("\n%10d%20s%20.2f%20s",id,name,sal,dname);
		}
		System.out.println("\n______________________________________________________________________________");

		conn.close();
		scan.close();
	}
}
