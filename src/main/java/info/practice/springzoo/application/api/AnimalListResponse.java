package info.practice.springzoo.application.api;

import info.practice.springzoo.application.domain.animal.AnimalDto;
import lombok.Value;

import java.util.List;

@Value
public class AnimalListResponse {
    List<AnimalDto> animals;
}