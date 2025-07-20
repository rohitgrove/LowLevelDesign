public class Main {
    public static void main(String[] args) {
        Scorpio scorpio = new Scorpio();
        Scorpio advScorpio = new AdvancedScorpio();
        StandardBreak standardBreak = new StandardBreak();
        StandardBreak advBreak = new AdvancedBreak();

        // scorpio.applyBreak(standardBreak);
        // advScorpio.applyBreak(standardBreak);

        scorpio.applyBreak(advBreak);
        // yaha fatega
        advScorpio.applyBreak(advBreak);
    }
}
