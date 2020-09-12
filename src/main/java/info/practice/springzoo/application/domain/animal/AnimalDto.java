package info.practice.springzoo.application.domain.animal;

import lombok.Value;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.Instant;


@Value
public class AnimalDto {
   String id;
   String species;
   Instant dateOfBirth;
   Integer weight;
   boolean dangerous;

}