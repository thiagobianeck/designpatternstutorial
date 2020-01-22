package br.com.bianeck.creational.builder.caso2;

public enum TipoDeCabelo {

    CARECA("careca"),
    CURTO("curto"),
    CACHEADO("cacheado"),
    COMPRIDO_LISO("comprido e liso"),
    COMPRIDO_CACHEADO("comprido e cacheado");

    private String titulo;

    TipoDeCabelo(String titulo){
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return titulo;
    }
}
