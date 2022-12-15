package com.example.quizappapi.mappers;

import com.example.quizappapi.dtos.QuizRequestDto;
import com.example.quizappapi.dtos.QuizResponseDto;
import com.example.quizappapi.models.Quiz;

import java.util.List;
import java.util.Optional;

@Mapper(componentModel = "spring", uses ={ChoiceMapper.class})
public interface QuizMapper {
    QuizResponseDto modelToDto(Optional<Quiz> model);

    List<QuizResponseDto> modelsToDtos(List<Quiz> models);
    Quiz requestDtoToModel(QuizRequestDto quizRequestDto);

}
