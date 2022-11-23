package ru.skillbox;

public class Screen {
    private final int diagonal; // диагональ
    private final TypeScreen type; // тип (IPS, TN, VA)
    private final int weight; // вес

    public Screen(int diagonal, TypeScreen type, int weight) {
        this.diagonal = diagonal;
        this.type = type;
        this.weight = weight;
    }
    public Screen(){
        this.diagonal = 0;
        this.type = TypeScreen.IPS;
        this.weight = 0;
    }
    public int getDiagonal() {
        return diagonal;
    }
    public Screen setDiagonal(int diagonal) {
        return new Screen(diagonal,type,weight);
    }
    public TypeScreen getType() {
        return type;
    }
    public Screen setType(TypeScreen type) {
        return new Screen(diagonal,type,weight);
    }
    public int getWeight() {
        return weight;
    }
    public Screen setWeight(int weight) {
        return new Screen(diagonal,type,weight);
    }
    public String toString(){
        return "Экран" + "\n" +
                "диагональ:" + diagonal + "\n" +
                "тип (IPS, TN, VA):" + type + "\n" +
                "вес:" + weight;
    }
}
