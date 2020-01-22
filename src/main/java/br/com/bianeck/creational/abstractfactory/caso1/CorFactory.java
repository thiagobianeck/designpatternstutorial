package br.com.bianeck.creational.abstractfactory.caso1;

public class CorFactory implements AbstractFactory<Cor>{

    @Override
    public Cor criar(String tipo) {
        if("Marrom".equalsIgnoreCase(tipo)) {
            return new Marrom();
        } else if("Preto".equalsIgnoreCase(tipo)) {
            return new Preto();
        } else if("Branco".equalsIgnoreCase(tipo)) {
            return new Branco();
        }
        return null;
    }
}
