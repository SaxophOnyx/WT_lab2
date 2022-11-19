package by.saxophonyx.entities;

public class Kettle extends Appliance{
    private int powerConsumption;
    private double weight;
    private int capacity;
    private int depth;
    private double height;
    private double width;

    public Kettle() {

    }

    @Override
    public String getGroupName() {
        return "Kettle";
    }

    public Kettle(String name, double price, int powerConsumption, double weight, int capacity, int depth, double height,
                double width) {
        super(name, price);
        this.powerConsumption = powerConsumption;
        this.weight = weight;
        this.capacity = capacity;
        this.depth = depth;
        this.height = height;
        this.width = width;
    }

    public int getPowerConsumption() {
        return powerConsumption;
    }

    public double getWeight() {
        return weight;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getDepth() {
        return depth;
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

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return "[GroupName: " + getGroupName()
                + "] Name: " + name
                + ", Price: " + price
                + ", Power consumption: " + powerConsumption
                + ", Weight: " + weight
                + ", Capacity: " + capacity
                + ", Depth: " + depth
                + ", Height: " + height
                + ", Width: " + width;
    }
}