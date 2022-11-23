package ru.skillbox;

import java.util.concurrent.Callable;

public class Main {

    public static void main(String[] args) {
        Processor demoProcessor = new Processor();
        demoProcessor=demoProcessor.setFrequency(3.2);
        demoProcessor=demoProcessor.setNumberCores(4);
        demoProcessor=demoProcessor.setManufacturer("intel");
        demoProcessor=demoProcessor.setWeight(100);
        //System.out.println(demoProcessor);
        AccessMemory demoAccessMemory = new AccessMemory();
        demoAccessMemory=demoAccessMemory.setType("DDR4");
        demoAccessMemory=demoAccessMemory.setVolume(16);
        demoAccessMemory=demoAccessMemory.setWeight(200);
        //System.out.println(demoAccessMemory);
        InformationStorage demoInformationStorage = new InformationStorage();
        demoInformationStorage=demoInformationStorage.setType(TypeStorage.HDD);
        demoInformationStorage=demoInformationStorage.setVolumeMemory(1000);
        demoInformationStorage=demoInformationStorage.setWeight(300);
        //System.out.println(demoInformationStorage);
        Screen demoScreen = new Screen();
        demoScreen=demoScreen.setDiagonal(17);
        demoScreen=demoScreen.setType(TypeScreen.IPS);
        demoScreen=demoScreen.setWeight(600);
        //System.out.println(demoScreen);
        Keyboard demoKeyboard = new Keyboard();
        demoKeyboard=demoKeyboard.setType("Механическая");
        demoKeyboard=demoKeyboard.setBacklight(Backlight.YES);
        demoKeyboard=demoKeyboard.setWeight(300);
        //System.out.println(demoKeyboard);
        Computer demoComputer = new Computer();
        demoComputer=demoComputer.setName("Game Edition");
        demoComputer=demoComputer.setVendor("HP");
        demoComputer=demoComputer.setProcessor(demoProcessor);
        demoComputer=demoComputer.setAccessMemory(demoAccessMemory);
        demoComputer=demoComputer.setInformationStorage(demoInformationStorage);
        demoComputer=demoComputer.setScreen(demoScreen);
        demoComputer=demoComputer.setKeyboard(demoKeyboard);
        demoComputer.add(0);
        System.out.println(demoComputer);

    }

}
