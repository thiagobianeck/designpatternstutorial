package br.com.bianeck.creational.abstractfactory.caso3.factories;

import br.com.bianeck.creational.abstractfactory.caso3.buttons.Button;
import br.com.bianeck.creational.abstractfactory.caso3.buttons.WindowsButton;
import br.com.bianeck.creational.abstractfactory.caso3.checkboxes.Checkbox;
import br.com.bianeck.creational.abstractfactory.caso3.checkboxes.WindowsCheckbox;

/**
 * Each concrete factory extends basic factory and responsible for creating
 * products of a single variety.
 */
public class WindowsFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
