package com.example.quizappapi;

import com.example.quizappapi.models.Choice;
import com.example.quizappapi.models.Quiz;
import com.example.quizappapi.repos.AnswerRepo;
import com.example.quizappapi.repos.ChoiceRepo;
import com.example.quizappapi.repos.QuizRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class Seeder implements CommandLineRunner {
private QuizRepo quizRepo;
private ChoiceRepo choiceRepo;
private AnswerRepo answerRepo;

    @Override
    public void run(String... args) throws Exception {
        Quiz quiz1 = new Quiz();
        quiz1.setName("What Color Are You??");

        quizRepo.saveAll(Arrays.asList(new Quiz[] { quiz1 }));

        Choice question1 = new Choice();
        question1.setText("Question 1:");
        question1.setQuiz(quiz1);
    }
}
