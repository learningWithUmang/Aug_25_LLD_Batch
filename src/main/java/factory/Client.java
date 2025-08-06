package factory;

import factory.abstractfactory.UIFactory;
import factory.components.button.Button;
import factory.components.checkbox.Checkbox;

public class Client {
    public static void main(String[] args) {
        Flutter flutter = new Flutter();
        UIFactory uiFactory = flutter.createUIFactory(Platform.IOS);


        Button button = uiFactory.createButton("Click Me");

        button.getLabel();
        button.render();
        button.setLabel("New Label");

        Checkbox checkbox = uiFactory.createCheckBox("Accept Terms");

        checkbox.render();
        checkbox.onCheck();
        checkbox.setLabel("New Checkbox Label");


    }
}
