package br.com.bianeck.creational.abstractfactory.caso3.factories;

import br.com.bianeck.creational.abstractfactory.caso3.buttons.Button;
import br.com.bianeck.creational.abstractfactory.caso3.checkboxes.Checkbox;

/**
 * Abstract factory knows about all (abstract) product types.
 */
public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}