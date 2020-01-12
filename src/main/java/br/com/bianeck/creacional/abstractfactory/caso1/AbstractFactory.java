package br.com.bianeck.creacional.abstractfactory.caso1;

public interface AbstractFactory<T> {

    T criar(String tipo);
}
