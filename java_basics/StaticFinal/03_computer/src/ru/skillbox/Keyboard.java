package ru.skillbox;

public class Keyboard {
    private final String type; // тип
    private final Backlight backlight; // наличие подсветки
    private final int weight; // вес

    public Keyboard(String type, Backlight backlight, int weight) {
        this.type = type;
        this.backlight = backlight;
        this.weight = weight;
    }
    public Keyboard(){
        this.type = "N/A";
        this.backlight = Backlight.YES;
        this.weight = 0;
    }
    public String getType() {
        return type;
    }
    public Keyboard setType(String type) {
        return new Keyboard(type,backlight,weight);
    }
    public Backlight getBacklight() {
        return backlight;
    }
    public Keyboard setBacklight(Backlight backlight) {
        return new Keyboard(type,backlight,weight);
    }
    public int getWeight() {
        return weight;
    }
    public Keyboard setWeight(int weight) {
        return new Keyboard(type,backlight,weight);
    }
    public String toString(){
        return "Клавиатура" + "\n" +
                "тип:" + type + "\n" +
                "наличие подсветки:" + backlight + "\n" +
                "вес:" + weight;
    }
}
