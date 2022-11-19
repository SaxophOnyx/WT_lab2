package by.saxophonyx.entities;

public class VacuumCleaner extends Appliance{
    private int powerConsumption;
    private String filterType;
    private String bagType;
    private String wandType;
    private int motorSpeedRegulation;
    private int cleaningWidth;

    public VacuumCleaner() {
    }

    @Override
    public String getGroupName() {
        return "VacuumCleaner";
    }

    public VacuumCleaner(String name, double price, int powerConsumption, String filterType, String bagType,
                         String wandType, int motorSpeedRegulation, int cleaningWidth) {
        super(name, price);
        this.powerConsumption = powerConsumption;
        this.filterType = filterType;
        this.bagType = bagType;
        this.wandType = wandType;
        this.motorSpeedRegulation = motorSpeedRegulation;
        this.cleaningWidth = cleaningWidth;
    }

    public int getPowerConsumption() {
        return powerConsumption;
    }

    public String getFilterType() {
        return filterType;
    }

    public String getBagType() {
        return bagType;
    }

    public String getWandType() {
        return wandType;
    }

    public int getMotorSpeedRegulation() {
        return motorSpeedRegulation;
    }

    public int getCleaningWidth() {
        return cleaningWidth;
    }

    public void setPowerConsumption(int powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public void setFilterType(String filterType) {
        this.filterType = filterType;
    }

    public void setBagType(String bagType) {
        this.bagType = bagType;
    }

    public void setWandType(String wandType) {
        this.wandType = wandType;
    }

    public void setMotorSpeedRegulation(int motorSpeedRegulation) {
        this.motorSpeedRegulation = motorSpeedRegulation;
    }

    public void setCleaningWidth(int cleaningWidth) {
        this.cleaningWidth = cleaningWidth;
    }

    @Override
    public String toString() {
        return  "[GroupName: " + getGroupName()
                + "] Name: " + name
                + ", Price: " + price
                + ", Power consumption: " + powerConsumption
                + ", Filter type: " + filterType
                + ", Bag type: " + bagType
                + ", Wand type: " + wandType
                + ", Motor speed regulation: " + motorSpeedRegulation
                + ", Cleaning width: " + cleaningWidth;
    }
}
