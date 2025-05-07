package model;

public interface IAnimal extends Comparable<IAnimal>{
    String TESTE = "Teste";

    String emitirSom();
    String andar();
    //String getNome(); //Não é uma boa prática

    default String teste(){
        return "Método padrão";
    }
}
