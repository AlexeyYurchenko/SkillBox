public interface ElectricDevice {
    boolean isSwitchedOn();
    void switchOnn();
    void switchOff();
    double getEnergyConsumption();

    default void toggle(){
        if (isSwitchedOn()){
            switchOff();
        } else {
            switchOnn();
        }
    }
}
