package br.com.bianeck.creational.abstractfactory.caso1;

public class FactoryProvider {

    public static AbstractFactory getFactory(String escolha) {
        if("Animal".equalsIgnoreCase(escolha)) {
            return new AnimalFactory();
        } else if("Cor".equalsIgnoreCase(escolha)) {
            return new CorFactory();
        }

        return null;
    }
}
