package br.com.bianeck.creational.prototype.caso1;

public class Pinheiro extends Arvore{

    private String tipo;

    public Pinheiro(double massa, double altura) {
        super(massa, altura);
        this.tipo = "Pinheiro";
    }

    public String getTipo() {
        return tipo;
    }

    @Override
    public Arvore copy() {
        Pinheiro pinheiroClone = new Pinheiro(this.getMassa(), this.getAltura());
        pinheiroClone.setPosicao(this.getPosicao());
        return pinheiroClone;
    }
}
