public class Main {
    public static void main(String[] args) {
        UIComponenet uiComponenet = new Menu();

        uiComponenet.add(new Button());
        uiComponenet.add(new Button());
        Button btn = new Button();
        uiComponenet.add(btn);

        uiComponenet.draw();

        uiComponenet.remove(btn);

        uiComponenet.draw();
    }
}