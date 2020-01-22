package br.com.bianeck.creational.prototype.caso1;

public abstract class Arvore {

    private double massa;
    private double altura;
    private Posicao posicao;

    public Arvore(double massa, double altura) {
        this.massa = massa;
        this.altura = altura;
    }

    public double getMassa() {
        return massa;
    }

    public void setMassa(double massa) {
        this.massa = massa;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public Posicao getPosicao() {
        return posicao;
    }

    public void setPosicao(Posicao posicao) {
        this.posicao = posicao;
    }

    @Override
    public String toString() {
        return "Árvore [Massa = " + massa + ", altura = " + altura + ", posição = " + posicao + "]";
    }

    public abstract Arvore copy();
}
