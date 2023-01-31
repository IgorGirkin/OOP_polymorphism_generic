import static java.sql.DriverManager.getDriver;

public class DriverCategoryB extends Driver <Car> {
    public DriverCategoryB(String fullName, boolean hasDriverLicense, int experience) {
        super(fullName, hasDriverLicense, experience);
    }

    @Override
    public void startMovement(Car transport) {
        System.out.println("Водитель " + getFullName() +", управляющий автомобилем: " +
                transport.getBrand()+" "+transport.getModel()+  ", начал движение!");

    }

    @Override
    public void stopMovement(Car transport) {
        System.out.println("Водитель " + getFullName() +", управляющий автомобилем: " +
                transport.getBrand()+" "+transport.getModel()+  ", остановился.");

    }


    @Override
    public void refuel() {
        System.out.println("Водитель " + getFullName() +" заправил авто.");
    }

}
