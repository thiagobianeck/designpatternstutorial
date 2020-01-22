package br.com.bianeck.creational.abstractfactory.caso2.factory;

public interface AbstractFactory<T, U extends Enum<U>> {

    T criar(U tipo);
}
