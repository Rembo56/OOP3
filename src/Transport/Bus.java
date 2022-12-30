package Transport;
public class Bus extends Transport {
    public Bus(String colour, int speed) {
        super(colour, speed);
    }
    public void info () {
        System.out.println("Марка машины " + BRAND);
        System.out.println("Модель " + MODEL);
        System.out.println("Страна производитель " + PROD_COUNTRY);
        System.out.println("Год выпуска " + PROD_YEAR);
        System.out.println("Цвет " + colour);
        System.out.println("Скорость "+ speed);
        System.out.println();
    }
}
