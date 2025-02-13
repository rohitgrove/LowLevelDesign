public class Main {
    public static void main(String[] args) {
        AbstractScorpio scorpio = new ScorpioN(new ScorpionN_Imp_USA());
        System.out.println(scorpio.isRightHanded());
    }
}