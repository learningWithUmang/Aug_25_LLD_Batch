package factory.abstractfactory;


import factory.components.button.AndroidButton;
import factory.components.button.Button;
import factory.components.checkbox.AndroidCheckbox;
import factory.components.checkbox.Checkbox;

public class AndroidUIFactory implements UIFactory {
    public Button createButton(String label) {
        return new AndroidButton(label);
    }

    public Checkbox createCheckBox(String label) {
        return new AndroidCheckbox(label);
    }

}
