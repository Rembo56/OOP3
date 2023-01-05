package Transport;
public class Bus extends Transport {
    public Bus(String brand, String model, String prodCountry, int prodYear, int speed, String colour) {
        super(brand, model, prodCountry, prodYear, speed, colour);
    }
    @Override
    public String toString() {
        return
                "Марка машины " + getBrand() + "\n"
                        + "Модель " + getModel() + "\n"
                        + "Страна производитель " + getProdCountry() + "\n"
                        + "Год выпуска " + getProdYear() + "\n"
                        + "Цвет " + getColour() + "\n"
                        + "Скорость " + getSpeed() + "\n";
    }
}