package com.semana6_iu.semana6_iu;

import java.util.ArrayList;
import java.util.List;

public class Animal {

    private String name;
    private String type;
    private String sound;

    private List<Animal> animals = new ArrayList<Animal>();
    public Animal(){}


public Animal(String name, String type, String sound){
    this.name = name;
    this.type = type;
    this.sound = sound;
}

public String getName(){
    return name;
}

    public void getAnimals(){
    
    for (Animal animalIteracion : animals){
        System.out.println(animalIteracion.getName());
    }
}

public void genAnimals(){
    Animal animal1 = new Animal("vaca", "mamifero", "muu");
    Animal animal2 = new Animal("grillo", "insecto", "cri");

    animals.add(animal1);
    animals.add(animal2);
}

public void addAnimal(Animal animal){
    animals.add(animal);
}

public void removeAnimal(int index){
    animals.remove(index);
}

public String getType(){
    return type;
}

public String getSound(){
    return sound;
}

public void setName(String name){
    this.name = name;
}

public void setType(String type){
    this.type = type;
}

public void setSound(String sound){
    this.sound = sound;
}


}

