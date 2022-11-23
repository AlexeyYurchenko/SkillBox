package practice;

import java.util.Scanner;

public class TrucksAndContainers {
    public static void main(String[] args) {
        int boxInCont = 27;
        int contInTruck = 12;
        int truck = 0;
        int container = 0;
        final String newline = System.lineSeparator();

        Scanner scanner = new Scanner(System.in);
        int boxes = scanner.nextInt();
        if (boxes <= 0) {
            truck = 0;
            container = 0;
        } else {
            for (int box = 1; box <= boxes; box++) {
                if (box % (boxInCont*contInTruck) == 1) {
                    System.out.println("Грузовик: " + ++truck);
                }
                if ((box % boxInCont) == 1) {
                    System.out.println("\tКонтейнер: " + ++container);
                }
                System.out.println("\t\tЯщик: " + box);
            }
        }
        System.out.println("Необходимо:" + newline + "грузовиков - " + truck + " шт." + newline + "контейнеров - " + container + " шт.");
    }
}
