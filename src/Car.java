import java.util.Objects;

import static java.sql.DriverManager.getDriver;

public class Car<DriverCategoryB> extends Transport implements Competing {
    public enum CarBody{
        SEDAN("Седан"),
        HATCHBACK("Хетчбек"),
        COUPE("Купе"),
        STATION_WAGON("Универсал"),
        SUV("Внедорожник"),
        CROSSOVER("Кроссовер"),
        PICKUP_TRUCK("Пикап"),
        VAN("Фургон"),
        MINIVAN("Минивэн");

        private final String bodyTypeRU;

        CarBody(String bodyTypeRU) {
            this.bodyTypeRU = bodyTypeRU;
        }

        public String getBodyTypeRU() {
            return bodyTypeRU;
        }

        @Override
        public String toString() {
            return "Тип кузова: " + bodyTypeRU;
        }
    }
    private double pitStopTime;
    private double bestLapTime;
    private double maxSpeed;
    private CarBody carBody;

    public Car(String brand, String model, double engineVolume, boolean isMoving) {
        this(brand, model, engineVolume, true, 30.0, 120.0, 80.0,
                "Данных по транспортному средству недостаточно");
    }

    public Car(String brand, String model, double engineVolume, boolean isMoving,
               double pitStopTime, double bestLapTime, double maxSpeed, String type) {
        super(brand, model, engineVolume, isMoving, type);
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
    public void printType() {
        System.out.println("Тип транспортного средства: "+ carBody.toString());

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

    public void setCarBody(CarBody carBody) {
        this.carBody = carBody;
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
