package com.akhil.service;

import java.util.List;

import com.akhil.model.Quizzes;

public interface IQuizService {
	List<Quizzes> fetchQuizById(Integer id);
	String savingQuiz(Quizzes quiz);
}
