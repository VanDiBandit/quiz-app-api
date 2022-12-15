package com.example.quizappapi.dtos;

import java.util.List;

public class AnswerRequestDto {
    private String text;
    private Boolean isCorrect;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Boolean getCorrect() {
        return isCorrect;
    }

    public void setCorrect(Boolean correct) {
        isCorrect = correct;
    }
}
