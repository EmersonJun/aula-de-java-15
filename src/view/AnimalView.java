package view;

import java.util.ArrayList;

import controller.AnimalController;
import model.Cachorro;
import model.Gato;

public class AnimalView {
        public static void main(String[] args) {
            AnimalController controller = new AnimalController(new ArrayList<>());

        Gato gato = new Gato("felix", "miau", 90);
        Gato gato2 = new Gato("ajax", "miar", 9);

        Cachorro cao = new Cachorro("pluto", "woff", 78);
        Cachorro cao2 = new Cachorro("kripton", "au ua", 90);

        controller.adicionarAnimal(gato);
        controller.adicionarAnimal(gato2);
        controller.adicionarAnimal(cao);
        controller.adicionarAnimal(cao2);
        
        controller.listarSons().forEach(System.out::println);
    }
}
