package br.com.bianeck.creacional.abstractfactory.caso2;

import br.com.bianeck.creacional.abstractfactory.caso2.enums.FactoryEnum;
import br.com.bianeck.creacional.abstractfactory.caso2.factory.AbstractFactory;
import br.com.bianeck.creacional.abstractfactory.caso2.factory.AnimalFactory;
import br.com.bianeck.creacional.abstractfactory.caso2.factory.CorFactory;

public class FactoryProvider {

    public static AbstractFactory getFactory(FactoryEnum factory) {
        return factory.getInstancia();
    }
}
