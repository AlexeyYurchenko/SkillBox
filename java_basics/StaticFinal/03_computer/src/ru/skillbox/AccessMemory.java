package ru.skillbox;

public class AccessMemory {
    private final String type; // тип
    private final int volume; // объём
    private final int weight; // вес

    public AccessMemory(){
        this.type = "N/A";
        this.volume = 0;
        this.weight = 0;
    }
    public AccessMemory(String type, int volume, int weight) {
        this.type = type;
        this.volume = volume;
        this.weight = weight;
    }
    public String getType() {
        return type;
    }
    public AccessMemory setType(String type) {
        return new AccessMemory(type,volume,weight);
    }
    public int getVolume() {
        return volume;
    }
    public AccessMemory setVolume(int volume) {
        return new AccessMemory(type,volume,weight);
    }
    public int getWeight() {
        return weight;
    }
    public AccessMemory setWeight(int weight) {
        return new AccessMemory(type,volume,weight);
    }
    public String toString(){
        return "Оперативная память" + "\n" +
                "тип:" + type + "\n" +
                "объём:" + volume + "\n" +
                "вес:" + weight;
    }
}
