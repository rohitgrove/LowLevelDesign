public class Main {
    public static void main(String[] args) {
        ICar scorpio = new Scorpio();
        ICar bulletProofScorpio = new BulletProff(scorpio);
        float totalWeight = bulletProofScorpio.getWeight();
        System.out.println("Printing weight: " + totalWeight);
    }
}