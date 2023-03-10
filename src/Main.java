import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class Main {
    public static void service(Transport... transports) {
        for (Transport transport : transports) {
            try {
                transport.runDiagnostics();
            } catch (UnsupportedOperationException e) {
                System.out.println("Произошла ошибка");
                System.out.println(e.getMessage());
            }
        }
    }
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

            DriverCategoryB grisha = new DriverCategoryB("Гриша Петренко", true, 8,
                    "B");
            DriverCategoryB kuzmich = new DriverCategoryB("Кузмич", true, 40,
                    "В");
            DriverCategoryB zeniya= new DriverCategoryB("Евгений Петрович", true, 12,
                    "B");
            DriverCategoryB baboyan = new DriverCategoryB("Артур Бабаян", true, 7,
                    "B");
            DriverCategoryC jamshut = new DriverCategoryC("Джамшут", true, 25,
                    "C");
            DriverCategoryC slava = new DriverCategoryC("Вячеслав Поварницин",true,33,
                    "C");
            DriverCategoryC dimaPirog = new DriverCategoryC("Дмитрий Пирог",true,20,
                    "C");
            DriverCategoryC aslambeck = new DriverCategoryC("Асламбек Эббекуев", true,
                    10, "C");
            DriverCategoryD misha=new DriverCategoryD("Михаил Мелентьев",true,20,
                    "D");
            DriverCategoryD sasha = new DriverCategoryD("Александр Изотов",true,40,
                    "D");
            DriverCategoryD petrovich = new DriverCategoryD("Петрович", true, 30,
                    "D");
            DriverCategoryD varkiz=new DriverCategoryD("Варкиз Саркисян",true,18,
                    "D");




            AutoMechanic<Transport> sergeiy = new AutoMechanic("Сергей Запаренко", "ФК Грандкапитал");
            AutoMechanic<Transport> dima = new AutoMechanic("Дмитрий Варакин", "АвтоДоктор");
            AutoMechanic<Transport> aleyosha = new AutoMechanic("Алексей Иванович", "Автосвет");




        Car<DriverCategoryB> ladaGranta = new Car<>("Lada", "Granta", 1.7,true,
                CarBody.HATCHBACK);
        Car<DriverCategoryB> audi = new Car<>("Audi", "A8 50 L TDI quattro", 3.0,
                false,CarBody.HATCHBACK);
        Car<DriverCategoryB> bmw = new Car<>("BMW", "Z8", 2.4, true,
                20,110.694,
                250, CarBody.SEDAN);
        Car<DriverCategoryB> hyundai = new Car<>("Hyundai", "Avante", 1.6, false,
                96, 140, 260, CarBody.CROSSOVER);


        Bus <DriverCategoryD>pazik = new Bus<>("ПАЗ","ПАЗ-672",4.535,true,
                60.0,250.0,120.26,
                BusCapacity.SMALL);
        Bus<DriverCategoryD> rafik = new Bus<>("РАФ", "RAF-2203", 1.75,false,
                BusCapacity.ESPECIALLY_SMALL);
        Bus <DriverCategoryD>liaz = new Bus<>("ЛиАЗ","ЛиАЗ-677",8.363,false,
                BusCapacity.SMALL);
        Bus <DriverCategoryD>kravzik = new Bus<>("КАвЗ", "КАвЗ-685", 4.3, false,
                BusCapacity.SMALL);

        Trucks <DriverCategoryC> gazik = new Trucks<>("ГАЗ", "ГАЗ-53", 4.3,
                false,
                60.0,24.25,111.36,TruckLoadCapacity.N2);
        Trucks <DriverCategoryC> zil = new Trucks<>("ЗИЛ","ЗиЛ-130",6.0,
                true, TruckLoadCapacity.N2);
        Trucks <DriverCategoryC> belaz = new Trucks<>("БелАЗ","БелАЗ-7521",166.0,
                true, TruckLoadCapacity.N3);
        Trucks <DriverCategoryC> kamaz = new Trucks<>("КамАЗ","КамАЗ-5511",10.85,
                false, 23,180,200,TruckLoadCapacity.N1);


        ladaGranta.addMechanic(aleyosha);
        bmw.addMechanic(sergeiy);
        audi.addMechanic(dima);
        hyundai.addMechanic(aleyosha);

        pazik.addMechanic(dima);
        rafik.addMechanic(sergeiy);
        liaz.addMechanic(aleyosha);
        kravzik.addMechanic(sergeiy);

        gazik.addMechanic(dima);
        zil.addMechanic(aleyosha);
        belaz.addMechanic(dima);
        kamaz.addMechanic(sergeiy);

            List<Transport> transports = List.of(ladaGranta, bmw, audi,hyundai,pazik,rafik,liaz,kravzik,
                    zil,belaz,kamaz,gazik);



            ladaGranta.addDriver(grisha);
            bmw.addDriver(kuzmich);
            audi.addDriver(zeniya);
            hyundai.addDriver(baboyan);

            pazik.addDriver(misha);
            rafik.addDriver(sasha);
            liaz.addDriver(petrovich);
            kravzik.addDriver(varkiz);

            zil.addDriver(jamshut);
            kamaz.addDriver(slava);
            belaz.addDriver(dimaPirog);
            gazik.addDriver(aslambeck);
            printsSeparator();

            //по заданию эти водители в случае добавления
            // в консоль выводиться не должны
            liaz.addDriver(petrovich);
            bmw.addDriver(kuzmich);
            belaz.addDriver(dimaPirog);
            liaz.addDriver(petrovich);
            gazik.addDriver(aslambeck);



            printsSeparator();

//            for (Driver driver : transport.) {
//    System.out.println(driver.getFullName());
//}



            ServiceStation serviceStation = new ServiceStation();
            serviceStation.addCar(ladaGranta);
            serviceStation.addCar(bmw);
            serviceStation.addCar(audi);
            serviceStation.addCar(hyundai);

            serviceStation.addTrucks(gazik);
            serviceStation.addTrucks(zil);
            serviceStation.addTrucks(belaz);
            serviceStation.addTrucks(kamaz);

            serviceStation.runDiagnostics();
            printsSeparator();

   for (Transport transport : transports) {
       printInfo(transport);
   }
            ArrayList<String> driver = new ArrayList<>();
            driver.add("Гриша Петренко");
            driver.add("Кузмич");
            driver.add("Евгений Петрович");

}
    private static void printInfo(Transport transport) {
        System.out.println("Информация по транспортному средству " + transport.getBrand()+" "+ transport.getModel());
        System.out.println("Водители: "+transport.getDrivers());
        System.out.println("Механики: "+transport.getMechanics());
            System.out.println();
    }

