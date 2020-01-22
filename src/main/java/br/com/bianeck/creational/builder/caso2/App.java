package br.com.bianeck.creational.builder.caso2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {

    public static final Logger LOGGER = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {

        Heroi mago = new Heroi.Builder(Profissao.MAGO, "Riobard")
                .comCorDeCabelo(CorDoCabelo.PRETO)
                .comArma(Arma.ADAGA)
                .build();
        LOGGER.info(mago.toString());

        Heroi guerreiro = new Heroi.Builder(Profissao.GUERREIRO, "Amberjill")
                .comCorDeCabelo(CorDoCabelo.LOIRO)
                .comTipoDeCabelo(TipoDeCabelo.COMPRIDO_CACHEADO)
                .comArmadura(Armadura.COTA_DE_MALHA)
                .comArma(Arma.ESPADA)
                .build();
        LOGGER.info(guerreiro.toString());

        Heroi ladrao = new Heroi.Builder(Profissao.LADRAO, "Desmond")
                .comTipoDeCabelo(TipoDeCabelo.CARECA)
                .comArma(Arma.ARCO)
                .build();
        LOGGER.info(ladrao.toString());
    }
}
