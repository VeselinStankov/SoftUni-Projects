package More;

import java.util.Scanner;

public class Harvest {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int area = Integer.parseInt(scanner.nextLine());
        double grapePerArea = Double.parseDouble(scanner.nextLine());
        double wineLitersNeeded = Double.parseDouble(scanner.nextLine());
        int workers = Integer.parseInt(scanner.nextLine());

        double grapeForWine = (area * grapePerArea) * 0.4;
        double wine = grapeForWine / 2.5;

        if (wine >= wineLitersNeeded){
            System.out.printf("Good harvest this year! Total wine: %.0f liters.\n",Math.floor(wine));
            System.out.printf("%.0f liters left -> %.0f liters per person.",Math.ceil(wine - wineLitersNeeded),Math.ceil((wine - wineLitersNeeded) / workers));
        }
        else {
            System.out.printf("It will be a tough winter! More %.0f liters wine needed.",Math.floor(wineLitersNeeded - wine));
        }
    }
}
