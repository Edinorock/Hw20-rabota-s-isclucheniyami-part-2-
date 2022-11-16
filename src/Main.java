import Transport.*;
import Driver.*;

public class Main {

    private static void diagnostic(Transport... transports) {
        for (Transport transport : transports) {
            diagnosticTransport(transport);
        }
    }



    public static void diagnosticTransport(Transport transport) {
        try {
            if (!transport.diagnostic()) {
                throw new RuntimeException("Автомобиль " + transport.getModel() + " " + transport.getBrand() + " не проходит диагностику");
            }
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());

        }
    }

    public static void printInfoCar (Car car)
    {
        System.out.println("Информация об автомобиле: " +
                " марка - " + car.getBrand() +
                ", модель - " + car.getModel() +
                ", мощность двигателя - " + car.getEngineVolume() +
                ", тип кузова - " + car.getBodyType());
    }

    public static void main (String[]args) {

        Car kia = new Car("Kia", "Ria", 1.6, BodyType.HATCHBACK);
        Car honda = new Car("Honda", "CR-V", 2.0, BodyType.CROSSOVER);
        Car hyundai = new Car("Hyundai", "Creta", 1.8, BodyType.SEDAN);
        Car toyota = new Car("Toyota", "Camry", 3.0, BodyType.HATCHBACK);

        Truck pazik = new Truck("Паз", "Вектор", 3.7, Weight.N_3);
        Truck kavz = new Truck("КАВЗ", "4239", 2.5, Weight.N_1);
        Truck gaz = new Truck("ГАЗ", "3308 Садко", 2.5, Weight.N_2);
        Truck gazon = new Truck("ГАЗон", "Next", 3.7, Weight.N_1);

        Bus volgabus = new Bus("Volgabus", "Дельта 12", 1.7, Capacity.N3);
        Bus zonda = new Bus("Zonda", "YCK6116HGL3", 2.5, Capacity.N1);
        Bus daewoo = new Bus("Daewoo", "BC212MA", 3, Capacity.N1);
        Bus gazelle = new Bus("Газель", "Next A63R42", 2, Capacity.N2);

        diagnostic(kia, honda, hyundai, toyota,
                pazik, kavz, gaz, gazon,
                volgabus, zonda, daewoo, gazelle);

        System.out.println();
        System.out.println(honda);
        System.out.println(pazik);
        System.out.println(volgabus);

        System.out.println();
        daewoo.getMaxSpeed();
        gazon.getBestLapTime();
        kia.pitStop();
        System.out.println();

        System.out.println();

        DriverB roger = new DriverB("Валерий Меладзе", true, 5);
        roger.start(kia);

        DriverC peter = new DriverC("Леонтьев Валерий Яковлевич", true, 7);
        peter.start(pazik);

        DriverD lexie = new DriverD("Алла Борисовна Пугачёва", true, 1);
        lexie.start(volgabus);


        System.out.println();
        roger.start(hyundai);
        roger.stop(hyundai);
        roger.refill(hyundai);


        System.out.println();
        peter.start(kavz);
        peter.stop(kavz);
        peter.refill(kavz);

        System.out.println();
        lexie.start(zonda);
        lexie.stop(zonda);
        lexie.refill(zonda);
    }
}
