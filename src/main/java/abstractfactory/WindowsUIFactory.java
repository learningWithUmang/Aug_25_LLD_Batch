package abstractfactory;

import components.button.Button;
import components.button.WindowsButton;
import components.checkbox.Checkbox;
import components.checkbox.WindowsCheckbox;

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
