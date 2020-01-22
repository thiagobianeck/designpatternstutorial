package br.com.bianeck.creational.builder.caso3.builders;

import br.com.bianeck.creational.builder.caso3.cars.Type;
import br.com.bianeck.creational.builder.caso3.components.Engine;
import br.com.bianeck.creational.builder.caso3.components.GPSNavigator;
import br.com.bianeck.creational.builder.caso3.components.Transmission;
import br.com.bianeck.creational.builder.caso3.components.TripComputer;

/**
 * Builder interface defines all possible ways to configure a product.
 */
public interface Builder {
    void setType(Type type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}