package com.example.quizappapi.mappers;

import com.example.quizappapi.dtos.AnswerResponseDto;
import com.example.quizappapi.models.Answer;

import java.util.List;

@Mapper(componentModel = "spring")
public interface AnswerMapper {
    AnswerResponseDto modelToDto(Answer model);

    List<AnswerResponseDto> modelsToDtos(List<Answer> models);
}
