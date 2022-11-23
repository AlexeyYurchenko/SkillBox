package ru.skillbox;

public class Processor {
    private final double frequency; // частота
    private final int numberCores;  // количество ядер
    private final String manufacturer; // производитель
    private final int weight;  // вес

    public Processor(){
        this.frequency = 0;
        this.numberCores = 0;
        this.manufacturer = "N/A";
        this.weight = 0;
    }
    public Processor(double frequency, int numberCores, String manufacturer, int weight) {
        this.frequency = frequency;
        this.numberCores = numberCores;
        this.manufacturer = manufacturer;
        this.weight = weight;
    }

    public double getFrequency() {
        return frequency;
    }
    public Processor setFrequency(double frequency) {
        return new Processor(frequency,numberCores,manufacturer,weight);
    }
    public int getNumberCores() {
        return numberCores;
    }
    public Processor setNumberCores(int numberCores) {
        return new Processor(frequency,numberCores,manufacturer,weight);
    }
    public String getManufacturer() {
        return manufacturer;
    }
    public Processor setManufacturer(String manufacturer) {
        return new Processor(frequency,numberCores,manufacturer,weight);
    }
    public int getWeight() {
        return weight;
    }
    public Processor setWeight(int weight) {
        return new Processor(frequency,numberCores,manufacturer,weight);
    }
    public String toString(){
        return "Процессор" + "\n" +
                "частота:" + frequency + "\n" +
                "количество ядер:" + numberCores + "\n" +
                "производитель:" + manufacturer + "\n" +
                "вес:" + weight;
    }
}
