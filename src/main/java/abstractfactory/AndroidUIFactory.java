package abstractfactory;


import components.button.AndroidButton;
import components.button.Button;
import components.checkbox.AndroidCheckbox;
import components.checkbox.Checkbox;

public class AndroidUIFactory implements UIFactory {
    public Button createButton(String label) {
        return new AndroidButton(label);
    }

    public Checkbox createCheckBox(String label) {
        return new AndroidCheckbox(label);
    }

}
