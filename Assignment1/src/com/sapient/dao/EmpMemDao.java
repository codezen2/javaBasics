package com.sapient.dao;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.sapient.exception.IdException;
import com.sapient.exception.NotfoundException;
import com.sapient.vo.Emp;

public class EmpMemDao implements IDao  {
	public static Map<Integer, Emp> emap;
	static
	{
		emap=new HashMap<Integer,Emp>();
		emap.put(1001,new Emp(1001,"ram",45000,1,LocalDate.of(2015, 7, 21)));
		emap.put(1002,new Emp(1002,"tom",50000,1,LocalDate.of(2017, 9, 17)));
		emap.put(1003,new Emp(1003,"sam",35000,1,LocalDate.of(2013, 7, 13)));
	}
	@Override
	public List<Emp> viewEmployee() {
		List<Emp> lst=new ArrayList<Emp>();
		lst.addAll(emap.values());
		return lst;
	}
	@Override
	public Emp viewEmployee(int eid) throws NotfoundException {
		if(!emap.containsKey(eid))
		throw new NotfoundException("Employee Not Found");
		Emp emp=emap.get(eid);
		return emp;
	}
	@Override
	public int addEmployee(Emp emp) throws IdException {
		if(emap.containsKey(emp.getEmpId()))
			throw new IdException("Id Already Exists");
		emap.put(emp.getEmpId(), emp);
		return 1;
	}
	@Override
	public int removeEmployee(int eid) throws NotfoundException {
		if(!emap.containsKey(eid))
			throw new NotfoundException("Employee Not Found");
		emap.remove(eid);
		return 1;
	}
	@Override
	public int updateEmployee(int eid, double sal) throws NotfoundException {
		if(!emap.containsKey(eid))
			throw new NotfoundException("Employee Not Found");
		Emp emp=emap.get(eid);
		emp.setSal(sal);		
		return 1;
	}
}
