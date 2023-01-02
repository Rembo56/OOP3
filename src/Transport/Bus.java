package Transport;
public class Bus extends Transport {
    public Bus(String colour, int speed) {
        super(colour, speed);
    }
    @Override
    public String toString() {
        return  "Марка машины " + BRAND + "\n"
                + "Модель " + MODEL + "\n"
                + "Страна производитель " + PROD_COUNTRY + "\n"
                + "Год выпуска " + PROD_YEAR + "\n"
                + "Цвет " + colour + "\n"
                + "Скорость " + speed + "\n";
    }
}