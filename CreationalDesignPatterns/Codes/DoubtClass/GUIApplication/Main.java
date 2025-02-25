interface Button {
    public void paint();
}

interface Checkbox {
    public void paint();
}

class WindowsButton implements Button {
    @Override
    public void paint() {
        System.out.println("Rendering win button");
    }
}

class WindowsCheckBox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("Rendering win checkbox");
    }
}

class MacOSButton implements Button {
    @Override
    public void paint() {
        System.out.println("Rendering macOS button");
    }
}

class MacOSCheckBox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("Rendering macOS checkbox");
    }
}

// Abstract factory
interface GUIFactory {
    Button createButton();

    Checkbox createCheckbox();
}

// Concrete Factories - which will be creating objects of same family
class WindowsFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckBox();
    }
}

class MacOSFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckBox();
    }
}

class Application {
    private Button button;
    private Checkbox checkbox;

    public Application(GUIFactory factory) {
        this.button = factory.createButton();
        this.checkbox = factory.createCheckbox();
    }

    public void paint() {
        button.paint();
        checkbox.paint();
    }
}

public class Main {
    public static void main(String[] args) {
        // determine the platform.....
        // platform = getPLat()
        GUIFactory guif = new WindowsFactory();
        Application application = new Application(guif);
        application.paint();
    }
}