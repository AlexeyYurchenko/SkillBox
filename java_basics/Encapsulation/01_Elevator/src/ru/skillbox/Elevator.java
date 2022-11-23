package ru.skillbox;

public class Elevator {

    private static int currentFloor = 1;
    private int minFloor;
    private int maxFloor;

    public Elevator(int i, int j) {
        minFloor = i;
        maxFloor = j;
    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    public void moveDown() {
        currentFloor = currentFloor > minFloor ? currentFloor - 1 : currentFloor;
    }

    public void moveUp() {
        currentFloor = currentFloor < maxFloor ? currentFloor + 1 : currentFloor;
    }

    public void move(int floor) {
        if (floor<minFloor) {
            System.out.println("ошибка");
            return;
        }else if (floor>maxFloor) {
            System.out.println("ошибка");
            return;
        }
        while (currentFloor != floor) {
            if (currentFloor > floor) {
                System.out.println("Лифт на этаже: " + currentFloor);
                moveDown();
                getCurrentFloor();
            } else if (currentFloor < floor) {
                System.out.println("Лифт на этаже: " + currentFloor);
                moveUp();
                getCurrentFloor();
            }
        }
    }
}