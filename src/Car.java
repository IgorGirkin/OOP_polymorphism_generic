import java.util.Objects;

import static java.sql.DriverManager.getDriver;

public class Car<DriverCategoryB> extends Transport implements Competing {

    private double pitStopTime;
    private double bestLapTime;
    private double maxSpeed;
    private final CarBody carBody;

    public Car(String brand, String model, double engineVolume, boolean isMoving, CarBody carBody) {
        this(brand, model, engineVolume, true, 30.0, 120.0, 80.0,
                CarBody.SEDAN);
    }

    public Car(String brand, String model, double engineVolume, boolean isMoving,
               double pitStopTime, double bestLapTime, double maxSpeed,CarBody carBody) {
        super(brand, model, engineVolume, isMoving);
        this.pitStopTime = pitStopTime;
        this.bestLapTime = bestLapTime;
        this.maxSpeed = maxSpeed;
        this.carBody = carBody;
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
    public void printType() {
        if (carBody == null) {
            System.out.println("Данных по транспортному средству недостаточно");
        } else
        System.out.println("Автомобиль: "+ getBrand()+" "+getModel()+". "+ carBody.toString());

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

    public CarBody getCarBody() {
        return carBody;
    }



}
