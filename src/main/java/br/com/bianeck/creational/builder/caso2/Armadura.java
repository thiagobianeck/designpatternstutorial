package br.com.bianeck.creational.builder.caso2;

public enum Armadura {

    ROUPAS("roupas"),
    COURO("couro"),
    COTA_DE_MALHA("cota de malha"),
    ARMADURA_DE_PLACA("armadura de placa");

    private String titulo;

    Armadura(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return titulo;
    }
}
