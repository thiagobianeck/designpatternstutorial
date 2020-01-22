package br.com.bianeck.creacional.abstractfactory.caso5;

class NotPCFactory extends AbstractFactory {

    public NotPCFactory() {
        prototype = new NotPCPhase();
    }

    @Override
    public Expression makeGrade() {
        return new Expression("\"my way, or the highway\"");
    }

    @Override
    public Expression makeCompromise() {
        return new Expression("\"take test, deal with the results\"");
    }
}