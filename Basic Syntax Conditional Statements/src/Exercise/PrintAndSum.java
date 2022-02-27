package Exercise;

import java.util.Scanner;

public class PrintAndSum {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int startingNumber = Integer.parseInt(scanner.nextLine());
        int endingNumber = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        for (;startingNumber <= endingNumber; startingNumber ++){
            System.out.print(startingNumber + " ");
            sum += startingNumber;
        }

        System.out.println("\nSum: " + sum);

    }
}
