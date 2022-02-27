package More;

import java.util.Scanner;

public class OddEvenPosition {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        double number;
        int counter = 0;

        double evenMin = 1000;
        double evenMax = - 1000;
        double evenSum = 0;
        double oddMin = 1000;
        double oddMax = - 1000;
        double oddSum = 0;

        for (int i = 1; i <= n; i ++){
            number = Double.parseDouble(scanner.nextLine());
            counter ++;
            if (counter % 2 == 0){
                evenSum += number;
                if (number > evenMax){
                    evenMax = number;
                }
                if (number < evenMin){
                    evenMin = number;
                }
            }
            else {
                oddSum += number;
                if (number > oddMax){
                    oddMax = number;
                }
                if (number < oddMin){
                    oddMin = number;
                }
            }
        }
        System.out.printf("OddSum=%.2f,\n",oddSum);
        if (oddMin == 0 || oddMin == 1000){
            System.out.println("OddMin=No,");
        }
        else {
            System.out.printf("OddMin=%.2f,\n", oddMin);
        }
        if (oddMax == 0 || oddMax == - 1000){
            System.out.println("OddMax=No,");
        }
        else {
            System.out.printf("OddMax=%.2f,\n", oddMax);
        }
        System.out.printf("EvenSum=%.2f,\n",evenSum);
        if (evenMin == 0 || evenMin == 1000){
            System.out.println("EvenMin=No,");
        }
        else {
            System.out.printf("EvenMin=%.2f,\n",evenMin);
        }
        if (evenMax == 0 || evenMax == - 1000){
            System.out.println("EvenMax=No");
        }
        else {
            System.out.printf("EvenMax=%.2f\n",evenMax);
        }
    }
}
