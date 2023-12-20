package pgdp.pingureise;

import java.util.Iterator;

public class Travel implements Iterable<Destination> {
    private Destination startDestination;

    public Travel(Destination startDestination) {
        this.startDestination = startDestination;
    }

    public Destination getStartDestination() {
        return startDestination;
    }

    @Override
    public Iterator<Destination> iterator() {
        return new TravelIterator(startDestination);
    }
}
