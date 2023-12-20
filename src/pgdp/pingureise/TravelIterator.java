package pgdp.pingureise;

import java.util.HashSet;
import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * This class contains a dummy implementation
 * that visits the startDestination 10 times and stops.
 * For the exercise 1, this class needs to be modified
 * <p>
 * You can use the class as-is to test the other exercises.
 */
public class TravelIterator implements Iterator<Destination> {
    private HashSet<Destination> alreadyGoneDestinations;
    private Destination currentDestination;
    private int numberOfSteps = 0;

    // Do not change the signature of the constructor!
    public TravelIterator(Destination startDestination) {
        currentDestination = startDestination;
        alreadyGoneDestinations = new HashSet<>();
    }

    @Override
    public boolean hasNext() {
        return currentDestination != null;
    }

    @Override
    public Destination next() {
        if (hasNext()) {
            Destination rt = currentDestination;
            alreadyGoneDestinations.add(currentDestination);
            currentDestination = null;
            for (Destination d : rt.getTrainConnections()) {
                if (!alreadyGoneDestinations.contains(d)) {
                    currentDestination = d;
                    break;
                }
            }
            numberOfSteps++;
            return rt;
        } else throw new NoSuchElementException();
    }
}
