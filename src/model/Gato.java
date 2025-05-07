package model;

import java.util.List;

public class Gato implements Animal, Testavel{
    private String nome, som;
    private int idade;
    public Gato(String nome, String som, int idade) {
        this.nome = nome;
        this.som = som;
        this.idade = idade;
    }
    public String getNome() {
        return nome;
    }
    @Override
    public String teste() {
        return "testando";
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    @Override
    public String andar() {
        return nome +"andando";
    }
    @Override
    public String emitirSom() {
        return nome + "emitindo som" + som;
    }
    public String getSom() {
        return som;
    }
    public void setSom(String som) {
        this.som = som;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    @Override
    public int compareTo(Animal o) {
        return  this.emitirSom().compareTo(o.emitirSom());
    }
    @Override
    public String toString() {
        return "Gato [nome=" + nome + ", som=" + som + ", idade=" + idade + "]";
    }
    @Override
    public void add(List<Animal> animal) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'add'");
    }
    @Override
    public void remove(List<Animal> animal) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'remove'");
    }
}
