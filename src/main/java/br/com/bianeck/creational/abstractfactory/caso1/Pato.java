package br.com.bianeck.creational.abstractfactory.caso1;

public class Pato implements Animal{
    @Override
    public String getAnimal() {
        return "Pato";
    }

    @Override
    public String fazSom() {
        return "Quac";
    }
}
