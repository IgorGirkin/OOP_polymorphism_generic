public class DriverCategoryD extends Driver<Bus>{
    public DriverCategoryD(String fullName, boolean hasDriverLicense, int experience) {
        super(fullName, hasDriverLicense, experience);
    }

    @Override
    public void startMovement(Bus transport) {
        System.out.println("Водитель " + getFullName() +", управляющий автобусом: " +
                transport.getBrand()+" "+transport.getModel()+  ", начал движение!");

    }

    @Override
    public void stopMovement(Bus transport) {
        System.out.println("Водитель " + getFullName() +", управляющий автобусом: " +
                transport.getBrand()+" "+transport.getModel()+  ", остановился.");

    }


    @Override
    public void refuel() {
           System.out.println("Водитель " + getFullName() +" заправил автобус.");
    }

}
