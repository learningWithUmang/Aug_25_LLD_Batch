package factory.abstractfactory;

import factory.components.button.Button;
import factory.components.button.WindowsButton;
import factory.components.checkbox.Checkbox;
import factory.components.checkbox.WindowsCheckbox;

public class WindowsUIFactory implements UIFactory{
    @Override
    public Button createButton(String label) {
        return new WindowsButton(label);
    }

    @Override
    public Checkbox createCheckBox(String label) {
        return new WindowsCheckbox(label);
    }
}