//    private static void runDiagnostics(Transport... transports) {
//        for (Transport transport : transports) {
//            runDiagnosticsTransport(transport);
//        }
//    }
//
//    private static void runDiagnosticsTransport(Transport transport) {
//        try {
//            if (!transport.runDiagnostics()) {
//                throw new RuntimeException("Fdnjvj,bkm");
//            }
//        } catch (RuntimeException e) {
//            System.out.println(e.getMessage());
//        }
//
//    }


//       printCarSpecification(ladaGranta);
//        printsSeparator();
//        printBusSpecification(kravzik);
//        printsSeparator();
//        printTrucksSpecification(belaz);
//        printsSeparator();
//        belaz.maxSpeed();
//        printsSeparator();
//        ladaGranta.startMovement();
//            printsSeparator();
//       bmw.maxSpeed();
//            printsSeparator();
//       audi.bestLapTime();
//            printsSeparator();
//       hyundai.pitStop();
//            printsSeparator();
//       ladaGranta.startMovement();
//            printsSeparator();
//       ladaGranta.stopMovement();
//            printsSeparator();
//       kravzik.startMovement();
//            printsSeparator();
//       kravzik.stopMovement();
//            printsSeparator();
//       bmw.startMovement();
//       printsSeparator();
//       jamshut.startMovement(bmw);
//       printsSeparator();
//       printDriverB(grisha,bmw);
//       printsSeparator();
//       printDriverC(aslambeck,gazik);
//       printsSeparator();
//       printDriverD(petrovich,liaz);
//       printsSeparator();
//       petrovich.stopMovement(rafik);
//       petrovich.refuel();
//       petrovich.startMovement(rafik);
//       printDriverD(petrovich,rafik);
//       printsSeparator();
//       printCarSpecification(hyundai);
//       printCarSpecification(audi);
//       printBusSpecification(pazik);
//       printsSeparator();
//       printsSeparator();
//       printBusSpecification(pazik);
//       printBusSpecification(rafik);
//       printsSeparator();
//       printTrucksSpecification(gazik);
//       printTrucksSpecification(kamaz);
//       printsSeparator();
//       ladaGranta.printType();
//       printsSeparator();
//       belaz.printType();
//       printsSeparator();
//       kamaz.printType();
//       printsSeparator();
//            rafik.printType();
//       printsSeparator();
//       baboyan.startMovement(bmw);
//       baboyan.startMovement(zil);
//       baboyan.startMovement(liaz);
//       printsSeparator();
//       jamshut.startMovement(kamaz);
//       jamshut.startMovement(kravzik);
//       jamshut.startMovement(belaz);
//       printsSeparator();
//       aslambeck.startMovement(kravzik);
//       aslambeck.startMovement(belaz);
//       aslambeck.startMovement(kamaz);
//       printsSeparator();
//        runDiagnostics(ladaGranta,rafik,belaz);





}