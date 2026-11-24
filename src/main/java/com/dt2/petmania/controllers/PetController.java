package com.dt2.petmania.controllers;

import com.dt2.petmania.entities.Pet;
import com.dt2.petmania.repositories.PetRepository;

import java.util.List;

@RequestMaping("api/pets")
@RestController
public class PetController {

    private final PetRepository repository;
    public PetController(PetRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<Pet> mostrar(){
        return repository.findAll();
    }
    @PostMapping
    public void criar(@RequestBody Pet p){
        repository.save(p);
    }


}
