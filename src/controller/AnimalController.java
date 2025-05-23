package controller;

import java.util.Collections;
import java.util.List;

import model.IAnimal;

public class AnimalController {
    private List<IAnimal> animais;

    public AnimalController(List<IAnimal> animais) {
        this.animais = animais;
    }

    public void adicionarAnimal(IAnimal animal){
        animais.add(animal);
    }

    public void removerAnimal(IAnimal animal){
        animais.remove(animal);
    }

    public void ordenarAnimal(){
        Collections.sort(animais);
    }

    public List<String> listarSons(){
        return animais.stream()
            .map(a -> a.emitirSom())
            .toList();
    }

}
