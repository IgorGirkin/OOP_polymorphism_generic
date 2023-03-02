import java.util.AbstractQueue;
import java.util.ArrayDeque;
import java.util.Queue;
//
//public class ServiceStation {
//    private final Queue<Transport> transports = new ArrayDeque<>();
//
//    public void add(Transport transport) {
//        transports.offer(transport);
//    }
//    public void addCar(Car car) {
//        add(car);
//    }
//    public void addTrucks(Trucks trucks) {
//        add(trucks);
//    }
//
//    public void runDiagnostics() {
//        if (transports.isEmpty()) {
//            Transport transport = transports.poll();
//            boolean result = transport.runDiagnostics();
//            if (!result) {
//                transport.fixTheCar();
//            }
//        }
//
//    }
//
//
//
//}
public class ServiceStation {
    private final Queue<Transport> transports = new ArrayDeque<>();

    public void add(Transport transport) {
        if (!(transport instanceof Bus)) {
            transports.offer(transport);
        }
    }

    public void addCar(Car car) {
        add(car);
    }

    public void addTrucks(Trucks truck) {
        add(truck);
    }

    public void runDiagnostics() {
        while (!transports.isEmpty()) {
            Transport transport = transports.poll();
            boolean result = transport.runDiagnostics();
            if (!result) {
                transport.performMaintenance();
                transport.fixTheCar();
            }
            remove(transport);
        }
    }

    public void remove(Transport transport) {
        transports.remove(transport);
    }
}