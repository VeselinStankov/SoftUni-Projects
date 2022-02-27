package Exercises;

import java.util.Scanner;

public class SuppliesForSchool {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int pens = Integer.parseInt(scanner.nextLine());
        int markers = Integer.parseInt(scanner.nextLine());
        int preparation = Integer.parseInt(scanner.nextLine());
        double discount = Double.parseDouble(scanner.nextLine());

        double wholePrice = (pens * 5.80 + markers * 7.20 + preparation * 1.20);

        double moneyNeeded = wholePrice - ( wholePrice * ( discount / 100 ) );

        System.out.println(moneyNeeded);

    }

}
