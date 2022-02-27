package Exercise;

import java.util.Scanner;

public class FishingBoat {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        int fishers = Integer.parseInt(scanner.nextLine());

        double discount = 0;
        double price;

        switch (season){

            case "Spring":
                price = 3000;

                if (fishers <= 6){
                    discount = 3000 * 0.1;
                    price -= discount;
                }
                else if (fishers >= 7 && fishers <= 11){
                    discount = 3000 * 0.15;
                    price -= discount;
                }
                else if (fishers >= 12){
                    discount = 3000 * 0.25;
                    price -= discount;
                }
                if (fishers % 2 == 0){
                    discount = discount * 0.05;
                    price -= discount;
                }
                if (budget >= price){
                    double left = budget - price;
                    System.out.printf("Yes! You have %.2f leva left.",left);
                }
                else {
                    double missing = price - budget;
                    System.out.printf("Not enough money! You need %.2f leva.",missing);
                }

                break;

            case "Summer":
                price = 4200;

                if (fishers <= 6){
                    discount = 4200 * 0.1;
                    price -= discount;
                }
                else if (fishers >= 7 && fishers <= 11){
                    discount = 4200 * 0.15;
                    price -= discount;
                }
                else if (fishers >= 12){
                    discount = 4200 * 0.25;
                    price -= discount;
                }
                if (fishers % 2 == 0){
                    discount = discount * 0.05;
                    price -= discount;
                }
                if (budget >= price){
                    double left = budget - price;
                    System.out.printf("Yes! You have %.2f leva left.",left);
                }
                else {
                    double missing = price - budget;
                    System.out.printf("Not enough money! You need %.2f leva.",missing);
                }
                break;

            case "Autumn":
                price = 4200;

                if (fishers <= 6){
                    discount = 4200 * 0.1;
                    price -= discount;
                }
                else if (fishers >= 7 && fishers <= 11){
                    discount = 4200 * 0.15;
                    price -= discount;
                }
                else if (fishers >= 12){
                    discount = 4200 * 0.25;
                    price -= discount;
                }
                if (budget >= price){
                    double left = budget - price;
                    System.out.printf("Yes! You have %.2f leva left.",left);
                }
                else {
                    double missing = price - budget;
                    System.out.printf("Not enough money! You need %.2f leva.",missing);
                }

                break;

            case "Winter":
                price = 2600;

                if (fishers <= 6){
                    discount = 2600 * 0.1;
                    price -= discount;
                }
                else if (fishers >= 7 && fishers <= 11){
                    discount = 2600 * 0.15;
                    price -= discount;
                }
                else if (fishers >= 12){
                    discount = 2600 * 0.25;
                    price -= discount;
                }
                if (fishers % 2 == 0){
                    discount = discount * 0.05;
                    price -= discount;
                }
                if (budget >= price){
                    double left = budget - price;
                    System.out.printf("Yes! You have %.2f leva left.",left);
                }
                else {
                    double missing = price - budget;
                    System.out.printf("Not enough money! You need %.2f leva.",missing);
                }

                break;

        }

    }
}
