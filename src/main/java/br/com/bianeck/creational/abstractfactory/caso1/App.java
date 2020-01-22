package br.com.bianeck.creational.abstractfactory.caso1;

public class App {

    public static void main(String[] args) {
        AbstractFactory abstractFactory;

        //criando um gato marrom
        abstractFactory = FactoryProvider.getFactory("Animal");
        Animal animal = (Animal) abstractFactory.criar("Pato");

        abstractFactory = FactoryProvider.getFactory("Cor");
        Cor cor = (Cor) abstractFactory.criar("Branco");

        String resultado = String.format("Um %s de cor %s faz %s", animal.getAnimal(), cor.getCor(), animal.fazSom());

        System.out.println(resultado);
    }
}
