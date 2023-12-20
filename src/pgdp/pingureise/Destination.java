package pgdp.pingureise;

import java.util.ArrayList;
import java.util.List;


public class Destination {
    private String name;
    private int numberOfSightseeingSpots;
    private List<Destination> trainConnections;

    public Destination(String name, int numberOfSightseeingSpots) {
        this.name = name;
        this.numberOfSightseeingSpots = numberOfSightseeingSpots;
        this.trainConnections = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getNumberOfSightseeingSpots() {
        return numberOfSightseeingSpots;
    }

    public void addTrainConnection(Destination other) {
        trainConnections.add(other);
    }

    public List<Destination> getTrainConnections() {
        return trainConnections;
    }

    public String toString() {
        return name + ":" + numberOfSightseeingSpots;
    }
}
