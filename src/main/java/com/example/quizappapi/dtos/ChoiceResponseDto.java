package com.example.quizappapi.dtos;

import java.util.List;

public class ChoiceResponseDto {
    private Long id;

    private String text;

    private List<AnswerResponseDto> answers;
}
