public class DriverLicenseException extends Exception {
    public DriverLicenseException() {
        super("Необходимо казать тип прав!");
    }

    public DriverLicenseException(String message) {
        super(message);
    }
}
