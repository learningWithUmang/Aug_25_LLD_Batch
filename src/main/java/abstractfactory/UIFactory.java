package abstractfactory;

import components.button.Button;
import components.checkbox.Checkbox;

public interface UIFactory {
    /*
    factory method

     */
    Button createButton(String label); //return Button
    Checkbox createCheckBox(String label); // return CheckBox
}
