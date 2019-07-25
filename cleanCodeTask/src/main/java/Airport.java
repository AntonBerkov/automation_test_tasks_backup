import planes.ExperimentalPlane;
import models.MilitaryType;
import planes.MilitaryPlane;
import planes.PassengerPlane;
import planes.Plane;

import java.util.*;

// version: 1.1
// made by Vitali Shulha
// 4-Jan-2019

public class Airport {

    public List<PassengerPlane> getPassengerPlane() {
        List<PassengerPlane> passengerPlanes = new ArrayList<>();
        for (Plane plane : planes) {if (plane instanceof PassengerPlane) {passengerPlanes.add((PassengerPlane) plane);}}
        return passengerPlanes;
    }

    public List<MilitaryPlane> getMilitaryPlanes() {
        List<MilitaryPlane> militaryPlanes = new ArrayList<>();
        for (Plane plane : planes) { if (plane instanceof MilitaryPlane) { militaryPlanes.add((MilitaryPlane) plane); } }
        return militaryPlanes;
    }

    public PassengerPlane getPassengerPlaneWithMaxPassengersCapacity() {
        List<PassengerPlane> passengerPlanes = getPassengerPlane();
        PassengerPlane planeWithMaxCapacity = passengerPlanes.get(0);
        for (int i = 0; i < passengerPlanes.size(); i++) {
            if (passengerPlanes.get(i).getPassengersCapacity() > planeWithMaxCapacity.getPassengersCapacity()) {
                planeWithMaxCapacity = passengerPlanes.get(i);
            }
        }
        return planeWithMaxCapacity;
    }

    public List<MilitaryPlane> getTransportMilitaryPlanes() {
        List<MilitaryPlane> transportMilitaryPlanes = new ArrayList<>();
        List<MilitaryPlane> militaryPlanes = getMilitaryPlanes();
        for (int i = 0; i < militaryPlanes.size(); i++) {
            MilitaryPlane plane = militaryPlanes.get(i);
            if (plane.getMilitaryType().equals(MilitaryType.TRANSPORT)) {
                transportMilitaryPlanes.add(plane);
            }
        }
        return transportMilitaryPlanes;
    }

    public List<MilitaryPlane> getBomberMilitaryPlanes() {
        List<MilitaryPlane> bomberMilitaryPlanes = new ArrayList<>();
        List<MilitaryPlane> militaryPlanes = getMilitaryPlanes();
        for (int i = 0; i < militaryPlanes.size(); i++) {
            MilitaryPlane plane = militaryPlanes.get(i);
            if (plane.getMilitaryType().equals(MilitaryType.BOMBER)) {
                bomberMilitaryPlanes.add(plane);
            }
        }
        return bomberMilitaryPlanes;
    }

    public List<ExperimentalPlane> getExperimentalPlanes() {
        List<ExperimentalPlane> ExperimentalPlanes = new ArrayList<>();
        for (Plane plane : planes) {
            if (plane instanceof ExperimentalPlane) {
                ExperimentalPlanes.add((ExperimentalPlane) plane);
            }
        }
        return ExperimentalPlanes;
    }

    private List<? extends Plane> planes;

    public Airport(List<? extends Plane> planes) {
        this.planes = planes;
    }

    public List<? extends Plane> getPlanes() {
        return planes;
    }

    @Override
    public String toString() {
        return "Airport{" +
                "planes=" + planes.toString() +
                '}';
    }
}
