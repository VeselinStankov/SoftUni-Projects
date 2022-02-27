package More;

import java.util.Scanner;

public class CarToGo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        String klass;
        String type = "";
        double price = 0;

        if (budget <= 100){
            klass = "Economy class";
            switch (season){
                case "Summer":
                    type = "Cabrio";
                    price = budget * 0.35;
                    break;
                case "Winter":
                    type = "Jeep";
                    price = budget * 0.65;
                    break;
            }
        }
        else if (budget <= 500){
            klass = "Compact class";
            switch (season){
                case "Summer":
                    type = "Cabrio";
                    price = budget * 0.45;
                    break;
                case "Winter":
                    type = "Jeep";
                    price = budget * 0.8;
                    break;
            }
        }
        else {
            klass = "Luxury class";
            type = "Jeep";
            price = budget * 0.9;
        }

        System.out.println(klass);
        System.out.printf("%s - %.2f",type,price);

    }
}
