import java.util.Objects;

public class Trucks <DriverCategoryC>extends Transport implements Competing {
    public enum LoadCapacity {
        N1(0.0f, 3.5f),
        N2(3.5f, 12.0f),
        N3(12.0f, 0);
        private final float lowerBound;
        private final float upperBound;

        LoadCapacity(float lowerBound, float upperBound) {
            this.lowerBound = lowerBound;
            this.upperBound = upperBound;
        }

        public float getLowerBound() {
            return lowerBound;
        }

        public float getUpperBound() {
            return upperBound;
        }

        @Override
        public String toString() {
            if (upperBound == 0) {
                return "Грузоподъемность с полной массой свыше: " + lowerBound + " тонн." ;
            } else {
                return "Грузопоъемность: от " + lowerBound + " тонн, до " + upperBound + " тонн." ;

            }
        }
    }
    private double pitStopTime;
    private double bestLapTime;
    private double maxSpeed;
    private LoadCapacity loadCapacity;
    public Trucks(String brand, String model, double engineVolume, boolean isMoving) {
        this(brand, model, engineVolume, true, 30.0, 120.0, 80.0,
                "Данных по транспортному средству недостаточно.");
    }

    public Trucks(String brand, String model, double engineVolume, boolean isMoving,
                  double pitStopTime, double bestLapTime, double maxSpeed, String type) {
        super(brand, model, engineVolume, isMoving, type);
        this.pitStopTime = pitStopTime;
        this.bestLapTime = bestLapTime;
        this.maxSpeed = maxSpeed;
    }
    @Override
    public void startMovement() {
        if (!this.isMoving()) {
            System.out.println(getBrand() + " " + getModel() + "- начал движение");

        } else {
            System.out.println(getBrand() + " " + getModel() + " уже в движении");
        }
    }
    @Override
    public void stopMovement() {
        if (this.isMoving()) {
            System.out.println(getBrand() + " " +getModel()+" - закончил движение");
        } else {
            System.out.println(getBrand() + " " + getModel() + " стоит.");
        }

    }

    @Override
    public void printType() {
        System.out.println("Типу грузоподъемности: "+loadCapacity.toString());

    }

    @Override
    public void pitStop() {
        System.out.println(getBrand()+ " "+ getModel()+" делает пит стоп за - "+ pitStopTime +" секунд.");

    }

    @Override
    public void bestLapTime() {
        System.out.println(getBrand()+ " "+ getModel()+ " лучшее время круга "+bestLapTime+ " минут.");

    }

    @Override
    public void maxSpeed() {
        System.out.println(getBrand()+ " "+ getModel()+ " максимальная скорость -" + maxSpeed +" км/час.");

    }

    public double getPitStopTime() {
        return pitStopTime;
    }

    public void setPitStopTime(double pitStopTime) {
        this.pitStopTime = pitStopTime;
    }

    public double getBestLapTime() {
        return bestLapTime;
    }

    public void setBestLapTime(double bestLapTime) {
        this.bestLapTime = bestLapTime;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public LoadCapacity getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(LoadCapacity loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Trucks trucks = (Trucks) o;
        return Double.compare(trucks.pitStopTime, pitStopTime) == 0 && Double.compare(trucks.bestLapTime, bestLapTime) == 0 && Double.compare(trucks.maxSpeed, maxSpeed) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), pitStopTime, bestLapTime, maxSpeed);
    }

    @Override
    public String toString() {
        return "Trucks{" +
                "pitStopTime=" + pitStopTime +
                ", bestLapTime=" + bestLapTime +
                ", maxSpeed=" + maxSpeed +
                '}';
    }
}
