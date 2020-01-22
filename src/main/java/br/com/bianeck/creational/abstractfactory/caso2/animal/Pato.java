package br.com.bianeck.creational.abstractfactory.caso2.animal;

public class Pato implements Animal {
    @Override
    public String getAnimal() {
        return "Pato";
    }

    @Override
    public String fazSom() {
        return "Quac";
    }
}
