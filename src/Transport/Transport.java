package Transport;
public class Transport {
    public String brand;
    public String model;
    public String prodCountry;
    public int prodYear;
    public int speed;
    public String colour;

    public Transport(String brand, String model, String prodCountry, int prodYear, int speed, String colour) {
        this.brand = brand;
        this.model = model;
        this.prodCountry = prodCountry;
        this.prodYear = prodYear;
        this.speed = speed;
        this.colour = colour;

        if (colour==null || colour.isEmpty()) {
            this.colour = "black";
        } else {
            this.colour = colour;
        }
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getProdCountry() {
        return prodCountry;
    }

    public void setProdCountry(String prodCountry) {
        this.prodCountry = prodCountry;
    }

    public int getProdYear() {
        return prodYear;
    }

    public void setProdYear(int prodYear) {
        this.prodYear = prodYear;
    }

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

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }


    }
