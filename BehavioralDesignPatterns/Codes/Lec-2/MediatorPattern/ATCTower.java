import java.util.ArrayList;
import java.util.List;

public class ATCTower {
    // before data hona chiye saare aircraft ka
    List<IAircraft> queueForLanding = new ArrayList<>();

    synchronized public void requestToLand(IAircraft aircraft) {
        // check for permission and if permission is granted then call land method
        System.out.println("Inside ATC tower");
        if (queueForLanding.isEmpty()) {
            aircraft.land();
        } else {
            queueForLanding.add(aircraft);
        }
    }
}
