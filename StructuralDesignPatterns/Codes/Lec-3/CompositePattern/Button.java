public class Button implements UIComponenet {
    @Override
    public void draw() {
        System.out.println("drawing button");
    }

    @Override
    public void add(UIComponenet componenet) {
        System.out.println("adding button");
    }

    @Override
    public void remove(UIComponenet componenet) {
        System.out.println("removing button");
    }
}