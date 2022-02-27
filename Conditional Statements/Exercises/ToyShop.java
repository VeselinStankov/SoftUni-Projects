package Exercises;

import java.util.Scanner;

public class ToyShop {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double price = Double.parseDouble(scanner.nextLine());
        int puzzle = Integer.parseInt(scanner.nextLine());
        int doll = Integer.parseInt(scanner.nextLine());
        int bear = Integer.parseInt(scanner.nextLine());
        int minion = Integer.parseInt(scanner.nextLine());
        int truck = Integer.parseInt(scanner.nextLine());

        double allPrice = puzzle * 2.6 + doll * 3 + bear * 4.1 + minion * 8.2 + truck * 2;
        int allCount = puzzle + doll + bear + minion + truck;

        if ( allCount >= 50){
            allPrice = allPrice - (allPrice * 25.0 / 100.0);
        }

        double rent = allPrice * 0.1;

        double finalPrice = allPrice - rent;

        if ( finalPrice >= price){
            double left = finalPrice - price;
            System.out.printf("Yes! %.2f lv left." , left);
        }
        else {
            double missing = price - finalPrice;
            System.out.printf("Not enough money! %.2f lv needed.", missing);
        }
    }
}