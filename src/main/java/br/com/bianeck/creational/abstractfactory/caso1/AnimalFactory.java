package br.com.bianeck.creational.abstractfactory.caso1;

public class AnimalFactory implements AbstractFactory<Animal>{

    @Override
    public Animal criar(String tipo) {
        if("Cachorro".equalsIgnoreCase(tipo)) {
            return new Cachorro();
        } else if("Pato".equalsIgnoreCase(tipo)) {
            return new Pato();
        } else if("Gato".equalsIgnoreCase(tipo)) {
            return new Gato();
        }
        return null;
    }
}
