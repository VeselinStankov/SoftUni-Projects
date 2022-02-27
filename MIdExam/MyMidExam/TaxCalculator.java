package MyMidExam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TaxCalculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();
        String[] cars = line.split(">>");
        String[] car;
        double tax = 0;
        double sum = 0;
        boolean flag = true;



        for (int i = 0; i < cars.length; i++) {
            car = cars[i].split(" ");

            switch (car[0]) {
                case "family":
                    tax = 50 - (Integer.parseInt(car[1]) * 5) + ((int)(Integer.parseInt(car[2]) / 3000) * 12);
                    break;

                case "heavyDuty":
                    tax = 80 - (Integer.parseInt(car[1]) * 8) + ((int)(Integer.parseInt(car[2]) / 9000) * 14);
                    break;

                case "sports":
                    tax = 100 - (Integer.parseInt(car[1]) * 9) + ((int)(Integer.parseInt(car[2]) / 2000) * 18);
                    break;

                default:
                    System.out.println("Invalid car type.");
                    flag = false;
                    break;
            }

            if (flag) {
                System.out.printf("A %s car will pay %.2f euros in taxes.\n", car[0], tax);
            }
            sum += tax;
            tax = 0;
            flag = true;
        }

        System.out.printf("The National Revenue Agency will collect %.2f euros in taxes.\n", sum);
    }
}
