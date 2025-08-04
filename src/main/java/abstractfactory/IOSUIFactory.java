package abstractfactory;

import components.button.Button;
import components.button.IOSButton;
import components.checkbox.Checkbox;
import components.checkbox.IOSCheckbox;

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
