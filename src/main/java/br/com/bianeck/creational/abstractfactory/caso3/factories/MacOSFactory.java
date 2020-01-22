package br.com.bianeck.creational.abstractfactory.caso3.factories;

import br.com.bianeck.creational.abstractfactory.caso3.buttons.Button;
import br.com.bianeck.creational.abstractfactory.caso3.buttons.MacOSButton;
import br.com.bianeck.creational.abstractfactory.caso3.checkboxes.Checkbox;
import br.com.bianeck.creational.abstractfactory.caso3.checkboxes.MacOSCheckbox;

/**
 * Each concrete factory extends basic factory and responsible for creating
 * products of a single variety.
 */
public class MacOSFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}