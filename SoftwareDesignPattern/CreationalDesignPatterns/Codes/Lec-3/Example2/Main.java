// Step 4: Client Code
public class Main {
    public static void main(String[] args) {
        RaceCar raceCar = new RaceCar();
        VintageCar vintageCar = new VintageCar();

        RaceCar clonedRaceCar = raceCar.clone();
        VintageCar clonedVintageCar = vintageCar.clone();

        System.out.println(clonedRaceCar.model); // 2020
        System.out.println(clonedVintageCar.model); // 2024

        // We can change the properties of cloned objects
        clonedRaceCar.setEngine(new CarEngine());
        clonedRaceCar.setModel(2021);

        clonedVintageCar.setEngine(new CarEngine());
        clonedVintageCar.setModel(2025);

        System.out.println(clonedRaceCar.model); // 2021
        System.out.println(clonedVintageCar.model); // 2025
    }
}
