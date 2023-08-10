import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        Elevator elevator = new Elevator(-3, 26);
//        while (true) {
//            elevator.printCurrentFloor();
//            System.out.print("Введите номер этажа: ");
//            int floor = new Scanner(System.in).nextInt();
//            elevator.move(floor);
//        }

        double width = 3;
        double height = 7.2;
        double length = 4;
        Dimensions dimensions = new Dimensions(width, height, length);

        Storage storage = new Storage(
                dimensions,
                3,
                "Neverland, Anytown, Somewhere road, 32",
                false,
                "DDQ45",
                true);

        System.out.println(storage);

        Storage copyStorage = storage.setWeight(1);

        System.out.println(copyStorage);

        System.out.println(storage);
    }
}