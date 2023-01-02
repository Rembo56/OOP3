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

    public float engineVolume;
    public String transmission;
    public static final String TYPE_BODY="Sedan";
    public int registerNumber;
    public static final int PLACE_COUNT=5;
    public boolean typeTire;
    public int mounth;

    public String getBrand() {
        return BRAND;
    }
    public String getModel() {
        return MODEL;
    }
    public String getProductionCountry() {
        return PROD_COUNTRY;
    }
    public int getProductionYear() {
        return PROD_YEAR;
    }
    public void printTires() {
        System.out.println(typeTire);}
    public String getTypeBodyCar() {
        return TYPE_BODY;
    }
    public final int getNumberPlace() {
        return PLACE_COUNT;
    }
    public Car(String BRAND, String MODEL, String colour, int speed, float engineVolume, String transmission, int registerNumber, boolean typeTire) {
        super(colour, speed);
        if (transmission.isEmpty() || transmission.equals(null)) {
            this.transmission = "Default";
        } else {
            this.transmission = transmission;
        }
        this.MODEL=MODEL;
        this.BRAND=BRAND;
        if (registerNumber>0) {
            this.registerNumber = registerNumber;
        } else {
            this.registerNumber = 1;
        }
        if (colour.isEmpty() || colour.equals(null)) {
            this.colour = "White";
        } else {
            this.colour = colour;
        }
        if (engineVolume > 0) {
            this.engineVolume = engineVolume;
        } else {
            this.engineVolume = 1.5F;
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
                "Марка машины " + BRAND + "\n"
                        + "Модель " + MODEL + "\n"
                        + "Страна производитель " + PROD_COUNTRY + "\n"
                        + "Год выпуска " + PROD_YEAR + "\n"
                        + "Цвет " + colour + "\n"
                        + "Объем двигетеля " + engineVolume + "\n"
                        + "Коробка передач " + transmission + "\n"
                        + "Тип кузова " + TYPE_BODY + "\n"
                        + "Регистрационный номер " + registerNumber + "\n"
                        + "Количество мест " + PLACE_COUNT + "\n"
                        + "Коробка передач " + transmission + "\n"
                        + "Скорость " + speed + "\n";

    }
}


