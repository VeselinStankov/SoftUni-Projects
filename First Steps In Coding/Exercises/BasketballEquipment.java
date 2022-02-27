package Exercises;

import java.util.Scanner;

public class BasketballEquipment {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double yearPrice = Double.parseDouble(scanner.nextLine());

        double shoes = yearPrice - ( yearPrice * 0.4 );
        double clothes = shoes - ( shoes * 0.2 );
        double ball = clothes / 4;
        double accessories =ball / 5;

        double price = yearPrice + shoes + clothes + ball + accessories;

        System.out.println(price);

    }
}
