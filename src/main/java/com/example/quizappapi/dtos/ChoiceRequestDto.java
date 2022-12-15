package com.example.quizappapi.dtos;

import java.util.List;

public class ChoiceRequestDto {
    private String text;
    private List<AnswerRequestDto> answers;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public List<AnswerRequestDto> getAnswers() {
        return answers;
    }

    public void setAnswers(List<AnswerRequestDto> answers) {
        this.answers = answers;
    }
}
