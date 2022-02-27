package Exercises;

import java.util.Scanner;

public class GodzillaVsKong {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int statists = Integer.parseInt(scanner.nextLine());
        double clothingPrice = Double.parseDouble(scanner.nextLine());

        double decor = budget * 0.1;
        double allClothing = clothingPrice * statists;

        if (statists > 150){
            double discount = allClothing * 0.1;
            allClothing -= discount;
        }
        if (decor + allClothing > budget){
            double missing = ( decor + allClothing ) - budget;
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more." , missing);
        }
        if (decor + allClothing <= budget){
            double left = budget - ( allClothing + decor );
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left." , left);
        }
    }
}
