package Transport;
public class Transport {
    public static final String BRAND="Lada";
    public static final String MODEL="Granta";
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
    public Transport(String colour, int speed) {

        if (colour != " " && colour != null) {
            this.colour = colour;
        } else {
            this.colour = "White";
        }

        if (speed >= 0) {
            this.speed = speed;
        } else {
            this.speed = 60;
        }
    }
    }
