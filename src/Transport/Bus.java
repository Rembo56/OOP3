package Transport;
public class Bus extends Transport {
    public Bus(String brand, String model, String prodCountry, int prodYear, int speed, String colour) {
        super(brand, model, prodCountry, prodYear, speed, colour);
    }

    @Override
    public String toString() {
        return  "Марка машины " + brand + "\n"
                + "Модель " + model + "\n"
                + "Страна производитель " + prodCountry + "\n"
                + "Год выпуска " + prodYear + "\n"
                + "Цвет " + colour + "\n"
                + "Скорость " + speed + "\n";
    }
}