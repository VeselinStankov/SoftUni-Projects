package More;

import java.util.Scanner;

public class TruckDriver {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String season = scanner.nextLine();
        double kilometers = Double.parseDouble(scanner.nextLine());
        double payment = 0;

        switch (season){
            case "Spring":
            case "Autumn":
                if (kilometers <= 5000){
                payment = kilometers * 0.75;
            }
            else if (kilometers <= 10000){
                payment = kilometers * 0.95;
            }
            else if (kilometers <= 20000){
                payment = kilometers * 1.45;
            }
            break;
            case "Summer":
                if (kilometers <= 5000){
                    payment = kilometers * 0.9;
                }
                else if (kilometers <= 10000){
                    payment = kilometers * 1.1;
                }
                else if (kilometers <= 20000){
                    payment = kilometers * 1.45;
                }
                break;
            case "Winter":
                if (kilometers <= 5000){
                    payment = kilometers * 1.05;
                }
                else if (kilometers <= 10000){
                    payment = kilometers * 1.25;
                }
                else if (kilometers <= 20000){
                    payment = kilometers * 1.45;
                }
                break;
        }
        payment = payment * 4;
        payment -= payment * 0.1;
        System.out.printf("%.2f",payment);
    }
}
