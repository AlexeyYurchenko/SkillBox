package ru.skillbox;

import java.util.concurrent.Callable;

public class Computer {
    private final String vendor; // производитель
    private final String name; // название
    private final Processor processor; // процессор
    private final AccessMemory accessMemory; // оперативная память
    private final InformationStorage informationStorage; // накопитель информации
    private final Screen screen; // экран
    private final Keyboard keyboard; // клавиатура
    private int totalWeight; // общая масса компьютера

    public Computer(String vendor, String name, Processor processor, AccessMemory accessMemory,
                    InformationStorage informationStorage, Screen screen, Keyboard keyboard) {
        this.vendor = vendor;
        this.name = name;
        this.processor = processor;
        this.accessMemory = accessMemory;
        this.informationStorage = informationStorage;
        this.screen = screen;
        this.keyboard = keyboard;
    }
    public Computer(){
        this.vendor = "N/A";
        this.name = "N/A";
        this.processor = new Processor();
        this.accessMemory = new AccessMemory();
        this.informationStorage = new InformationStorage();
        this.screen = new Screen();
        this.keyboard = new Keyboard();
    }
    public void add(int totalWeight){
        this.totalWeight= processor.getWeight()+accessMemory.getWeight()
                +informationStorage.getWeight()+screen.getWeight()+ keyboard.getWeight();
    }
    public int getTotalWeight(){
        return totalWeight;
    }

    public String getVendor() {
        return vendor;
    }

    public Computer setVendor(String vendor) {
        return new Computer(vendor,name,processor,accessMemory,informationStorage,screen,keyboard);
    }

    public String getName() {
        return name;
    }

    public Computer setName(String name) {
        return new Computer(vendor,name,processor,accessMemory,informationStorage,screen,keyboard);
    }

    public Processor getProcessor() {
        return processor;
    }

    public Computer setProcessor(Processor processor) {
        return new Computer(vendor,name,processor,accessMemory,informationStorage,screen,keyboard);
    }

    public AccessMemory getAccessMemory() {
        return accessMemory;
    }

    public Computer setAccessMemory(AccessMemory accessMemory) {
        return new Computer(vendor,name,processor,accessMemory,informationStorage,screen,keyboard);
    }

    public InformationStorage getInformationStorage() {
        return informationStorage;
    }

    public Computer setInformationStorage(InformationStorage informationStorage) {
        return new Computer(vendor,name,processor,accessMemory,informationStorage,screen,keyboard);
    }

    public Screen getScreen() {
        return screen;
    }

    public Computer setScreen(Screen screen) {
        return new Computer(vendor,name,processor,accessMemory,informationStorage,screen,keyboard);
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public Computer setKeyboard(Keyboard keyboard) {
        return new Computer(vendor,name,processor,accessMemory,informationStorage,screen,keyboard);
    }
    public String toString() {
        return "производитель:" + vendor + "\n" +
                "название:" + name  + "\n" +
                "процессор:" + processor + "\n" +
                "оперативная память:" + accessMemory + "\n" +
                "накопитель информации:" + informationStorage + "\n" +
                "экран:" + screen + "\n" +
                "клавиатура:" + keyboard + "\n" +
                "общая масса компьютера:" + getTotalWeight();

    }

}