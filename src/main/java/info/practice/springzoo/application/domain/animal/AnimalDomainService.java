package info.practice.springzoo.application.domain.animal;

import org.springframework.stereotype.Service;

import java.util.List;

public interface AnimalDomainService {
    List<AnimalDto> getAllAnimals();
    void addAnimall(AnimalDto animalDto);
}
