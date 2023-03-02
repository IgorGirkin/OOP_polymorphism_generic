public class AutoMechanic<T extends Transport> {
    public final String fullName;
    public final String company;

    public AutoMechanic(String fullName, String company) {
        this.fullName = fullName;
        this.company = company;


    }

    public String getFullName() {
        return fullName;
    }

    public String getCompany() {
        return company;
    }

    public boolean runDiagnostics(Transport transport) {
        return transport.runDiagnostics();

    }


    public void performMaintenance(Transport transport) {
        transport.performMaintenance();
//        System.out.println("Механик " + fullName + " проводит техническое обслуживание " +
//                transport.getBrand() + " " + transport.getModel());
    }

    public void fixTheCar(Transport transport) {
        transport.fixTheCar();
//        System.out.println("Механик " + fullName + " ремонтирует " + transport.getBrand() +
//                " " + transport.getModel());

    }

    @Override
    public String toString() {
        return fullName + ", из компании " + company;

    }
}
