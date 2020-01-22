package br.com.bianeck.creational.abstractfactory.caso1;

public class Cachorro implements Animal{
    @Override
    public String getAnimal() {
        return "Cachorro";
    }

    @Override
    public String fazSom() {
        return "Au Au!";
    }
}
