public class Main {
    public static void main(String[] args) {
        Scorpio scorpio = new Scorpio();
        Scorpio advancedScorpio = new AdvancedScorpio();
        StandardBreak standardBreak = new StandardBreak();
        StandardBreak advancedBreak = new AdvancedBreak();
        // SingleDispatch hai java main
        // scorpio.applyBreak(standardBreak);
        // advancedScorpio.applyBreak(standardBreak);

        // DoubleDispatch phat jata hai java main
        scorpio.applyBreak(advancedBreak);
        // yaha phataga
        advancedScorpio.applyBreak(advancedBreak);
    }
}