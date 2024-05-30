package com.akhil.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.akhil.model.Quizzes;
import com.akhil.repo.IQuizRepo;

@Service
public class QuizServiceImpl implements IQuizService {

	private IQuizRepo repo;
	@Override
	public List<Quizzes> fetchQuizById(Integer id) {
		return repo.findByAdminId(id);
	}
	@Override
	public String savingQuiz(Quizzes quiz) {
		return "Quiz saved with title: "+repo.save(quiz).getTitle();
	}

}
