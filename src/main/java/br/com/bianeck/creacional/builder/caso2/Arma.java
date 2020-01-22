package br.com.bianeck.creacional.builder.caso2;

public enum Arma {

    ADAGA, ESPADA, MACHADO, MARTELO, ARCO;

    @Override
    public String toString() {
        return name().toLowerCase();
    }
}
