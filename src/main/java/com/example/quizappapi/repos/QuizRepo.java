package com.example.quizappapi.repos;

import com.example.quizappapi.models.Quiz;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuizRepo extends CrudRepository<Quiz, Long> {

    List<Quiz> findAllByOrderOfId();

}
