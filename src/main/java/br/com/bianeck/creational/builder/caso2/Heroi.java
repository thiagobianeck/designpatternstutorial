package br.com.bianeck.creational.builder.caso2;

public final class Heroi {

    private final Profissao profissao;
    private final String nome;
    private final TipoDeCabelo tipoDeCabelo;
    private final CorDoCabelo corDoCabelo;
    private final Armadura armadura;
    private final Arma arma;

    public Heroi(Builder builder) {
        this.profissao = builder.profissao;
        this.nome = builder.nome;
        this.tipoDeCabelo = builder.tipoDeCabelo;
        this.corDoCabelo = builder.corDoCabelo;
        this.armadura = builder.armadura;
        this.arma = builder.arma;
    }

    public Profissao getProfissao() {
        return profissao;
    }

    public String getNome() {
        return nome;
    }

    public TipoDeCabelo getTipoDeCabelo() {
        return tipoDeCabelo;
    }

    public CorDoCabelo getCorDoCabelo() {
        return corDoCabelo;
    }

    public Armadura getArmadura() {
        return armadura;
    }

    public Arma getArma() {
        return arma;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("Este é um ")
                .append(profissao)
                .append(" chamado ")
                .append(nome);

        if(corDoCabelo != null || tipoDeCabelo != null) {
            if(tipoDeCabelo != null) {
                if(tipoDeCabelo == TipoDeCabelo.CARECA) {
                    sb.append(" é ").append(tipoDeCabelo);
                } else {
                    sb.append(" tem cabelo ");
                    if(corDoCabelo != null) {
                        sb.append(corDoCabelo).append(" ");
                    }
                    sb.append(tipoDeCabelo).append(" ");
                }
            }
        }

        if(armadura != null) {
            sb.append(" está vestindo ").append(armadura);
        }
        if(arma != null) {
            sb.append(" e está empunhando um(a) ").append(arma);
        }
        sb.append(".");

        return sb.toString();
    }

    public static class Builder {

        private final Profissao profissao;
        private final String nome;
        private TipoDeCabelo tipoDeCabelo;
        private CorDoCabelo corDoCabelo;
        private Armadura armadura;
        private Arma arma;

        public Builder(Profissao profissao, String nome) {
            if(profissao == null || nome == null) {
                throw new IllegalArgumentException("profissao e nome não podem ser nulos");
            }
            this.profissao = profissao;
            this.nome = nome;
        }

        public Builder comTipoDeCabelo(TipoDeCabelo tipoDeCabelo) {
            this.tipoDeCabelo = tipoDeCabelo;
            return this;
        }

        public Builder comCorDeCabelo(CorDoCabelo corDoCabelo) {
            this.corDoCabelo = corDoCabelo;
            return this;
        }

        public Builder comArmadura(Armadura armadura) {
            this.armadura = armadura;
            return this;
        }

        public Builder comArma(Arma arma) {
            this.arma = arma;
            return this;
        }

        public Heroi build() {
            return new Heroi(this);
        }

    }
}
