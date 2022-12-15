package com.example.quizappapi.services;


import com.example.quizappapi.dtos.ChoiceRequestDto;
import com.example.quizappapi.dtos.ChoiceResponseDto;
import com.example.quizappapi.dtos.QuizRequestDto;
import com.example.quizappapi.dtos.QuizResponseDto;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface QuizServices {

    List<QuizResponseDto> getAllQuizzes();


    ResponseEntity<QuizResponseDto> createQuiz(QuizRequestDto quizRequestDto);

    ResponseEntity<QuizResponseDto> deleteQuiz(Long id);

    ResponseEntity<QuizResponseDto> updateQuiz(Long id, String newQuiz);

    ResponseEntity<ChoiceResponseDto> getRandomChoice(Long id);

    ResponseEntity<QuizResponseDto> addToQuiz(Long id, ChoiceRequestDto choiceRequestDto);

    ResponseEntity<ChoiceResponseDto> deleteChoice(Long id, Long choiceId);
}
