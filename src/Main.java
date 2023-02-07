import java.sql.Driver;

public class Main {
    public static void printsSeparator() {
        System.out.println("=======================================================================================");
    }

    public static void printCarSpecification(Car car) {


        System.out.println("Марка автомобиля: " + car.getBrand() + " модель: " + car.getModel() +
                " объем двигателя: " + car.getEngineVolume() + " "+ car.isMoving()+ " максимальная скорость -"+
                car.getMaxSpeed()+ " Км/час.,"+" тип кузова: "+CarBody.SEDAN);}
    public static void printBusSpecification(Bus bus) {


        System.out.println("Марка автобуса: " + bus.getBrand() + ". Модель: " + bus.getModel() +
                ". Объем двигателя: " + bus.getEngineVolume() +" "+  bus.isMoving()+ " максимальная скорость -"+
                bus.getMaxSpeed()+" Км/час.."+" "+BusCapacity.SMALL);}
     public static void printTrucksSpecification(Trucks trucks) {


        System.out.println("Марка грузовика: " + trucks.getBrand() + ". Модель: " + trucks.getModel() +
                ". Объем двигателя: " + trucks.getEngineVolume() +" "+ trucks.isMoving()+" максимальная скорость -"+
                trucks.getMaxSpeed()+" Км/час.."+ " "+TruckLoadCapacity.N2);}

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
        Car<DriverCategoryB> ladaGranta = new Car<>("Lada", "Granta", 1.7,
                true,CarBody.SEDAN);
        Car<DriverCategoryB> audi = new Car<>("Audi", "A8 50 L TDI quattro", 3.0,
                false,CarBody.HATCHBACK);
        Car<DriverCategoryB> bmw = new Car<>("BMW", "Z8", 2.4, true,
                20,110.694,
                250, CarBody.SEDAN);
        Car<DriverCategoryB> hyundai = new Car<>("Hyundai", "Avante", 1.6,
                    false, 96, 140, 260, CarBody.CROSSOVER);

        Bus <DriverCategoryD>pazik = new Bus<>("ПАЗ","ПАЗ-672",4.535,true,
                60.0,250.0,120.26,BusCapacity.SMALL);
        Bus<DriverCategoryD> rafik = new Bus<>("РАФ", "RAF-2203", 1.75,false,
                BusCapacity.ESPECIALLY_SMALL);
        Bus <DriverCategoryD>liaz = new Bus<>("ЛиАЗ","ЛиАЗ-677",8.363,false,
                BusCapacity.SMALL);
        Bus <DriverCategoryD>kravzik = new Bus<>("КАвЗ", "КАвЗ-685", 4.3, false,
                BusCapacity.SMALL);

        Trucks <DriverCategoryC> gazik = new Trucks<>("ГАЗ", "ГАЗ-53", 4.3,
                false,60.0,24.25,111.36,TruckLoadCapacity.N2);
        Trucks <DriverCategoryC> zil = new Trucks<>("ЗИЛ","ЗиЛ-130",6.0,
                true, TruckLoadCapacity.N2);
        Trucks <DriverCategoryC> belaz = new Trucks<>("БелАЗ","БелАЗ-7521",166.0,true,
                TruckLoadCapacity.N3);
        Trucks <DriverCategoryC> kamaz = new Trucks<>("КамАЗ","КамАЗ-5511",10.85,
                false,23,180,200,TruckLoadCapacity.N1);

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
       printsSeparator();
       printCarSpecification(hyundai);
       printCarSpecification(audi);
       printBusSpecification(pazik);
       printsSeparator();
       printsSeparator();
       printBusSpecification(pazik);
       printBusSpecification(rafik);
       printsSeparator();
       printTrucksSpecification(gazik);
       printTrucksSpecification(kamaz);
       printsSeparator();
       ladaGranta.printType();
       printsSeparator();
       belaz.printType();
       printsSeparator();
       kamaz.printType();
       printsSeparator();
       rafik.printType();







        }
    }