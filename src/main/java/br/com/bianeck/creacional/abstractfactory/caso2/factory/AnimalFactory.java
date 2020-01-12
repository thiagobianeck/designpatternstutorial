package br.com.bianeck.creacional.abstractfactory.caso2.factory;

import br.com.bianeck.creacional.abstractfactory.caso2.animal.Animal;
import br.com.bianeck.creacional.abstractfactory.caso2.animal.Cachorro;
import br.com.bianeck.creacional.abstractfactory.caso2.animal.Gato;
import br.com.bianeck.creacional.abstractfactory.caso2.animal.Pato;
import br.com.bianeck.creacional.abstractfactory.caso2.enums.AnimalEnum;

public class AnimalFactory implements AbstractFactory<Animal, AnimalEnum>{

    @Override
    public Animal criar(AnimalEnum animal) {
        return animal.getInstancia();
    }
}
