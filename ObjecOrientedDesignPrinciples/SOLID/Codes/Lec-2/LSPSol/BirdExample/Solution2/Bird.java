public class Bird {
    public void eat() {
    }
}

interface IFlyingBird {
    public void fly();
}

interface ISingingBird {
    public void sing();
}

class Sparrow extends Bird implements IFlyingBird, ISingingBird {
    @Override
    public void fly() {
        throw new UnsupportedOperationException("Unimplemented method 'fly'");
    }

    @Override
    public void sing() {
        throw new UnsupportedOperationException("Unimplemented method 'sing'");
    }
}