public class DriverCategoryD extends Driver {

    public DriverCategoryD(String fullName, boolean hasDriverLicense, int experience, String driverLicenseType) {
        super(fullName, hasDriverLicense, experience, driverLicenseType);
    }

    @Override
    public void startMovement(Transport transport) {
        super.startMovement(transport);
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

    @Override
    public String toString() {
        return getFullName() + ", стаж вождения: "+getExperience()+ " лет, категория: "+getDriverLicenseType();
    }
}
