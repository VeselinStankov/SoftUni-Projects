package Exercises;

import java.util.Scanner;

public class FoodDelivery {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Double chickenMenu = Double.parseDouble(scanner.nextLine());
        Double fishMenu = Double.parseDouble(scanner.nextLine());
        Double vegetarianMenu = Double.parseDouble(scanner.nextLine());

        double basePrice = chickenMenu * 10.35 + fishMenu * 12.40 + vegetarianMenu * 8.15;
        double desert = basePrice * 0.2 + 2.5;

        double price = basePrice + desert;

        System.out.println(price);

    }

}
