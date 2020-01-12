package br.com.bianeck.creacional.abstractfactory.caso2.factory;

import br.com.bianeck.creacional.abstractfactory.caso2.cor.Cor;
import br.com.bianeck.creacional.abstractfactory.caso2.enums.CorEnum;

public class CorFactory implements AbstractFactory<Cor, CorEnum>{

    @Override
    public Cor criar(CorEnum cor) {
        return cor.getInstancia();
    }
}
