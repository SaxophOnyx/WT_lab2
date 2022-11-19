package by.saxophonyx.entities;

/**
 * Base class for all appliances
 */
public abstract class Appliance {
    protected double price;
    protected String name;

    public Appliance() {

    }

    public Appliance(String name, double price) {
        this.price = price;
        this.name = name;
    }


    public abstract String getGroupName();

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }
}