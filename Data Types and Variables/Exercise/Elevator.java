package Exercise;

import java.util.Scanner;

public class Elevator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int people = Integer.parseInt(scanner.nextLine());
        double elevatorCapacity = Integer.parseInt(scanner.nextLine());

        double courses = people / elevatorCapacity;

        if (courses % 1 > 0){
            courses ++;
        }

        System.out.println((int)courses);

    }
}
