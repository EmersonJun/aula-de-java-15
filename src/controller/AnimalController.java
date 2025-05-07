package controller;

import java.util.Collection;
import java.util.List;

import model.Animal;

public class AnimalController {
    private List<Animal> animal;

    public AnimalController(List<Animal> animal) {
        this.animal = animal;
    }
    public void adicionarAnimal(Animal animais){
        animais.add(animal);
    }
    public void removerAnimal(Animal animais){
        animais.remove(animal);
    }
    // public void ordenarAnimal(){
    //     Collection.sort(animal);    
    // }
    public List<String> listarSons(){
        return animal.stream().map(a -> a.emitirSom()).toList();
    }
}
