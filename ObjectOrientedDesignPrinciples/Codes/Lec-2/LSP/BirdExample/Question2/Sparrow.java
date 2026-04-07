// Subclass: Sparrow
class Sparrow extends Bird {
    // Exception 1: Sparrow cannot swim, so we don't override the swim method
    @Override
    public void fly() {
        System.out.println("Sparrow is flying");
    }
    @Override
    public void walk() {
        System.out.println("Sparrow is walking");
    }
    @Override
    public void eat() {
        System.out.println("Sparrow is eating");
    }

}
