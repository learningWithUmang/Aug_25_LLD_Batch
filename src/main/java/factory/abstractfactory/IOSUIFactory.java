package factory.abstractfactory;

import factory.components.button.Button;
import factory.components.button.IOSButton;
import factory.components.checkbox.Checkbox;
import factory.components.checkbox.IOSCheckbox;

public class IOSUIFactory implements UIFactory{
    @Override
    public Button createButton(String label) {
        return new IOSButton(label);
    }

    @Override
    public Checkbox createCheckBox(String label) {
        return new IOSCheckbox(label);
    }
}
