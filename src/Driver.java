import java.util.Objects;

public abstract class Driver {
    private final String fullName;
    private boolean hasDriverLicense;
    private int experience;

    public Driver(String fullName, boolean hasDriverLicense, int experience) {
        this.fullName = fullName;
        this.hasDriverLicense = hasDriverLicense;
        this.experience = experience;
    }

    public abstract void startMovement(Transport transport);
    public abstract void stopMovement(Transport transport);
    public abstract void refuel();


    public String getFullName() {
        return fullName;
    }

    public boolean isHasDriverLicense() {
        return hasDriverLicense;
    }

    public void setHasDriverLicense(boolean hasDriverLicense) {
        this.hasDriverLicense = hasDriverLicense;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Driver driver = (Driver) o;
        return hasDriverLicense == driver.hasDriverLicense && experience == driver.experience && Objects.equals(fullName, driver.fullName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName, hasDriverLicense, experience);
    }
}
