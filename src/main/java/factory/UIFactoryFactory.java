package factory;

import factory.abstractfactory.AndroidUIFactory;
import factory.abstractfactory.IOSUIFactory;
import factory.abstractfactory.UIFactory;
import factory.abstractfactory.WindowsUIFactory;


//factory method
public class UIFactoryFactory {
    public static UIFactory getUIFactory(Platform platform) {
        switch (platform) {
            case IOS:
                return new IOSUIFactory();
            case ANDROID:
                return new AndroidUIFactory();
            case WINDOWS:
                return new WindowsUIFactory();
            default:
                throw new IllegalArgumentException("Unknown platform: " + platform);
        }
    }
}
