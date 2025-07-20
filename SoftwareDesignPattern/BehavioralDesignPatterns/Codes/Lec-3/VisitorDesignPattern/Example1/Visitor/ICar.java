public interface ICar {
    // ye bhot important function hai, double dispatch k pov se
    public void accept(ICarVisitor carVisitor);
}
