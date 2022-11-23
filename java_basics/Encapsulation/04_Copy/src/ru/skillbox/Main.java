package ru.skillbox;

public class Main {

    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(20,20,20);
        Сargoinformation cargoinformation=new Сargoinformation(dimensions,220,"Томск",true,
                "123ааа321",true);
        Сargoinformation copy = new Сargoinformation();
        copy=copy.setDimensions(new Dimensions(30,30,30));
        copy=copy.setWeight(200);
        copy=copy.setDeliveryAddress("Новосибирск");
        System.out.println(copy);























    }
}
