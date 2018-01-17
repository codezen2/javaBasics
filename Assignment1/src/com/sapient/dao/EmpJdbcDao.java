package com.sapient.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import com.sapient.exception.IdException;
import com.sapient.exception.NotfoundException;
import com.sapient.vo.Dept;
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
	public List<Emp> viewEmployee() throws SQLException, ParseException {
		Emp emp = null;
		List<Emp> lst = new ArrayList<Emp>();
		String sql = "select * from sap_emp";
		PreparedStatement st = conn.prepareStatement(sql);
		ResultSet rs = st.executeQuery();
		int id = 0;
		double sal = 0.0;
		int did = 0;
		String doj = null;
		String name = null;
		while (rs.next()) {
			id = rs.getInt("eid");
			name = rs.getString("ename");
			sal = rs.getDouble("sal");
			did = rs.getInt("dept_id");
			doj = rs.getString("doj");
			DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:SS");
			LocalDate date = LocalDate.parse(doj.toString(), df);
			System.out.println(id + " " + name + " " + sal + " " + did + " " + date);
			emp = new Emp(id, name, sal, did, date);
			lst.add(emp);
		}
		return lst;
	}

	@Override
	public Emp viewEmployee(int eid) throws NotfoundException, ParseException, SQLException {
		String sql = "select * from sap_emp where eid=?";
		PreparedStatement st;
		Emp emp = null;
		st = conn.prepareStatement(sql);
		st.setDouble(1, eid);
		ResultSet rs = st.executeQuery();
		while (rs.next()) {
			int id = rs.getInt("EID");
			String name = rs.getString("ename");
			double sal = rs.getDouble("sal");
			int did = rs.getInt("dept_id");
			String doj = rs.getString("doj");
			DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:SS");
			LocalDate date = LocalDate.parse(doj, df);
			emp = new Emp(id, name, sal, did, date);
		}
		return emp;
	}

	@Override
	public int addEmployee(Emp emp) throws IdException, SQLException {
		String sql = "insert into sap_emp values(?,?,?,?,?)";
		PreparedStatement st = conn.prepareStatement(sql);
		int id = emp.getEmpId();
		String name = emp.getEmpName();
		double sal = emp.getSal();
		int did = emp.getDeptId();
		LocalDate d = emp.getDoj();
		st.setInt(1, id);
		st.setString(2, name);
		st.setDouble(3, sal);
		st.setInt(4, did);
		Date date = Date.valueOf(d);
		st.setDate(5, date);
		System.out.println(date);
		int rows = st.executeUpdate();
		return 1;
	}

	@Override
	public int removeEmployee(int eid) throws NotfoundException, SQLException {
		String sql = "DELETE FROM sap_emp WHERE eid=?;";
		PreparedStatement st = conn.prepareStatement(sql);
		st.setDouble(1, eid);
		int rows = st.executeUpdate();
		return rows;
	}

	@Override
	public int updateEmployee(int eid, double sal) throws NotfoundException, SQLException {
		int rows = 0;
		String sql = "update sap_emp set sal=? where eid=?";
		PreparedStatement st = conn.prepareStatement(sql);
		st.setDouble(1, sal);
		st.setDouble(2, eid);
		rows = st.executeUpdate();
		return rows;
	}

	public static List<Dept> getDepts() throws SQLException, ParseException {
		String sql = null;
		List<Dept> lst = new ArrayList<Dept>();
		lst = null;
		PreparedStatement st = null;
		sql = "select * from sap_dept";
		Dept d = null;
		st = conn.prepareStatement(sql);
		ResultSet rs = st.executeQuery();
		while (rs.next()) {
			int id = rs.getInt("did");
			String name = rs.getString("dname");
			d = new Dept(id, name);
			lst.add(id, d);
		}
		return lst;
	}

	public static void closeconn() {
		try {
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
