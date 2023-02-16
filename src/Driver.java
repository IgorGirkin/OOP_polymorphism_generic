import java.util.Objects;

public abstract class Driver {
    private final String fullName;
    private final boolean hasDriverLicense;
    private int experience;
    public String driverLicenseType;

    public Driver(String fullName, boolean hasDriverLicense, int experience,
                  String driverLicenseType) {
        this.fullName = fullName;
        this.hasDriverLicense = hasDriverLicense;
        this.experience = experience;
        this.driverLicenseType = driverLicenseType;

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
//        System.out.println("Водитель " + fullName + " начал движение на " +
//                " " + transport.getBrand() + " " + transport.getModel());
//        try {
//            checkDriverLicense(transport.getRequiredDriverLicenseCategory());
//        } catch (DriverLicenseException e) {
//            System.out.println(e.getMessage());
//            return;
//        }
//        public void checkDriverLicense(String requiredCategory) throws DriverLicenseException {
//        if (driverLicenseType == null || !driverLicenseType.equals(requiredCategory)) {
//            throw new DriverLicenseException("Нет соответствующей категории прав");
//        }
//    }


    public abstract void stopMovement(Transport transport);

    public abstract void refuel();

    public String getFullName() {
        return fullName;
    }

    public boolean isHasDriverLicense() {
        return hasDriverLicense;
    }

//    public void setHasDriverLicense(boolean hasDriverLicense) {
//        this.hasDriverLicense = hasDriverLicense;
//    }

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


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Driver driver = (Driver) o;
        return hasDriverLicense == driver.hasDriverLicense && experience == driver.experience && Objects.equals(fullName, driver.fullName) && driverLicenseType.equals(driver.driverLicenseType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName, hasDriverLicense, experience, driverLicenseType);
    }
}