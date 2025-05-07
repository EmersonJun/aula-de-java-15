package view;

import java.util.ArrayList;

import controller.AnimalController;
import model.Cachorro;
import model.Gato;

public class AnimalView {
    public static void main(){
        AnimalController controller = new AnimalController(new ArrayList<>());
        Gato gato = new Gato("Felix", "miau", 90);
        Gato gato2 = new Gato("Manda-Chuva", "Sei lá", 20);

        Cachorro dog1 = new Cachorro("Pluto", "Au au", 30);
        Cachorro dog2 = new Cachorro("Kripto", "latindo", 30);

        controller.adicionarAnimal(dog2);
        controller.adicionarAnimal(dog1);
        controller.adicionarAnimal(gato);
        controller.adicionarAnimal(gato2);

        controller.listarSons().forEach(System.out::println);

        controller.ordenarAnimal();
        System.out.println("\n\n Lista Ordenada \n");
        controller.listarSons().forEach(System.out::println);
        
    }
}
