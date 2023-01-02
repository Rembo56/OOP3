import Transport.Bus;
import Transport.Car;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {

        Bus bus1 = new Bus("Black",15);
        System.out.println(bus1.toString());

        Bus bus2 = new Bus("Red", 45);
        System.out.println(bus2.toString());

        Bus bus3 = new Bus("Orange", 32);
        System.out.println(bus3.toString());

        Car car1 = new Car("Audi","A6","black",25, 1.8F,"",23,true);
        car1.getBrand();

        car1.setBRAND("BMW");
        System.out.println(car1.toString());

    }

}