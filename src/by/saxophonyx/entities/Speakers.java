package by.saxophonyx.entities;

public class Speakers extends Appliance{
    private int powerConsumption;
    private int numberOfSpeakers;
    private double frequencyRangeMin;
    private double frequencyRangeMax;
    private double cordLength;

    public Speakers() {

    }

    @Override
    public String getGroupName() {
        return "Speakers";
    }

    public Speakers(String name, double price, int powerConsumption, int numberOfSpeakers, double frequencyRangeMin,
                    double frequencyRangeMax, double cordLength) {
        super(name, price);
        this.powerConsumption = powerConsumption;
        this.numberOfSpeakers = numberOfSpeakers;
        this.frequencyRangeMin = frequencyRangeMin;
        this.frequencyRangeMax = frequencyRangeMax;
        this.cordLength = cordLength;
    }

    public int getPowerConsumption() {
        return powerConsumption;
    }

    public int getNumberOfSpeakers() {
        return numberOfSpeakers;
    }

    public double getFrequencyRangeMin() {
        return frequencyRangeMin;
    }

    public double getFrequencyRangeMax() {
        return frequencyRangeMax;
    }

    public double getCordLength() {
        return cordLength;
    }

    public void setPowerConsumption(int powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public void setNumberOfSpeakers(int numberOfSpeakers) {
        this.numberOfSpeakers = numberOfSpeakers;
    }

    public void setFrequencyRangeMin(double frequencyRangeMin) {
        this.frequencyRangeMin = frequencyRangeMin;
    }

    public void setFrequencyRangeMax(double frequencyRangeMax) {
        this.frequencyRangeMax = frequencyRangeMax;
    }

    public void setCordLength(double cordLength) {
        this.cordLength = cordLength;
    }

    @Override
    public String toString() {
        return  "[GroupName: " + getGroupName()
                + "] Name: " + name
                + ", Price: " + price
                + ", Power consumption: " + powerConsumption
                + ", Number of speakers: " + numberOfSpeakers
                + ", Frequency range: " + frequencyRangeMin + " - " + frequencyRangeMax
                + ", Cord length: " + cordLength;
    }
}