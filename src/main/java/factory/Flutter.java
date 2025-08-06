package factory;

import factory.abstractfactory.UIFactory;

public class Flutter {
    void refreshUI(){
        System.out.println("Refreshing factory.Flutter UI...");
    }

    void renderWidget(String widgetName) {
        System.out.println("Rendering factory.Flutter widget: " + widgetName);
    }

    void handleEvent(String eventName) {
        System.out.println("Handling factory.Flutter event: " + eventName);
    }

    UIFactory createUIFactory(Platform platform){
        return UIFactoryFactory.getUIFactory(platform);
    }

}
