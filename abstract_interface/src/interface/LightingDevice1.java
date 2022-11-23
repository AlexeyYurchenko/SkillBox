public abstract class LightingDevice1 implements ElectricDevice,Comparable {

    public static final double MAX_BRIGHTNESS = 1D;
    public static final double MIN_BRIGHTNESS = 0D;

    protected final int power;
    protected double brightness;

    @Override
    public void switchOnn() {
        setBrightness(MAX_BRIGHTNESS);
    }

    @Override
    public void switchOff() {
        setBrightness(MIN_BRIGHTNESS);
    }

    @Override
    public boolean isSwitchedOn() {
        return brightness > 0;
    }

    public LightingDevice1(int power) {
        this.power = power;
    }

    public void setBrightness(double level) {
        if (level < MAX_BRIGHTNESS){
            brightness = MIN_BRIGHTNESS;
        } else if (level > MAX_BRIGHTNESS) {
            brightness = MAX_BRIGHTNESS;
        } else {
            brightness = level;
        }
    }
    public double getBrightness() {
        return brightness;
    }

    public int getPower() {
        return power;
    }

    public void changeBrightness(double rate){
        double changed = brightness + brightness * rate;
        setBrightness(changed);
    }
    @Override
    public int compareTo(Object o) {
        LightingDevice1 device = (LightingDevice1) o;
        return Integer.compare(power,device.power);
    }

    @Override
    public String toString() {
        return getClass().getName()+ "witch power: " + power;
    }
}
