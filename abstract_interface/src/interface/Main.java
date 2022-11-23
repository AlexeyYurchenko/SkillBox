import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Lamp1 lamp1 = new Lamp1(100);
        lamp1.setType(Lamp1.Type.LED);
        ArrayList<Lamp1> lamps1 = new ArrayList<>();
        lamps1.add(new Lamp1(100));
        lamps1.add(new Lamp1(20));
        lamps1.add(new Lamp1(40));
        lamps1.add(new Lamp1(150));

        Collections.sort(lamps1);

        for (Lamp1 lamp : lamps1) {
            System.out.println(lamp);
        }

        TreeSet<LightingDevice1> lightingDevice1s = new TreeSet<>(new Comparator<LightingDevice1>() {
            @Override
            public int compare(LightingDevice1 o1, LightingDevice1 o2) {
                return Integer.compare(o1.getPower(), o2.getPower());
            }
        });
        LightingDevice1 lightingDevice1 = new LightingDevice1(400) {
            @Override
            public double getEnergyConsumption() {
                return power * brightness;
            }
        };
    }
}


