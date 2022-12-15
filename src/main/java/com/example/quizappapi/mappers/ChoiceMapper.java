package com.example.quizappapi.mappers;

import com.example.quizappapi.dtos.ChoiceRequestDto;
import com.example.quizappapi.dtos.ChoiceResponseDto;
import com.example.quizappapi.models.Choice;

import java.util.List;
import java.util.Optional;

@Mapper(componentModel = "spring", uses = {AnswerMapper.class})
public interface ChoiceMapper {
    ChoiceResponseDto modelToDto(Optional<Choice> model);

    List<ChoiceResponseDto> modelToDtos(List<Choice> models);
    Choice requestDtoToModel(ChoiceRequestDto choiceRequestDto);
}
