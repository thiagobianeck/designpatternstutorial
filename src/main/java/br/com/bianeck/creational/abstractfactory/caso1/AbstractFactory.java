package br.com.bianeck.creational.abstractfactory.caso1;

public interface AbstractFactory<T> {

    T criar(String tipo);
}
