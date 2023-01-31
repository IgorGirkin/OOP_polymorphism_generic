import java.sql.Driver;

public class Main {
    public static void printsSeparator() {
        System.out.println("=======================================================================================");
    }

    public static void printCarSpecification(Car car) {


        System.out.println("Марка автомобиля: " + car.getBrand() + ". Модель: " + car.getModel() +
                ". Объем двигателя: " + car.getEngineVolume() + " "+ car.isMoving());}
    public static void printBusSpecification(Bus bus) {


        System.out.println("Марка автобуса: " + bus.getBrand() + ". Модель: " + bus.getModel() +
                ". Объем двигателя: " + bus.getEngineVolume() +" "+  bus.isMoving());}
     public static void printTrucksSpecification(Trucks trucks) {


        System.out.println("Марка автобуса: " + trucks.getBrand() + ". Модель: " + trucks.getModel() +
                ". Объем двигателя: " + trucks.getEngineVolume() +" "+ trucks.isMoving());}

    public static void printDriverB(DriverCategoryB driver, Car car) {
        System.out.println("Водитель " + driver.getFullName() + " управляет автомобилем " +
                car.getBrand() +" "+ car.getModel()+ " и будет участвовать в заезде!");
    }
    public static void printDriverC(DriverCategoryC driver, Trucks trucks) {
        System.out.println("Водитель " + driver.getFullName() + " управляет грузовиком " +
                trucks.getBrand() +" "+ trucks.getModel()+" и будет участвовать в заезде!");
    }
    public static void printDriverD(DriverCategoryD driver, Bus bus) {
        System.out.println("Водитель " + driver.getFullName() + " управляет автобусом " +
                bus.getBrand() +" "+ bus.getModel()+" и будет участвовать в заезде!");
    }


        public static void main (String[]args){
        Car ladaGranta = new Car("Lada", "Granta", 1.7, true);
        Car audi = new Car("Audi", "A8 50 L TDI quattro", 3.0, false);
        Car bmw = new Car("BMW", "Z8", 2.4, true,20,110.694,
                250);
        Car hyundai = new Car("Hyundai", "Avante", 0, false);

        Bus pazik = new Bus("ПАЗ","ПАЗ-672",4.535,true);
        Bus rafik = new Bus("РАФ", "RAF-2203", 1.75,false);
        Bus liaz = new Bus("ЛиАЗ","ЛиАЗ-677",8.363,false);
        Bus kravzik = new Bus("КАвЗ", "КАвЗ-685", 4.3, false);

        Trucks gazik = new Trucks("ГАЗ", "ГАЗ-53", 4.3, false);
        Trucks zil = new Trucks("ЗИЛ","ЗиЛ-130",6.0,true);
        Trucks belaz = new Trucks("БелАЗ","БелАЗ-7521",166.0,true);
        Trucks kamaz = new Trucks("КамАЗ","КамАЗ-5511",10.85,false);

        DriverCategoryB jamshut = new DriverCategoryB("Джамшут", true, 25);
        DriverCategoryD petrovich = new DriverCategoryD("Петрович", true, 30);
            DriverCategoryC aslambeck = new DriverCategoryC("Асламбек Эббекуев", true,
                    10);

            printCarSpecification(ladaGranta);
        printsSeparator();
        printBusSpecification(kravzik);
        printsSeparator();
        printTrucksSpecification(belaz);
        printsSeparator();
        belaz.maxSpeed();
        printsSeparator();
        ladaGranta.startMovement();
            printsSeparator();
       bmw.maxSpeed();
            printsSeparator();
       audi.bestLapTime();
            printsSeparator();
       hyundai.pitStop();
            printsSeparator();
       ladaGranta.startMovement();
            printsSeparator();
       ladaGranta.stopMovement();
            printsSeparator();
       kravzik.startMovement();
            printsSeparator();
       kravzik.stopMovement();
            printsSeparator();
       bmw.startMovement();
       printsSeparator();
       jamshut.startMovement(audi);
       printsSeparator();
       printDriverB(jamshut,bmw);
       printsSeparator();
       printDriverC(aslambeck,gazik);
       printsSeparator();
       printDriverD(petrovich,liaz);
       printsSeparator();
       petrovich.stopMovement(rafik);
       petrovich.refuel();
       petrovich.startMovement(rafik);
       printDriverD(petrovich,rafik);





        }
    }