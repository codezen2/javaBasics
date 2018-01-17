package com.sapient.client;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.sapient.service.ExamSerImpl;
import com.sapient.service.IExamSer;
import com.sapient.vo.Answer;
import com.sapient.vo.Question;

public class Client {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("           Enter Quiz");
		System.out.println("--------------------------------------");
		System.out.println("Enter Your Name");
		String name = scan.nextLine();
		System.out.println("Welcome! " + name.toUpperCase() + " to the Game Show");
		System.out.println("--------------------------------------");
		System.out.println("You will be tested on Java,\n 5 Questions in 5 mins");
		System.out.println("--------------------------------------");
		System.out.println("           Quiz Begins");
		System.out.println("--------------------------------------");

		IExamSer ser = ExamSerImpl.getInstance();
		List<Question> lst = ser.generateQuestions(5);
		List<Answer> alist=new ArrayList<Answer>();
		Answer ans=null;
		int i = 0;
		for (Question ques : lst) {
			System.out.println(++i + ". " + ques.getQdesc() + " ?");
			System.out.println(">" + ques.getOpta());
			System.out.println(">" + ques.getOptb());
			System.out.println(">" + ques.getOptc());
			System.out.println("Answer:__");
			String str = scan.next();
			// if(ques.getAnswer().equalsIgnoreCase(str))//wrong way as no multi use
			// ++score;
			ans=new Answer(ques.getQid(),str);
			alist.add(ans);
			System.out.println("-------------------------------------");
		}
		int score=ser.evaluate(alist);
		System.out.println("End of Test");
		System.out.println("Score for "+name.toUpperCase()+" : "+score+"/"+i);
		// System.out.println(name.toUpperCase()+" scored:"+score+"/"+i);
	}

	public static void displayExam() {

	}
}
