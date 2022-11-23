import java.util.ArrayList;

public class SmartHouse {

    private ArrayList<LightingDevice1> devices1;
    public SmartHouse() {
        devices1 = new ArrayList<>();
        initLightingDevice();
    }
    public void switchOffAllDevices(){
        for (ElectricDevice device: devices1){
            device.switchOff();
        }
    }
    public void switchOffAllLight(){
        for (ElectricDevice device: devices1){
            if (device instanceof LightingDevice1){
                device.switchOff();;
            }
        }
    }
    public double getEnergyConsumption(){
        double sum = 0;
        for (ElectricDevice device: devices1){
            sum+= device.getEnergyConsumption();
        }
        return sum;
    }

    public void initLightingDevice(){
        devices1.add(new Lamp1(100));
        devices1.add(new Lamp1(60));
        devices1.add(new Lamp1(40));
        devices1.add(new Сhandelier1(100,4));
        devices1.add(new Сhandelier1(400,10));
        devices1.add(new Сhandelier1(250,5));
        devices1.add(new Сhandelier1(120,3));

    }
}
