package br.com.bianeck.creational.abstractfactory.caso2;

import br.com.bianeck.creational.abstractfactory.caso2.enums.FactoryEnum;
import br.com.bianeck.creational.abstractfactory.caso2.factory.AbstractFactory;

public class FactoryProvider {

    public static AbstractFactory getFactory(FactoryEnum factory) {
        return factory.getInstancia();
    }
}
