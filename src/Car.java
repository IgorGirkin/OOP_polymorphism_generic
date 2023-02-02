import java.util.Objects;

import static java.sql.DriverManager.getDriver;

public class Car<DriverCategoryB> extends Transport implements Competing {
    private double pitStopTime;
    private double bestLapTime;
    private double maxSpeed;

    public Car(String brand, String model, double engineVolume, boolean isMoving) {
        this(brand, model, engineVolume, true, 30.0, 120.0, 80.0);
    }

    public Car(String brand, String model, double engineVolume, boolean isMoving,
               double pitStopTime, double bestLapTime, double maxSpeed) {
        super(brand, model, engineVolume, isMoving);
        this.pitStopTime = pitStopTime;
        this.bestLapTime = bestLapTime;
        this.maxSpeed = maxSpeed;
    }


    @Override
    public void startMovement() {
        if (!this.isMoving()) {
            System.out.println(getBrand() + " " + getModel() + " - начал движение");
        } else {
            System.out.println(getBrand() + " " + getModel() + " уже в движении");
        }
    }

    @Override
    public void stopMovement() {
        if (this.isMoving()) {
            System.out.println("Автомобиль: " + getBrand() + " " + getModel() + " - остановился");
        } else {
            System.out.println(getBrand() + " " + getModel() + " стоит.");
        }
    }

    @Override
    public void pitStop() {
        System.out.println( getBrand()+ " "+ getModel()+" делает пит стоп за - "+ pitStopTime +" секунд.");

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Car car = (Car) o;
        return Double.compare(car.pitStopTime, pitStopTime) == 0 && Double.compare(car.bestLapTime, bestLapTime) == 0 && Double.compare(car.maxSpeed, maxSpeed) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), pitStopTime, bestLapTime, maxSpeed);
    }

    @Override
    public String toString() {
        return "Car{" +
                "pitStopTime=" + pitStopTime +
                ", bestLapTime=" + bestLapTime +
                ", maxSpeed=" + maxSpeed +
                '}';
    }
}
