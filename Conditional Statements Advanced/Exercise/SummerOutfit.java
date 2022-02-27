package Exercise;

import java.util.Scanner;

public class SummerOutfit {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int degrees = Integer.parseInt(scanner.nextLine());
        String day = scanner.nextLine();

        if (degrees >= 10 && degrees <= 18) {

            switch (day) {

                case "Morning":
                    System.out.println("It's " + degrees + " degrees, get your Sweatshirt and Sneakers.");
                    break;
                case "Afternoon":
                case "Evening":
                    System.out.println("It's " + degrees + " degrees, get your Shirt and Moccasins.");
                    break;
            }

        } else if (degrees > 18 && degrees <= 24) {

            switch (day) {

                case "Morning":
                case "Evening":
                    System.out.println("It's " + degrees + " degrees, get your Shirt and Moccasins.");
                    break;
                case "Afternoon":
                    System.out.println("It's " + degrees + " degrees, get your T-Shirt and Sandals.");
                    break;
            }

        } else if (degrees >= 25) {

            switch (day) {

                case "Morning":
                    System.out.println("It's " + degrees + " degrees, get your T-Shirt and Sandals.");
                    break;
                case "Afternoon":
                    System.out.println("It's " + degrees + " degrees, get your Swim Suit and Barefoot.");
                    break;
                case "Evening":
                    System.out.println("It's " + degrees + " degrees, get your Shirt and Moccasins.");
                    break;
            }
        }
    }
}
