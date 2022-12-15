package com.example.quizappapi.repos;

import com.example.quizappapi.models.Answer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnswerRepo extends CrudRepository<Answer, Long> {
}
