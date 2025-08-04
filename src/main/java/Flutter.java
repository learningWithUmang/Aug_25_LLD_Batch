import abstractfactory.AndroidUIFactory;
import abstractfactory.IOSUIFactory;
import abstractfactory.UIFactory;
import abstractfactory.WindowsUIFactory;

public class Flutter {
    void refreshUI(){
        System.out.println("Refreshing Flutter UI...");
    }

    void renderWidget(String widgetName) {
        System.out.println("Rendering Flutter widget: " + widgetName);
    }

    void handleEvent(String eventName) {
        System.out.println("Handling Flutter event: " + eventName);
    }

    UIFactory createUIFactory(Platform platform){
        return UIFactoryFactory.getUIFactory(platform);
    }

}
