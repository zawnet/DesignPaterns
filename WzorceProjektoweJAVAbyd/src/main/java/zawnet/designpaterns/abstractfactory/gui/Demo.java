package zawnet.designpaterns.abstractfactory.gui;

import java.util.Arrays;

public class Demo {

    private static Application configureApplication() {
        Application app;
        GUIFactory factory;
        String osName = System.getProperty("os.name").toLowerCase();
        if (osName.contains("mac")) {
            factory = new MacOSFactory();
            app = new Application(factory);
        } else {
            factory = new WindowsFactory();
            app = new Application(factory);
        }
        return app;
    }
    public static void main(String[] args) {

        Application application = configureApplication();
        application.paint();
    }
}
