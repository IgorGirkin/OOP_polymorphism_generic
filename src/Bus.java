import java.util.Objects;

public class Bus<DriverCategoryD> extends Transport implements Competing {
    public enum BusCapacity {
        ESPECIALLY_SMALL(0,10),
        SMALL(0,25),
        AVERAGE(40,50),
        LARGE(60,80),
        ESPECIALLY_LARGE(100,120);

        private final Integer lowerLimitsOfCapacity;
        private final Integer upperLimitsOfCapacity;

        BusCapacity(Integer lowerLimitsOfCapacity, Integer upperLimitsOfCapacity) {
            this.lowerLimitsOfCapacity = lowerLimitsOfCapacity;
            this.upperLimitsOfCapacity = upperLimitsOfCapacity;
        }

        public Integer getLowerLimitsOfCapacity() {
            return lowerLimitsOfCapacity;
        }

        public Integer getUpperLimitsOfCapacity() {
            return upperLimitsOfCapacity;
        }

        @Override
        public String toString() {
            if (lowerLimitsOfCapacity == 0 && upperLimitsOfCapacity <= 10) {
                return "Вместимость до " + upperLimitsOfCapacity + " мест." ;
            }
            if (lowerLimitsOfCapacity == 0 && upperLimitsOfCapacity <= 25) {
                return "Вместимость до " + upperLimitsOfCapacity + " мест.";
            } else {
                return "Вместимость: " + lowerLimitsOfCapacity + " - " + upperLimitsOfCapacity +" мест.";
            }
        }
    }


    private double pitStopTime;
    private double bestLapTime;
    private double maxSpeed;
    private BusCapacity busCapacity;
    public Bus(String brand, String model, double engineVolume, boolean isMoving) {
        this(brand, model, engineVolume, true, 30.0, 120.0, 80.0,
                "Данных по транспортному средству недостаточно");
    }

    public Bus(String brand, String model, double engineVolume, boolean isMoving,
               double pitStopTime, double bestLapTime, double maxSpeed, String type) {
        super(brand, model, engineVolume, isMoving, type);
        this.pitStopTime = pitStopTime;
        this.bestLapTime = bestLapTime;
        this.maxSpeed = maxSpeed;
    }

     @Override
    public void startMovement() {
        if (!this.isMoving()) {
            System.out.println(getBrand() + " "+ getModel() + "- начал движение");
        } else {
            System.out.println(getBrand() + " " + getModel() + " уже в движении");
        }
    }
    @Override
    public void stopMovement() {
        if (this.isMoving()) {
            System.out.println("Автобус: " + getModel() + " - закончил движение.");
        } else {
            System.out.println(getBrand() + " " + getModel() + " стоит.");
        }
    }

    @Override
    public void printType() {
        System.out.println("Тип вместимости: "+ busCapacity.toString());

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

    public BusCapacity getBusCapacity() {
        return busCapacity;
    }

    public void setBusCapacity(BusCapacity busCapacity) {
        this.busCapacity = busCapacity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Bus bus = (Bus) o;
        return Double.compare(bus.pitStopTime, pitStopTime) == 0 && Double.compare(bus.bestLapTime, bestLapTime) == 0 && Double.compare(bus.maxSpeed, maxSpeed) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), pitStopTime, bestLapTime, maxSpeed);
    }

    @Override
    public String toString() {
        return "Bus{" +
                "pitStopTime=" + pitStopTime +
                ", bestLapTime=" + bestLapTime +
                ", maxSpeed=" + maxSpeed +
                '}';
    }
}
