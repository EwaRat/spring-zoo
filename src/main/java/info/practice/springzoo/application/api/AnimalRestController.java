package info.practice.springzoo.application.api;


import info.practice.springzoo.application.AnimalService;
import info.practice.springzoo.application.domain.animal.AnimalDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AnimalRestController {
    private final AnimalService animalService;
    public AnimalRestController(AnimalService animalService){
        this.animalService = animalService;
    }
    @GetMapping("zoo/list")
    public AnimalListResponse list(){
        return new AnimalListResponse(animalService.getAllAnimals());
    }
    @PostMapping("zoo/add")
    public void add(AnimalDto animalDto){
        animalService.addAnimal(animalDto);
    }
}
