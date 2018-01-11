package com.sapeint.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import static com.sapient.utill.ExamUtill.*;
import com.sapient.vo.Question;

public class ExamDaoImpl implements IDao{
	private static IDao dao=new ExamDaoImpl();
	private ExamDaoImpl()
	{
		
	}
	public static IDao getdaoInsatance()
	{
		return dao;
	}
	static
	{
		try {
			Class.forName(DRIVER);
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}
	}
	public Map<Integer, Question> viewQuestion() {
		Map<Integer,Question> map=new HashMap<>();
		Question ques=null;
		String url=URL;
		try(Connection conn=DriverManager.getConnection(url,UNAME,PWD))
		{
			String sql="select * from questions";
			PreparedStatement st=conn.prepareStatement(sql);
			ResultSet rs=st.executeQuery();
			while(rs.next())
			{
				int qid=rs.getInt("QID");
				String qdesc=rs.getString("QDESC");
				String opta	=rs.getString("OPTIONA");
				String optb	=rs.getString("OPTIONB");
				String optc	=rs.getString("OPTIONC");
				String ans	=rs.getString("ANSWER");
				ques=new Question(qid, qdesc, opta, optb, optc, ans);
				map.put(qid, ques);
			}
		}catch(SQLException e)
		{
			System.out.println(e.getMessage());
		}
		return map;
	}
	
}
