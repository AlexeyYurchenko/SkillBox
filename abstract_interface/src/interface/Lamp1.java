public class Lamp1 extends LightingDevice1 {

    private Type type;

    public enum Type{
        INCANDESCENT,
        FILAMENT,
        LED,
        LUMINESCENT
    }

    public Lamp1(int power) {
        super(power);
    }
    @Override
    public double getEnergyConsumption(){
        return power * brightness;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }
}