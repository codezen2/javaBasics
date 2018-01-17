package com.sapient.client;

import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import javax.swing.text.DateFormatter;

import com.sapient.dao.DaoFactory;
import com.sapient.dao.EmpJdbcDao;
import com.sapient.dao.IDao;
import com.sapient.exception.IdException;
import com.sapient.exception.NotfoundException;
import com.sapient.vo.Dept;
import com.sapient.vo.Emp;

public class EmpClient {

	static Scanner scan = new Scanner(System.in);
	static IDao dao = DaoFactory.getDaoInstance();

	public static void main(String[] args) {
		String menuStr = null;
		String opt = null;
		Menu emenu = null;

		do {
			System.out.println("Choose:\nADD\nEDIT\nREMOVE\nVIEW\nVIEWALL\nDEPT\n:");
			menuStr = scan.next();
			try {
				emenu = Menu.valueOf(menuStr.toUpperCase());
				processMenu(emenu);
			} catch (Exception ex) {
				System.out.println("Invalid Menu Option " + ex);
			}
			System.out.println("Press \'y\' to Continue");
			opt = scan.next();
		} while (opt.equals("y"));
		EmpJdbcDao.closeconn();
	}

	public static void processMenu(Menu menu) {
		switch (menu) {
		case VIEWALL:
			viewAll();
			break;
		case VIEW:
			viewbyId();
			break;
		case REMOVE:
			deletebyId();
			break;
		case ADD:
			add();
			break;
		case EDIT:
			updateSal();
			break;
		case DEPT:
			viewDept();
			break;
		default:
			break;
		}

	}

	public static void viewAll() {
		List<Emp> lst;
		try {
			System.out.println(" viewall fxn");
			lst = dao.viewEmployee();
			System.out.println("sdsads " + lst.size());
			for (Emp emp : lst) {
				System.out.println(emp);
			}
		} catch (SQLException | ParseException e) {
			System.out.println(e.getMessage() + "   " + e);
		}

	}

	public static void deletebyId() {
		System.out.println("Enter the Id to Delete data for:");
		int id = scan.nextInt();
		try {
			int a = dao.removeEmployee(id);
			System.out.println("DELETED SUCCESSFULLLY");
		} catch (NotfoundException | SQLException e) {
			System.out.println(e.getMessage());
		}

	}

	public static void viewbyId() {
		System.out.println("Enter the Id to Fetch data for:");
		int id = scan.nextInt();
		Emp emp;
		try {
			emp = dao.viewEmployee(id);
			System.out.println(emp);
		} catch (NotfoundException | ParseException | SQLException e) {
			System.out.println(e.getMessage());
		}

	}

	public static void updateSal() {
		System.out.println("Enter the Id to Fetch data for:");
		int id = scan.nextInt();
		System.out.println("Enter the Sal to update:");
		double sal = scan.nextDouble();
		Emp emp;
		try {
			int a = dao.updateEmployee(id, sal);
			System.out.println("Updated Success");
		} catch (NotfoundException | SQLException e) {
			System.out.println(e.getMessage());
		}

	}

	public static void add() {
		System.out.println("Enter the Id");
		int id = scan.nextInt();
		System.out.println("Enter the Name");
		String name = scan.next();
		System.out.println("Enter the Sal");
		double salr = scan.nextDouble();
		System.out.println("Enter the Dept Id");
		int did = scan.nextInt();
		System.out.println("Enter the Date of joining (dd-mm-yyyy)");
		String strDt = scan.next();
		DateTimeFormatter df = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		LocalDate doj = LocalDate.parse(strDt, df);
		Emp emp = new Emp(id, name, salr, did, doj);
		try {
			int a = dao.addEmployee(emp);
		} catch (IdException | SQLException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Successfully Added");

	}
	public static void viewDept()
	{
		List<Dept> lst;
		try {
			System.out.println(" viewall fxn");
			lst = EmpJdbcDao.getDepts();
			System.out.println("sdsads " + lst.size());
			for (Dept emp : lst) {
				System.out.println(emp);
			}
		} catch (SQLException | ParseException e) {
			System.out.println(e.getMessage() + "   " + e);
		}
		
	}
}
