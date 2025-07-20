public class Cat implements Animal {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this); // First Dispatch
    }
}