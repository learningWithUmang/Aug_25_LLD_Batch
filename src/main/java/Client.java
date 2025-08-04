import abstractfactory.UIFactory;
import components.button.Button;
import components.checkbox.Checkbox;

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
