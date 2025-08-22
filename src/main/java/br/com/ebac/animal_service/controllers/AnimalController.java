package br.com.ebac.animal_service.controllers;

import br.com.ebac.animal_service.entidades.Animal;
import br.com.ebac.animal_service.entidades.enums.Especie;
import br.com.ebac.animal_service.repository.AnimalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/animais")
public class AnimalController {

    @Autowired
    private AnimalRepository repository;

    @GetMapping
    private List<Animal> findAll() {
        return repository.findAll();
    }

    @PostMapping
    private Animal create(@RequestBody Animal animal) {
        return repository.save(animal);
    }

    @GetMapping("/not-adopted")
    private List<Animal> findNotAdopted() {
        return repository.findNotAdopted();
    }

    @GetMapping("/adopted")
    private List<Animal> findAdopted() {
        return repository.findAdopted();
    }

    @GetMapping("/dog-adopted")
    private List<Animal> findDogAdopted() {
        return repository.findAdoptedByEspecie(Especie.CACHORRO);
    }

    @GetMapping("/cat-adopted")
    private List<Animal> findCatAdopted() {
        return repository.findAdoptedByEspecie(Especie.GATO);
    }
}
