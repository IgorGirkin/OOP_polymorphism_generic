
public abstract class Driver <T extends Transport> {
    private final String fullName;
    private boolean hasDriverLicense;
    private int experience;

    public Driver(String fullName, boolean hasDriverLicense, int experience) {
        this.fullName = fullName;
        this.hasDriverLicense = hasDriverLicense;
        this.experience = experience;
    }

    public abstract void startMovement(T transport);
    public abstract void stopMovement(T transport);
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
}