import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public abstract class Driver<T extends Transport> {
    private final String fullName;
    private final boolean hasDriverLicense;
    private int experience;
    public String driverLicenseType;
    private List<AutoMechanic> autoMechanics;

    public Driver(String fullName, boolean hasDriverLicense, int experience,
                  String driverLicenseType) {
        this.fullName = fullName;
        this.hasDriverLicense = hasDriverLicense;
        this.experience = experience;
        this.driverLicenseType = driverLicenseType;
        this.autoMechanics = new ArrayList<>();

    }


    public void startMovement(Transport transport) {
        System.out.println("Водитель " + getFullName() + ", управляющий автомобилем: " +
                transport.getBrand() + " " + transport.getModel() + ", начал движение!");
        try {
            String requiredCategory = transport.getRequiredDriverLicenseCategory();
            if (requiredCategory != null && !requiredCategory.equals(driverLicenseType)) {
                throw new DriverLicenseException("У водителя " + fullName + " нет необходимой категории прав для" +
                        " управления транспортным средством " +
                        transport.getBrand() + " " + transport.getModel() + "!, “Необходимо указать тип прав!”");
            }
        } catch (DriverLicenseException e) {
            System.out.println(e.getMessage());
            return;
        }
    }


    public abstract void stopMovement(Transport transport);

    public abstract void refuel();

    public String getFullName() {
        return fullName;
    }

    public boolean isHasDriverLicense() {
        return hasDriverLicense;
    }


    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public String getDriverLicenseType() {
        return driverLicenseType;
    }

    public void setDriverLicenseType(String driverLicenseType) {
        this.driverLicenseType = driverLicenseType;
    }

    public List<AutoMechanic> getAutoMechanics() {
        return autoMechanics;
    }

    public void setAutoMechanics(List<AutoMechanic> autoMechanics) {
        this.autoMechanics = autoMechanics;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Driver<?> driver = (Driver<?>) o;
        return hasDriverLicense == driver.hasDriverLicense && experience == driver.experience && Objects.equals(fullName, driver.fullName) && Objects.equals(driverLicenseType, driver.driverLicenseType) && Objects.equals(autoMechanics, driver.autoMechanics);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName, hasDriverLicense, experience, driverLicenseType, autoMechanics);
    }

    @Override
    public String toString() {
        return fullName + ", стаж вождения " + experience + " лет, категоря: " + driverLicenseType;

    }
}