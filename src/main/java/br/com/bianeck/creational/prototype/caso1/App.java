package br.com.bianeck.creational.prototype.caso1;

public class App {
    public static void main(String[] args) {

        double massa = 10.0;
        double altura = 3.7;
        Posicao posicao = new Posicao(3, 7);
        Posicao outraPosicao = new Posicao(4, 8);

        ArvoreDePlastico arvoreDePlastico = new ArvoreDePlastico(massa, altura);
        arvoreDePlastico.setPosicao(posicao);


        ArvoreDePlastico arvoreDePlasticoClonada = (ArvoreDePlastico) arvoreDePlastico.copy();
        arvoreDePlasticoClonada.setPosicao(outraPosicao);

        System.out.println(arvoreDePlastico.toString());
        System.out.println(arvoreDePlasticoClonada.toString());

    }
}
