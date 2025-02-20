import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Airforce {
    List<IAircraft> jets = new ArrayList<>();
    IAircraft[] helies = new IAircraft[1];
    LinkedList<Boeing> cargo = new LinkedList<>();

    public Airforce() {
        jets.add(new Tejas());
        helies[0] = new Chinook();
        cargo.add(new Boeing());
    }

    // getters
    public List<IAircraft> getJets() {
        return jets;
    }

    public IAircraft[] getHelis() {
        return helies;
    }

    public LinkedList<Boeing> getCargo() {
        return cargo;
    }

    // create a Airforce level ka iterator
    public CoustomIterator createIterator() {
        return new AirforceIterator(this);
    }
}
