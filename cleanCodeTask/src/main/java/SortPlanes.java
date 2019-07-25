import planes.Plane;
import java.util.List;

import static java.util.Comparator.*;

public class SortPlanes {

    public List<? extends Plane> sortByMaxDistance(List<? extends Plane> planes) {
        planes.sort(comparingInt(Plane::getMaxFlightDistance));
        return planes;
    }

    public List<? extends Plane> sortByMaxSpeed(List<? extends Plane> planes) {
        planes.sort(comparingInt(Plane::getMS));
        return planes;
    }

    public List<? extends Plane> sortByMaxLoadCapacity(List<? extends Plane> planes) {
        planes.sort(comparingInt(Plane::getMinLoadCapacity));
        return planes;
    }
}
