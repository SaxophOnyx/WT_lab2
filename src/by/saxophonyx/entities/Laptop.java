package by.saxophonyx.entities;

import by.saxophonyx.entities.components.OperatingSystem;

public class Laptop extends Appliance{
    private double batteryCapacity;
    private OperatingSystem os;
    private int memoryRom;
    private int systemMemory;
    private double cpu;
    private int displayInches;

    public Laptop() {

    }

    @Override
    public String getGroupName() {
        return "Laptop";
    }

    public Laptop(String name, double price, double batteryCapacity, OperatingSystem os, int memoryRom, int systemMemory, double cpu,
                  int displayInches) {
        super(name, price);
        this.batteryCapacity = batteryCapacity;
        this.os = os;
        this.memoryRom = memoryRom;
        this.systemMemory = systemMemory;
        this.cpu = cpu;
        this.displayInches = displayInches;
    }

    public double getBatteryCapacity() {
        return batteryCapacity;
    }

    public OperatingSystem getOS() {
        return os;
    }

    public int getMemoryRom() {
        return memoryRom;
    }

    public int getSystemMemory() {
        return systemMemory;
    }

    public double getCpu() {
        return cpu;
    }

    public int getDisplayInches() {
        return displayInches;
    }

    public void setBatteryCapacity(double batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public void setOS(OperatingSystem os) {
        this.os = os;
    }

    public void setMemoryRom(int memoryRom) {
        this.memoryRom = memoryRom;
    }

    public void setSystemMemory(int systemMemory) {
        this.systemMemory = systemMemory;
    }

    public void setCpu(double cpu) {
        this.cpu = cpu;
    }

    public void setDisplayInches(int displayInches) {
        this.displayInches = displayInches;
    }

    @Override
    public String toString() {
        return  "[GroupName: " + getGroupName()
                + "] Name" + name
                + ", Price: " + price
                + ", Battery capacity: " + batteryCapacity
                + ", OS: " + os
                + ", Memory ROM: " + memoryRom
                + ", System memory: " + systemMemory
                + ", CPU: " + cpu
                + ", Display inches: " + displayInches;
    }
}