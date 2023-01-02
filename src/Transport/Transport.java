package Transport;
public class Transport {
    public String BRAND;
    public String MODEL;
    public static final String PROD_COUNTRY = "Russia";
    public static final int PROD_YEAR = 2000;
    public int speed;
    public String colour;

    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public String getColour() {
        return colour;
    }
    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setBRAND(String BRAND) {
        this.BRAND = BRAND;
    }

    public void setMODEL(String MODEL) {
        this.MODEL = MODEL;
    }

    public Transport(String BRAND, int speed) {

        if (colour.isEmpty() || colour.equals(null)) {
            this.colour = "White";
        } else {
            this.colour = colour;
        }

        if (speed >= 0) {
            this.speed = speed;
        } else {
            this.speed = 60;
        }
    }
    }
