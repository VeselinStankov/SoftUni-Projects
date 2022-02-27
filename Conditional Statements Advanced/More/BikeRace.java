package More;

import java.util.Scanner;

public class BikeRace {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int juniors = Integer.parseInt(scanner.nextLine());
        int seniors = Integer.parseInt(scanner.nextLine());
        String track = scanner.nextLine();

        double juniorTax = 0;
        double seniorTax = 0;

        switch (track){
            case "trail":
                juniorTax = juniors * 5.50;
                seniorTax = seniors * 7;
                break;
            case "cross-country":
                juniorTax = juniors * 8;
                seniorTax = seniors * 9.50;
                if (juniors + seniors >= 50){
                    juniorTax = (juniors * 8) - ((juniors * 8) * 0.25);
                    seniorTax = (seniors * 9.50) - ((seniors * 9.50) * 0.25);
                }
                break;
            case "downhill":
                juniorTax = juniors * 12.25;
                seniorTax = seniors * 13.75;
                break;
            case "road":
                juniorTax = juniors * 20;
                seniorTax = seniors * 21.50;
                break;
        }

        double expenses = juniorTax + seniorTax;
        double money = expenses * 0.05;
        double discount = expenses - money;

        System.out.printf("%.2f",discount);
    }
}
