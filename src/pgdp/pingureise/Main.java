package pgdp.pingureise;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // An example Travel graph
        // Feel free to change it to test your code
        Destination start = new Destination("South pole", 10);
        Destination d1 = new Destination("Iceberg", 5);
        Destination d2 = new Destination("Madagascar", 15);
        Destination d3 = new Destination("Atlantis", 7);

        start.addTrainConnection(d1);
        start.addTrainConnection(d2);

        d1.addTrainConnection(d3);
        d1.addTrainConnection(d2);

        d3.addTrainConnection(d2);

        Travel graph = new Travel(start);
//        Iterator<Destination> d = graph.iterator();
//        while (d.hasNext()) {
//            System.out.println(d.next());
//        }
//        System.out.println(averageNumberOfPhotos(graph));
//        System.out.println(listOfDestinations(graph));
    }

    public static double averageNumberOfPhotos(Iterable<Destination> travel) {
        Iterator<Destination> d = travel.iterator();
        int sum = 0, numberOfSteps = 0;
        while (d.hasNext()) {
            sum += d.next().getNumberOfSightseeingSpots();
            numberOfSteps++;
        }
        return (double) sum / numberOfSteps;
    }

    public static List<Destination> listOfDestinations(Iterable<Destination> travel) {
        Iterator<Destination> d = travel.iterator();
        List<Destination> l = new ArrayList<>();
        while (d.hasNext()) {
            l.add(d.next());
        }
        return l;
    }
}