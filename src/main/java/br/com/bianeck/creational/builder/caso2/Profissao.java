package br.com.bianeck.creational.builder.caso2;

public enum Profissao {

    GUERREIRO, LADRAO, MAGO, SACERDOTE;

    @Override
    public String toString() {
        return name().toLowerCase();
    }
}
