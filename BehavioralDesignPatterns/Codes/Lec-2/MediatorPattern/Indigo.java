public class Indigo implements IAircraft {
    ATCTower atcTower;

    public Indigo(ATCTower tower) {
        this.atcTower = tower;
    }

    // khud se land ko call nahi krega aircraft, kyoki permission is needed
    @Override
    public void land() {
        System.out.println("Main indigo land karr rha hu");
    }

    // permision lega atc se
    public void requestPermformLanding() {
        System.out.println("Calling atc tower method for permission");
        atcTower.requestToLand(this);
    }
}