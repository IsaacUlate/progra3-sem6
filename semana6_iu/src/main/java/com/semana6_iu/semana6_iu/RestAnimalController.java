package com.semana6_iu.semana6_iu;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestAnimalController {
    @GetMapping("/animal")
    public Animal getAnimal(){
        return new Animal("Serpiente", "Reptil", "ssssssss");
    }

    @GetMapping("/animales")
    public void getAnimals(){
        Animal animalList = new Animal();
        animalList.getAnimals();
    }

    /*public List<Animal> getAnimals(){
        Animal animalList = new Animal();
        return animalList.getAnimals();
    }*/

    @PostMapping("/animal")
    public void addAnimal(String name, String type, String sound){
        Animal animal = new Animal(name, type, sound);
        animal.addAnimal(animal);
        animal.getAnimals();
    }

    @DeleteMapping("/animal")
    public void removeAnimal(int index){
        Animal animal = new Animal();
        animal.genAnimals();
        animal.removeAnimal(index);
        animal.getAnimals();
    }
    
    @PutMapping("/animal")
    public void updAnimal(String name, String type, String sound, int index){
        Animal animal = new Animal(name, type, sound);
        animal.addAnimal(animal);
        animal.getAnimals();
    }

}
