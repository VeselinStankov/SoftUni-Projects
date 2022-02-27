package More;

import java.util.Scanner;

public class Flowers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int hrizantemi = Integer.parseInt(scanner.nextLine());
        int rozi = Integer.parseInt(scanner.nextLine());
        int laleta = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        String holiday = scanner.nextLine();

        double price = 0;
        double hrizantemiPrice= 0;
        double roziPrice = 0;
        double laletaPrice = 0;

        if (holiday.equals("Y")) {

            switch (season) {
                case "Spring":
                    hrizantemiPrice = hrizantemi * 2;
                    roziPrice = rozi * 4.10;
                    laletaPrice = laleta * 2.50;
                    price = laletaPrice + roziPrice +hrizantemiPrice;
                    price += price * 0.15;
                    if (laleta >= 7){
                        price -= price * 0.05;
                    }
                    break;
                case "Summer":
                    hrizantemiPrice = hrizantemi * 2;
                    roziPrice = rozi * 4.10;
                    laletaPrice = laleta * 2.50;
                    price = laletaPrice + roziPrice + hrizantemiPrice;
                    break;
                case "Autumn":
                    hrizantemiPrice = hrizantemi * 3.75;
                    roziPrice = rozi * 4.50;
                    laletaPrice = laleta * 4.15;
                    price = laletaPrice + roziPrice +hrizantemiPrice;
                    break;
                case "Winter":
                    hrizantemiPrice = hrizantemi * 3.75;
                    roziPrice = rozi * 4.50;
                    laletaPrice = laleta * 4.15;
                    price = laletaPrice + roziPrice +hrizantemiPrice;
                    price += price * 0.15;
                    if (rozi >= 10){
                        price -= price * 0.1;
                    }
                    break;
            }
        }
        else {

            switch (season){

                case "Spring":
                    hrizantemiPrice = hrizantemi * 2;
                    roziPrice = rozi * 4.10;
                    laletaPrice = laleta * 2.50;
                    price = laletaPrice + roziPrice +hrizantemiPrice;
                    if (laleta >= 7){
                        price -= price * 0.05;
                    }
                    break;
                case "Summer":
                    hrizantemiPrice = hrizantemi * 2;
                    roziPrice = rozi * 4.10;
                    laletaPrice = laleta * 2.50;
                    price = laletaPrice + roziPrice + hrizantemiPrice;
                    break;
                case "Autumn":
                    hrizantemiPrice = hrizantemi * 3.75;
                    roziPrice = rozi * 4.50;
                    laletaPrice = laleta * 4.15;
                    price = laletaPrice + roziPrice +hrizantemiPrice;
                    break;
                case "Winter":
                    hrizantemiPrice = hrizantemi * 3.75;
                    roziPrice = rozi * 4.50;
                    laletaPrice = laleta * 4.15;
                    price = laletaPrice + roziPrice +hrizantemiPrice;
                    if (rozi >= 10){
                        price -= price * 0.1;
                    }
                    break;
            }
        }
        if (hrizantemi + rozi + laleta >= 20){
            price -= price * 0.2;
        }

        System.out.printf("%.2f",price + 2);
    }
}
