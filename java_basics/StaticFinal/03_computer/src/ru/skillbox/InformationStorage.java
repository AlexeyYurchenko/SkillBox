package ru.skillbox;

public class InformationStorage {
    private final TypeStorage type; // тип — HDD, SSD,
    private final int volumeMemory; // объём памяти
    private final int weight; // вес


    public InformationStorage(TypeStorage type, int volumeMemory, int weight) {
        this.type = type;
        this.volumeMemory = volumeMemory;
        this.weight = weight;
    }
    public InformationStorage(){
        this.type = TypeStorage.HDD;
        this.volumeMemory = 0;
        this.weight = 0;
    }
    public TypeStorage getType() {
        return type;
    }
    public InformationStorage setType(TypeStorage type) {
        return new InformationStorage(type,volumeMemory,weight);
    }
    public int getVolumeMemory() {
        return volumeMemory;
    }
    public InformationStorage setVolumeMemory(int volumeMemory) {
        return new InformationStorage(type,volumeMemory,weight);
    }
    public int getWeight() {
        return weight;
    }
    public InformationStorage setWeight(int weight) {
        return new InformationStorage(type,volumeMemory,weight);
    }
    public String toString(){
        return "Накопитель информации" + "\n" +
                "тип — HDD, SSD:" + type + "\n" +
                "объём памяти:" + volumeMemory + "\n" +
                "вес:" + weight;
    }
}



