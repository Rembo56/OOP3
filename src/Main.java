import Transport.Bus;
import Transport.Car;

public class Main {

    public static void main(String[] args) {

        Car car1 = new Car("Yellow", 1,  1.6F, "auto", 56, true);
        car1.info();

        Bus bus1 = new Bus("Black",15);
        bus1.info();

        Bus bus2 = new Bus("Red", 45);
        bus2.info();

        Bus bus3 = new Bus("Orange", 32);
        bus3.info();
    }

}