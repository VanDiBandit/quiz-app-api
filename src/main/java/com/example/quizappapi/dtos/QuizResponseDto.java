package com.example.quizappapi.dtos;

import java.util.List;

public class QuizResponseDto {
    private Long id;

    private String name;

    public List<ChoiceResponseDto> choices;
}
