package com.akhil.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.akhil.model.Quizzes;

public interface IQuizRepo extends JpaRepository<Quizzes, Integer> {
	List<Quizzes> findByAdminId(Integer id);
}
