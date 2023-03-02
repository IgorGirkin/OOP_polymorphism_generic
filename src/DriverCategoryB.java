public class DriverCategoryB extends Driver  {


    public DriverCategoryB(String fullName, boolean hasDriverLicense, int experience, String driverLicenseType) {
        super(fullName, hasDriverLicense, experience, driverLicenseType);
    }


    @Override
    public void startMovement(Transport transport) {
        super.startMovement(transport);
    }

    @Override
    public void stopMovement(Transport transport) {
        System.out.println("Водитель " + getFullName() +", управляющий автомобилем: " +
                transport.getBrand()+" "+transport.getModel()+  ", остановился.");
    }


    @Override
    public void refuel() {
        System.out.println("Водитель " + getFullName() +" заправил авто.");
    }

    @Override
    public String toString() {
        return getFullName() + ", стаж вождения: "+getExperience()+ " лет, категория: "+getDriverLicenseType();
    }
}
