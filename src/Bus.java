import java.util.Objects;

import java.util.List;
public class Bus<T extends Driver> extends Transport implements Competing {

    private double pitStopTime;
    private double bestLapTime;
    private double maxSpeed;
    private BusCapacity busCapacity;
    private T driver;
    public Bus(String brand, String model, double engineVolume, boolean isMoving,
               BusCapacity busCapacity) {
        this(brand, model, engineVolume, true, 30.0, 120.0,
                80.0, busCapacity);
    }

    public Bus(String brand, String model, double engineVolume, boolean isMoving,
               double pitStopTime, double bestLapTime, double maxSpeed, BusCapacity busCapacity) {
        super(brand, model, engineVolume, isMoving);
        this.pitStopTime = pitStopTime;
        this.bestLapTime = bestLapTime;
        this.maxSpeed = maxSpeed;
        this.busCapacity = busCapacity;
        this.driver = driver;
    }

    public String getRequiredDriverLicenseCategory() {
        if (driver instanceof DriverCategoryB) {
            return "B";
        } else if (driver instanceof DriverCategoryC) {
            return "C";
        } else if (driver instanceof DriverCategoryD) {
            return "D";
        } else {
            return null;
        }
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
                if (busCapacity== null) {
            System.out.println("Данных по транспортному средству недостаточно");
        } else
        System.out.println("Автобус "+ getModel()+". "+ busCapacity.toString());


    }

    @Override
    public boolean runDiagnostics() { // диагностику проходить не могут
        throw new UnsupportedOperationException("«Автобусы» диагностику проходить не могут");
    }

    @Override
    public void performMaintenance() {
        System.out.println("Механик " + getMechanics() + " проводит техническое обслуживание " +
                getBrand() + " " + getModel());
    }

    @Override
    public void fixTheCar() {
        System.out.println("Механик " + getMechanics() + " ремонтирует " + getBrand() +
                " " + getModel());

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


}
