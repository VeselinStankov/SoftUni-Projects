package More;

import java.util.Scanner;

public class Pets {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int holiday = Integer.parseInt(scanner.nextLine());
        int food = Integer.parseInt(scanner.nextLine());
        double dogFoodKg = Double.parseDouble(scanner.nextLine());
        double catFoodKg = Double.parseDouble(scanner.nextLine());
        double turtleFoodGr = Double.parseDouble(scanner.nextLine());

        double turtleFoodKg = turtleFoodGr / 1000;
        double dogFoodNeeded = dogFoodKg * holiday;
        double catFoodNeeded = catFoodKg * holiday;
        double turtleFoodNeeded = turtleFoodKg * holiday;
        double foodNeeded = dogFoodNeeded + catFoodNeeded + turtleFoodNeeded;

        if (food >= foodNeeded){
            System.out.printf("%.0f kilos of food left.",Math.floor(food - foodNeeded));
        }
        else {
            System.out.printf("%.0f more kilos of food are needed.",Math.ceil(foodNeeded - food));
        }
    }
}
