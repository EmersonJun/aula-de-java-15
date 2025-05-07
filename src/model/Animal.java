package model;

import java.util.List;

public interface Animal extends Comparable<Animal>{
    String TESTE = "teste";
    
    String emitirSom();
    String andar();
    //String getNome(); nao e uma boa pratica
    default String teste(){
        return "metodo padrao";
    }
}
