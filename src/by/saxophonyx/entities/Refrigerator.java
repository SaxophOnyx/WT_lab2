package by.saxophonyx.entities;

public class Refrigerator extends Appliance{
    private int powerConsumption;
    private double weight;
    private int freezerCapacity;
    private double overallCapacity;
    private double height;
    private double width;

    public Refrigerator() {

    }

    @Override
    public String getGroupName() {
        return "Refrigerator";
    }

    public Refrigerator(String name, double price, int powerConsumption, double weight, int freezerCapacity,
                        double overallCapacity, double height, double width) {
        super(name, price);
        this.powerConsumption = powerConsumption;
        this.weight = weight;
        this.freezerCapacity = freezerCapacity;
        this.overallCapacity = overallCapacity;
        this.height = height;
        this.width = width;
    }

    public int getPowerConsumption() {
        return powerConsumption;
    }

    public double getWeight() {
        return weight;
    }

    public int getFreezerCapacity() {
        return freezerCapacity;
    }

    public double getOverallCapacity() {
        return overallCapacity;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public void setPowerConsumption(int powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setFreezerCapacity(int freezerCapacity) {
        this.freezerCapacity = freezerCapacity;
    }

    public void setOverallCapacity(double overallCapacity) {
        this.overallCapacity = overallCapacity;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return  "[GroupName: " + getGroupName()
                + "] Name: " + name
                + ", Price: " + price
                + ", Power consumption: " + powerConsumption
                + ", Weight: " + weight
                + ", Freezer capacity: " + freezerCapacity
                + ", Overall capacity: " + overallCapacity
                + ", Height: " + height
                + ", Width: " + width;
    }
}