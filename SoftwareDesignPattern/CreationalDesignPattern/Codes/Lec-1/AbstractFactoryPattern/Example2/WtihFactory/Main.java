public class Main {
    public static void main(String[] args) {
        ThemeFactory themeFactory = new LightThemeFactory(); // Change to DarkThemeFactory for dark theme

        Button button = themeFactory.createButton();
        TextField textField = themeFactory.createTextField();

        button.display();
        textField.display();
    }
}
