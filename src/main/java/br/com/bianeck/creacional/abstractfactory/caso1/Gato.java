package br.com.bianeck.creacional.abstractfactory.caso1;

public class Gato implements Animal{
    @Override
    public String getAnimal() {
        return "Gato";
    }

    @Override
    public String fazSom() {
        return "Miau!";
    }
}
