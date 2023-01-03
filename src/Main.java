import Transport.Bus;
import Transport.Car;

public class Main {

    public static void main(String[] args) {

       Bus bus1 = new Bus("Volvo","XC60","Russia",2021,850,"White");
        System.out.println(bus1.toString());


        Car car1 = new Car("Audi","A6","Germany",2000,60,"Black",1.8F,"","Sedan",23,6,true,8);
        car1.getBrand();

        car1.setBrand("BMW");
        System.out.println(car1.toString());

    }

}