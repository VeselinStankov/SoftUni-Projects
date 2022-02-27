package Exercises;

import java.util.Scanner;

public class FishTank {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double length = Double.parseDouble(scanner.nextLine());
        double width = Double.parseDouble(scanner.nextLine());
        double height = Double.parseDouble(scanner.nextLine());
        double occupied = Double.parseDouble(scanner.nextLine());

        double V = ( length * width * height ) / 1000;
        double waterNeeded = V - ( V * ( occupied / 100 ) );

        System.out.println(waterNeeded);
    }
}
