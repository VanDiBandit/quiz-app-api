package com.example.quizappapi.services.implement;

import com.example.quizappapi.dtos.ChoiceRequestDto;
import com.example.quizappapi.dtos.ChoiceResponseDto;
import com.example.quizappapi.dtos.QuizRequestDto;
import com.example.quizappapi.dtos.QuizResponseDto;
import com.example.quizappapi.mappers.ChoiceMapper;
import com.example.quizappapi.mappers.QuizMapper;
import com.example.quizappapi.models.Quiz;
import com.example.quizappapi.repos.AnswerRepo;
import com.example.quizappapi.repos.ChoiceRepo;
import com.example.quizappapi.repos.QuizRepo;
import com.example.quizappapi.services.QuizServices;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuizServiceImplements implements QuizServices {
    private QuizRepo quizRepo;
    private ChoiceRepo choiceRepo;
    private AnswerRepo answerRepo;
    private QuizMapper quizMapper;
    private ChoiceMapper choiceMapper;
    @Override
    public List<QuizResponseDto> getAllQuizzes() {

        return quizMapper.modelsToDtos((List<Quiz>) quizRepo.findAll());
    }

    @Override
    public ResponseEntity<QuizResponseDto> createQuiz(QuizRequestDto quizRequestDto) {
        return null;
    }

    @Override
    public ResponseEntity<QuizResponseDto> deleteQuiz(Long id) {
        return null;
    }

    @Override
    public ResponseEntity<QuizResponseDto> updateQuiz(Long id, String newQuiz) {
        return null;
    }

    @Override
    public ResponseEntity<ChoiceResponseDto> getRandomChoice(Long id) {
        return null;
    }

    @Override
    public ResponseEntity<QuizResponseDto> addToQuiz(Long id, ChoiceRequestDto choiceRequestDto) {
        return null;
    }

    @Override
    public ResponseEntity<ChoiceResponseDto> deleteChoice(Long id, Long choiceId) {
        return null;
    }
}
