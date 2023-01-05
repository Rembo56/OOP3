package Transport;
public class Car extends Transport {
    public class Key {
        private final String remoutLounch;
        private final String keyLess;

        private Key (String remoutLounch, String keyLess){
            if (remoutLounch.isEmpty() || remoutLounch.equals(null)) {
                this.remoutLounch = "Default";
            } else {
                this.remoutLounch = remoutLounch;
            }
            if (keyLess.isEmpty() || keyLess.equals(null)) {
                this.keyLess = "Default";
            } else {
                this.keyLess = keyLess;
            }
        }
    }

    private float engineVolume;
    private String transmission;
    private String typeBody;
    private int registerNumber;
    private int placeCount;
    private boolean typeTire;
    private int mounth;

    public void printTires() {
        System.out.println(typeTire);}

    public String getTypeBodyCar() {
        return typeBody;
    }

    public final int getNumberPlace() {
        return placeCount;
    }

    public Car(String brand, String model, String prodCountry, int prodYear, int speed, String colour, float engineVolume, String transmission, String typeBody, int registerNumber, int placeCount, boolean typeTire, int mounth) {
        super(brand, model, prodCountry, prodYear, speed, colour);
        this.engineVolume = engineVolume;
        this.transmission = transmission;
        this.typeBody = typeBody;
        this.registerNumber = registerNumber;
        this.placeCount = placeCount;
        this.typeTire = typeTire;
        this.mounth = mounth;

        if (transmission==null || transmission.isEmpty()) {
            this.transmission = "Default";
        } else {
            this.transmission = transmission;
        }
        //this.model=model;
       // this.brand=brand;
        if (registerNumber>0) {
            this.registerNumber = registerNumber;
        } else {
            this.registerNumber = 1;
        }
        if (engineVolume > 0) {
            this.engineVolume = engineVolume;
        } else {
            this.engineVolume = 1.6F;
        }
    }

    public void seasonTyre(int mounth) {
        if (mounth > 12 || mounth <=0)
        {
            System.out.println("Некорректные данные");
        }
        else
        {
            if (mounth > 4 && mounth < 10) {
                this.typeTire = true;
                System.out.println(this.typeTire);
            } else {
                this.typeTire = false;
                System.out.println(this.typeTire);
            }
        }
    }

   @Override
    public String toString() {
        return
                "Марка машины " + getBrand() + "\n"
                        + "Модель " + getModel() + "\n"
                        + "Страна производитель " + getProdCountry() + "\n"
                        + "Год выпуска " + getProdYear() + "\n"
                        + "Цвет " + getColour() + "\n"
                        + "Объем двигетеля " + engineVolume + "\n"
                        + "Коробка передач " + transmission + "\n"
                        + "Тип кузова " + typeBody + "\n"
                        + "Регистрационный номер " + registerNumber + "\n"
                        + "Количество мест " + placeCount + "\n"
                        + "Коробка передач " + transmission + "\n"
                        + "Скорость " + getSpeed() + "\n";
    }
}


