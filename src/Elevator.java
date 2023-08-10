public class Elevator {

    private int currentFloor = 1;
    private int minFloor;
    private int maxFloor;

    public Elevator(int minFloor, int maxFloor) {
        this.minFloor = minFloor;
        this.maxFloor = maxFloor;
    }

    public void printCurrentFloor() {
        System.out.println("Текущий этаж: " + currentFloor);
    }


    public void moveDown() {
        currentFloor--;
    }

    public void moveUp() {
        currentFloor++;
    }

    public void move(int floor) {
        if (floor > maxFloor || floor < minFloor) {
            System.out.println("Некорректно задан этаж для перемещения. " + "В здании этажи с " + minFloor + " до " + maxFloor);
        }
        else if (floor < currentFloor) {
            for (int i = currentFloor; i > floor; i--) {
                moveDown();
                System.out.println("Этаж " + currentFloor);
            }
            System.out.println("Вы приехали на этаж " + currentFloor);
        } else if (floor > currentFloor) {
            for (int i = currentFloor; i < floor; i++) {
                moveUp();
                System.out.println("Этаж " + currentFloor);
            }
            System.out.println("Вы приехали на этаж " + currentFloor);
        } else {
            System.out.println("В данный момент вы уже на этаже " + currentFloor);
        }
    }
}


