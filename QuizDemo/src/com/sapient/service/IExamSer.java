package com.sapient.service;

import java.util.List;

import com.sapient.vo.Answer;
import com.sapient.vo.Question;

public interface IExamSer {
	List<Question> generateQuestions();// to generate random questions
	int evaluate(List<Answer> alist);
}
