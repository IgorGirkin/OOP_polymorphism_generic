public class DriverCategoryC extends Driver<Trucks>{
    public DriverCategoryC(String fullName, boolean hasDriverLicense, int experience) {
        super(fullName, hasDriverLicense, experience);
    }

    @Override
    public void startMovement(Trucks transport) {
        System.out.println("Водитель " + getFullName() +", управляющий грузовиком: " +
                transport.getBrand()+" "+transport.getModel()+  ", начал движение!");

    }

    @Override
    public void stopMovement(Trucks transport) {
        System.out.println("Водитель " + getFullName() +", управляющий грузовиком: " +
                transport.getBrand()+" "+transport.getModel()+  ", остановился.");

    }



    @Override
    public void refuel() {
           System.out.println("Водитель " + getFullName() +" заправил грузовик.");

    }
}
