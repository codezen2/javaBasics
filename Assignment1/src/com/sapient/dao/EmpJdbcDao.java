package com.sapient.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import com.sapient.exception.IdException;
import com.sapient.exception.NotfoundException;
import com.sapient.vo.Emp;

public class EmpJdbcDao implements IDao {
	public static Map<Integer, Emp> emap;
	private static Connection conn;
	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe"; // for same pc
			conn = DriverManager.getConnection(url, "system", "Sapient123");
		} catch (SQLException | ClassNotFoundException e) {
			System.out.println(e);
		}
	}

	@Override
	public List<Emp> viewEmployee() {
		String sql = null;
		PreparedStatement st = null;
		sql = "select * from sap_emp";
		try {
			st = conn.prepareStatement(sql);
			ResultSet rs = st.executeQuery();
			System.out.printf("%10s%20s%20s%10s%20s", "ID", "Name", "SAL", "DID", "DOJ");
			System.out.println("\n_______________________________________________________________________________");
			while (rs.next()) {
				int id = rs.getInt("EID");
				String name = rs.getString("ename");
				double sal = rs.getDouble("sal");
				int did = rs.getInt("dept_id");
				String doj = rs.getString("doj");
				System.out.printf("\n%10d%20s%20.2f%10d%20s", id, name, sal, did, doj);
			}
			System.out.println("\n______________________________________________________________________________");

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return null;
	}

	@Override
	public Emp viewEmployee(int eid) throws NotfoundException {
		String sql="select * from sap_emp where dept_id=?";
		PreparedStatement st;
		try {
			st = conn.prepareStatement(sql);
			st.setDouble(1,eid); // sets value in prepared statement
			ResultSet rs=st.executeQuery();
			System.out.printf("%10s%20s%20s%10s%20s","ID","Name","SAL","DID","DOJ");
			System.out.println("\n_______________________________________________________________________________");
			while(rs.next())
			{
				int id=rs.getInt("EID");
				String name=rs.getString("ename");
				double sal=rs.getDouble("sal");
				int did=rs.getInt("dept_id");
				String doj=rs.getString("doj");
				//System.out.println(id+" "+name+" "+sal+" "+did);
				System.out.printf("\n%10d%20s%20.2f%10d%20s",id,name,sal,did,doj);

			}
			System.out.println("\n______________________________________________________________________________");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	return null;
	}

	@Override
	public int addEmployee(Emp emp) throws IdException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int removeEmployee(int eid) throws NotfoundException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateEmployee(int eid, double sal) throws NotfoundException {
		// TODO Auto-generated method stub
		return 0;
	}

}
