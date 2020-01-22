package br.com.bianeck.creational.builder.caso2;

public enum CorDoCabelo {

    BRANCO, LOIRO, RUIVO, CASTANHO, PRETO;

    @Override
    public String toString() {
        return name().toLowerCase();
    }
}
