package br.com.bianeck.creational.abstractfactory.caso2.factory;

import br.com.bianeck.creational.abstractfactory.caso2.animal.Animal;
import br.com.bianeck.creational.abstractfactory.caso2.enums.AnimalEnum;

public class AnimalFactory implements AbstractFactory<Animal, AnimalEnum>{

    @Override
    public Animal criar(AnimalEnum animal) {
        return animal.getInstancia();
    }
}
