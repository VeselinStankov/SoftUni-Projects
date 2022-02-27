package Exercises;

import java.util.Scanner;

public class Repainting {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int nylon = Integer.parseInt(scanner.nextLine());
        double paint = Double.parseDouble(scanner.nextLine());
        int thinner = Integer.parseInt(scanner.nextLine());
        int hours = Integer.parseInt(scanner.nextLine());

        double baseExpenses = nylon * 1.50 + 3 + ( paint + paint / 10 ) * 14.50 + thinner * 5 + 0.40;
        double workExpenses = ( baseExpenses * 0.30 ) * hours;

        double finalPrice = baseExpenses + workExpenses;

        System.out.println(finalPrice);

    }
}
