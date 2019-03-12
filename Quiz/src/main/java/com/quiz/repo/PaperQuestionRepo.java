package com.quiz.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.quiz.model.PaperQuestion;

@Repository
public interface  PaperQuestionRepo extends JpaRepository<PaperQuestion, Long> {
 
	List<PaperQuestion> findByPaperSelectQuestionId(int paperselectId);
}
