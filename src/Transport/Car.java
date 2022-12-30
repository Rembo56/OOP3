package Transport;
public class Car extends Transport {
    public class Key {
        private final String remoutLounch;
        private final String keyLess;

        public Key (String remoutLounch, String keyLess){
            if (remoutLounch != " " && remoutLounch != null) {
                this.remoutLounch = remoutLounch;
            } else {
                this.remoutLounch = "Default";
            }
            if (keyLess != " " && keyLess != null) {
                this.keyLess = keyLess;
            } else {
                this.keyLess = "Default";
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
    public Car(String colour, int speed, float engineVolume, String transmission, int registerNumber, boolean typeTire) {
        super(colour, speed);
        if (transmission != " " && transmission != null) {
            this.transmission = transmission;
        } else {
            this.transmission = "Default";
        }
        if (registerNumber>0) {
            this.registerNumber = registerNumber;
        } else {
            this.registerNumber = 1;
        }
        if (colour != " " && colour != null) {
            this.colour = colour;
        } else {
            this.colour = "White";
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

    public void info () {
        System.out.println("Марка машины " + BRAND);
        System.out.println("Модель " + MODEL);
        System.out.println("Страна производитель " + PROD_COUNTRY);
        System.out.println("Год выпуска " + PROD_YEAR);
        System.out.println("Цвет " + colour);
        System.out.println("Объем двигетеля " + engineVolume);
        System.out.println("Коробка передач " + transmission);
        System.out.println("Тип кузова " + TYPE_BODY);
        System.out.println("Регистрационный номер " + registerNumber);
        System.out.println("Количество мест " + PLACE_COUNT);
        System.out.println("Коробка передач " + transmission);
        System.out.println("Скорость "+ speed);
        System.out.println();
    }
}


