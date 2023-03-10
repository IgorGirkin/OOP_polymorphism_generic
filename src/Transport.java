import java.util.*;

public abstract class Transport implements Competing {
    private final String brand;
    private final String model;
    private final double engineVolume;
    private boolean isMoving;
    private String requiredDriverLicenseCategory;
    private List<AutoMechanic> mechanics;
    private Set<Driver> drivers = new HashSet<>();

    public Transport(String brand, String model, double engineVolume, boolean isMoving) {

        if (brand == null || brand.isEmpty() || brand.isBlank()) {


            this.brand = "default";
        } else {
            this.brand = brand;
        }
        if (model != null && !model.isEmpty() && !model.isBlank()) {
            this.model = model;
        } else {
            this.model = "default";
        }
        if (engineVolume <= 0) {

            this.engineVolume = 6.0;
        } else {
            this.engineVolume = engineVolume;
        }
        this.isMoving = isMoving;
         this.requiredDriverLicenseCategory = requiredDriverLicenseCategory;
        this.mechanics = new ArrayList<>();
    }
        public final String getBrand() {
        return brand;
    }


//   public void setIsMoving ( boolean isMoving){
//            this.isMoving = isMoving;
//        }

    public List<AutoMechanic> getAutoMechanic() {
    return mechanics;
}
    public abstract void startMovement();
    public abstract void stopMovement();

    public abstract void printType();

    public void addMechanic(AutoMechanic<?>... mechanics) {
        this.mechanics.addAll(Arrays.asList(mechanics));
    }

   public void addDriver(Driver<?>... drivers) {
    for (Driver<?> driver : drivers) {
        if (!this.drivers.contains(driver)) {
            this.drivers.add(driver);
            System.out.println("Водитель " + driver.getFullName() + " добавлен в базу данных.");
        } else {
            System.out.println("Водитель " + driver.getFullName() + " уже есть в базе данных.");
        }
    }
}

    public Set<Driver> getDrivers() {
        return drivers;
    }


    public List<AutoMechanic> getMechanics() {
        return mechanics;
    }

    public String getRequiredDriverLicenseCategory() {
        return requiredDriverLicenseCategory;
    }

    public void setRequiredDriverLicenseCategory(String requiredDriverLicenseCategory) {
        this.requiredDriverLicenseCategory = requiredDriverLicenseCategory;
    }

    public void setMechanics(List<AutoMechanic> mechanics) {
        this.mechanics = mechanics;
    }

    public final String getModel() {
        return model;
    }

     public double getEngineVolume() {
        return engineVolume;
    }

    public void setMoving(boolean moving) {
        isMoving = moving;
    }

    public boolean isMoving() {
        return true;
    }

    public abstract boolean runDiagnostics();

    public abstract void performMaintenance();

    public abstract void fixTheCar();

    public void setDrivers(Set<Driver> drivers) {
        this.drivers = drivers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transport transport = (Transport) o;
        return Double.compare(transport.engineVolume, engineVolume) == 0 && isMoving == transport.isMoving && Objects.equals(brand, transport.brand) && Objects.equals(model, transport.model) && Objects.equals(requiredDriverLicenseCategory, transport.requiredDriverLicenseCategory) && Objects.equals(mechanics, transport.mechanics) && Objects.equals(drivers, transport.drivers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, engineVolume, isMoving, requiredDriverLicenseCategory, mechanics, drivers);
    }

    @Override
    public String toString() {
        return "Transport{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineVolume=" + engineVolume +
                ", isMoving=" + isMoving +
                ", requiredDriverLicenseCategory='" + requiredDriverLicenseCategory + '\'' +
                ", mechanics=" + mechanics +
                ", drivers=" + drivers +
                '}';
    }
}


