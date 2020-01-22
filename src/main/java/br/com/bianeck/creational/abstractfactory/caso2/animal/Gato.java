package br.com.bianeck.creational.abstractfactory.caso2.animal;

public class Gato implements Animal {
    @Override
    public String getAnimal() {
        return "Gato";
    }

    @Override
    public String fazSom() {
        return "Miau!";
    }
}
