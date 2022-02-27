package Exercises.More;

import java.util.Scanner;

public class Fishland {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double skumriqPrice = Double.parseDouble(scanner.nextLine());
        double cacaPrice = Double.parseDouble(scanner.nextLine());
        double palamudKg = Double.parseDouble(scanner.nextLine());
        double safridKg = Double.parseDouble(scanner.nextLine());
        double midiKg = Double.parseDouble(scanner.nextLine());

        double palamudPrice = skumriqPrice + ( skumriqPrice * 0.6);
        double safridPrice = cacaPrice + ( cacaPrice * 0.8 );

        double moneyNeeded = palamudKg * palamudPrice + safridKg * safridPrice + midiKg * 7.50;

        System.out.printf("%.2f",moneyNeeded);

    }
}
