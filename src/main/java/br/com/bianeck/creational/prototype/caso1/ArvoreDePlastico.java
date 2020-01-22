package br.com.bianeck.creational.prototype.caso1;

public class ArvoreDePlastico extends Arvore{

    private String nome;

    public ArvoreDePlastico(double massa, double altura) {
        super(massa, altura);
        this.nome = "ArvoreDePlastico";
    }

    public String getNome() {
        return nome;
    }

    @Override
    public Arvore copy() {
        ArvoreDePlastico arvoreDePlasticoClone = new ArvoreDePlastico(this.getMassa(), this.getAltura());
        arvoreDePlasticoClone.setPosicao(this.getPosicao());
        return arvoreDePlasticoClone;
    }
}
