package br.com.bianeck.creacional.abstractfactory.caso4;

public class App {

    public static void main(String[] args) {
        AbstractFactory factory = AbstractFactory.getFactory(Architecture.EMBER);
        CPU cpu = factory.createCPU();
    }
}
