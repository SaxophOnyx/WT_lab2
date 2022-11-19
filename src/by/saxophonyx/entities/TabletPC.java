package by.saxophonyx.entities;

import by.saxophonyx.entities.components.Color;

public class TabletPC extends Appliance{
    private int batteryCapacity;
    private int displayInches;
    private int memoryRom;
    private int flashMemoryCapacity;
    private Color color;

    public TabletPC() {

    }

    @Override
    public String getGroupName() {
        return "TabletPC";
    }

    public TabletPC(String name, double price, int batteryCapacity, int displayInches, int memoryRom,
                    int flashMemoryCapacity, Color color) {
        super(name, price);
        this.batteryCapacity = batteryCapacity;
        this.displayInches = displayInches;
        this.memoryRom = memoryRom;
        this.flashMemoryCapacity = flashMemoryCapacity;
        this.color = color;
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public int getDisplayInches() {
        return displayInches;
    }

    public int getMemoryRom() {
        return memoryRom;
    }

    public int getFlashMemoryCapacity() {
        return flashMemoryCapacity;
    }

    public Color getColor() {
        return color;
    }

    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public void setDisplayInches(int displayInches) {
        this.displayInches = displayInches;
    }

    public void setMemoryRom(int memoryRom) {
        this.memoryRom = memoryRom;
    }

    public void setFlashMemoryCapacity(int flashMemoryCapacity) {
        this.flashMemoryCapacity = flashMemoryCapacity;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return  "[GroupName: " + getGroupName()
                + "Name: " + name
                + ", Price: " + price
                + ", Battery capacity: " + batteryCapacity
                + ", Display inches: " + displayInches
                + ", Memory ROM: " + memoryRom
                + ", Flash memory capacity: " + flashMemoryCapacity
                + ", Color: " + color;
    }
}