public class Scorpio {
    public String whatsMyName() {
        return "Scorpio";
    }

    public void applyBreak(StandardBreak normalBreak) {
        System.out.println(whatsMyName() + " apply normal Break " + normalBreak.playSound());
    }

    public void applyBreak(AdvancedBreak advBreak) {
        System.out.println(whatsMyName() + " apply adv Break " + advBreak.playSound());
    }
}
