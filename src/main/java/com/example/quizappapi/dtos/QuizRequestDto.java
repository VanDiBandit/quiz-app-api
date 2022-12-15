package com.example.quizappapi.dtos;

import java.util.List;

public class QuizRequestDto {

    private String name;

    private List<ChoiceRequestDto> choices;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<ChoiceRequestDto> getChoices() {
        return choices;
    }

    public void setChoices(List<ChoiceRequestDto> choices) {
        this.choices = choices;
    }
}
