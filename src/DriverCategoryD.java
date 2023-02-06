public class DriverCategoryD extends Driver {
    public DriverCategoryD(String fullName, boolean hasDriverLicense, int experience) {
        super(fullName, hasDriverLicense, experience);
    }

    @Override
    public void startMovement(Transport transport) {
        System.out.println("Водитель " + getFullName() +", управляющий автобусом: " +
                transport.getBrand()+" "+transport.getModel()+  ", начал движение!");

    }

    @Override
    public void stopMovement(Transport transport) {
        System.out.println("Водитель " + getFullName() +", управляющий автобусом: " +
                transport.getBrand()+" "+transport.getModel()+  ", остановился.");

    }


    @Override
    public void refuel() {
           System.out.println("Водитель " + getFullName() +" заправил автобус.");
    }

}
