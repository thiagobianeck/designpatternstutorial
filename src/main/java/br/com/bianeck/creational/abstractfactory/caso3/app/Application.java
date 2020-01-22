package br.com.bianeck.creational.abstractfactory.caso3.app;

import br.com.bianeck.creational.abstractfactory.caso3.buttons.Button;
import br.com.bianeck.creational.abstractfactory.caso3.checkboxes.Checkbox;
import br.com.bianeck.creational.abstractfactory.caso3.factories.GUIFactory;

/**
 * Factory users don't care which concrete factory they use since they work with
 * factories and products through abstract interfaces.
 */
public class Application {
    private Button button;
    private Checkbox checkbox;

    public Application(GUIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void paint() {
        button.paint();
        checkbox.paint();
    }
}
