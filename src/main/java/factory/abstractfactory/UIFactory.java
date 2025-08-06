package factory.abstractfactory;

import factory.components.button.Button;
import factory.components.checkbox.Checkbox;

public interface UIFactory {
    /*
    factory method

     */
    Button createButton(String label); //return Button
    Checkbox createCheckBox(String label); // return CheckBox
}
