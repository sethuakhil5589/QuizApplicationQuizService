package com.akhil.model;

import java.util.List;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
@Data
@Entity
public class Quizzes {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer quizId;
	@ElementCollection
	private List<Integer> questionIds;
	private Integer adminId;
	private String title;

}
