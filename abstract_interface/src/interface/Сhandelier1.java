public class Сhandelier1 extends LightingDevice1 {

    private static final int LAMP_BRIGHTNESS_STEPS = 2;
    public static final double CONSUMPTION_COEFF = 1.095;

    private final int lampsCount;
    private Controller controller;

    private class Controller{
        public void reset(){
            // some logic
        }
    }

    public Сhandelier1(int power, int lampsCount) {
        super(power);
        this.lampsCount = lampsCount;
        controller = new Controller();
    }

    @Override
    public void setBrightness(double level) {
        double step = 1.0 / (lampsCount * LAMP_BRIGHTNESS_STEPS);
        int stepsCount = (int) Math.round(level / step);
        super.setBrightness(stepsCount*step);
        if (brightness==0){
            controller.reset();
        }
        class Controller2{
            public Controller2(){
                // some logic
            }
            public void reset2(){
                // some logic
            }
        }
        if (brightness==0){
            Controller2 controller2 = new Controller2();
            controller2.reset2();
        }
    }

    @Override
    public double getEnergyConsumption() {
        return power * Math.pow(brightness,CONSUMPTION_COEFF);
    }
}
