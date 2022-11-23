package ru.skillbox;

public class Сargoinformation {

    private final Dimensions dimensions;
    private final double weight;
    private final String deliveryAddress;
    private final boolean doNotTurn;
    private final String registrationNumber;
    private final boolean fragileСargo;

    public Сargoinformation(){
        this.dimensions = new Dimensions();
        this.weight = 0;
        this.deliveryAddress = "N/A";
        doNotTurn = true;
        this.registrationNumber = "N/A";
        fragileСargo = true;

    }

    public Сargoinformation(Dimensions dimensions, double weight, String deliveryAddress, boolean doNotTurn, String registrationNumber, boolean fragileСargo) {

        this.dimensions = dimensions;
        this.weight = weight;
        this.deliveryAddress = deliveryAddress;
        this.doNotTurn = doNotTurn;
        this.registrationNumber = registrationNumber;
        this.fragileСargo = fragileСargo;
    }


    public Dimensions getDimensions() {
        return dimensions;
    }

    public Сargoinformation setDimensions(Dimensions dimensions) {
        return new Сargoinformation(dimensions,weight,deliveryAddress,doNotTurn,registrationNumber,fragileСargo);
    }

    public double getWeight() {
        return weight;
    }

    public Сargoinformation setWeight(double weight) {
        return new Сargoinformation(dimensions,weight,deliveryAddress,doNotTurn,registrationNumber,fragileСargo);
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public Сargoinformation setDeliveryAddress(String deliveryAddress) {
        return new Сargoinformation(dimensions,weight,deliveryAddress,doNotTurn,registrationNumber,fragileСargo);
    }

    public boolean isDoNotTurn() {
        if (doNotTurn==true)
            System.out.println("не переворачивать");
        else System.out.println("");
        return doNotTurn;

    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public boolean isFragileСargo() {
        if(fragileСargo==true)
            System.out.println("груз хрупкий");
        else System.out.println("");
        return fragileСargo;

    }

    public String toString() {
        return "габариты: " + dimensions + "\n" +
                "масса: " + weight + "\n"+
                "адрес доставки: " +deliveryAddress + "\n"+
                isDoNotTurn() + "\n" +
                "регистрационный номер: "+ registrationNumber + "\n"+
                isFragileСargo();
    }

}


