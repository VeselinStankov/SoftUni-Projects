package More;

import java.util.Scanner;

public class MatchTickets {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String category = scanner.nextLine();
        int people = Integer.parseInt(scanner.nextLine());

        double transportMoney;
        double price = 0;

        if (people <= 4){
            transportMoney = budget * 0.75;
        }
        else if (people <= 9){
            transportMoney = budget * 0.6;
        }
        else if (people <= 24){
            transportMoney = budget * 0.5;
        }
        else if (people <= 49){
            transportMoney = budget * 0.4;
        }
        else {
            transportMoney = budget * 0.25;
        }

        if (category.equals("VIP")){
            price = 499.99 * people;
        }
        else if (category.equals("Normal")){
            price = 249.99 * people;
        }

        double finalPrice = price + transportMoney;

        if (finalPrice <= budget){
            System.out.printf("Yes! You have %.2f leva left.", budget - finalPrice);
        }
        else {
            System.out.printf("Not enough money! You need %.2f leva.",finalPrice - budget);
        }
    }
}
