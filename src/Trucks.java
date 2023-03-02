import java.util.List;
import java.util.Objects;

public class Trucks <T extends Driver>extends Transport implements Competing {
    private double pitStopTime;
    private double bestLapTime;
    private double maxSpeed;
    private final TruckLoadCapacity truckLoadCapacity;
    private T driver;

    public Trucks(String brand, String model, double engineVolume, boolean isMoving,
                  TruckLoadCapacity truckLoadCapacity) {
        this(brand, model, engineVolume, true,30.0, 120.0,
                80.0, truckLoadCapacity);
    }

    public Trucks(String brand, String model, double engineVolume, boolean isMoving,
                  double pitStopTime, double bestLapTime, double maxSpeed, TruckLoadCapacity truckLoadCapacity) {
        super(brand, model, engineVolume, isMoving);
        this.pitStopTime = pitStopTime;
        this.bestLapTime = bestLapTime;
        this.maxSpeed = maxSpeed;
        this.truckLoadCapacity = truckLoadCapacity;
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
                        if (truckLoadCapacity== null) {
            System.out.println("Данных по транспортному средству недостаточно");
        } else
        System.out.println("Грузовой автомобиль "+getModel()+". "+ truckLoadCapacity.toString());


    }


//    @Override
//    public void runDiagnostics() {
//
//    }
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

    @Override
    public boolean runDiagnostics() {
        return Math.random()>0.8;

    }
    @Override
    public void performMaintenance() {
        System.out.println("Механик " + getMechanics() + " проводит техническое обслуживание грузового автомобиля" +
               getBrand() + " " + getModel());
    }

    @Override
    public void fixTheCar() {
        System.out.println("Механик " + getMechanics() + " ремонтирует " + getBrand() +
                " " + getModel());
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

    public TruckLoadCapacity getTruckLoadCapacity() {
        return truckLoadCapacity;
    }

}
