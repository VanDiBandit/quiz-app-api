package com.example.quizappapi.repos;

import com.example.quizappapi.models.Choice;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public  interface ChoiceRepo extends CrudRepository<Choice, Long> {
}
