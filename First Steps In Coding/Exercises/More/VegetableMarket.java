package Exercises.More;

import java.util.Scanner;

public class VegetableMarket {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double kgVegPrice = Double.parseDouble(scanner.nextLine());
        double kgFruPrice = Double.parseDouble(scanner.nextLine());
        double kgVegetables = Double.parseDouble(scanner.nextLine());
        double kgFruits = Double.parseDouble(scanner.nextLine());

        double euroPriceVeg = ( kgVegetables * kgVegPrice ) / 1.94;
        double euroPriceFru = ( kgFruits * kgFruPrice) / 1.94;

        double income = ( euroPriceFru + euroPriceVeg );

        System.out.printf("%.2f", income);

    }
}