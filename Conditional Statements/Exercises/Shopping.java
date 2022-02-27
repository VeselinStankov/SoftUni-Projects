package Exercises;

import java.util.Scanner;

public class Shopping {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double  budget = Double.parseDouble(scanner.nextLine());
        int videoCards = Integer.parseInt(scanner.nextLine());
        int processors = Integer.parseInt(scanner.nextLine());
        int RAM = Integer.parseInt(scanner.nextLine());

        double videoCardPrice = 250;
        double processorPrice = 0.35 * ( 250 * videoCards );
        double RAMPrice = 0.1 * ( 250 * videoCards );

        double finalPrice = videoCards * videoCardPrice + processors * processorPrice + RAM * RAMPrice;

        if (videoCards > processors){
            double discount = finalPrice * 0.15;
            finalPrice -= discount;
        }

        if (finalPrice <= budget){
            double left = budget - finalPrice;
            System.out.printf("You have %.2f leva left!",left);
        }
        if (finalPrice > budget){
            double missing = finalPrice - budget;
            System.out.printf("Not enough money! You need %.2f leva more!",missing);
        }
    }
}
