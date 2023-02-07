import java.util.Objects;

public abstract class Transport {
    private final String brand;
    private final String model;
    private final double engineVolume;
    private boolean isMoving;

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
    }
        public final String getBrand() {
        return brand;
    }


//   public void setIsMoving ( boolean isMoving){
//            this.isMoving = isMoving;
//        }

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
        return isMoving;
    }

    public abstract void startMovement();

    public abstract void stopMovement();

    public abstract void printType();




    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transport transport = (Transport) o;
        return Double.compare(transport.engineVolume, engineVolume) == 0 && isMoving == transport.isMoving && Objects.equals(brand, transport.brand) && Objects.equals(model, transport.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, engineVolume, isMoving);
    }

    @Override
    public String toString() {
        return "Transport{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineVolume=" + engineVolume +
                ", isMoving=" + isMoving +
                '}';
    }
}


