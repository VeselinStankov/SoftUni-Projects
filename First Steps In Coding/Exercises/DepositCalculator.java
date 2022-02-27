package Exercises;

import java.util.Scanner;

public class DepositCalculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double depositedMoney = Double.parseDouble(scanner.nextLine());
        int depositDeadLine = Integer.parseInt(scanner.nextLine());
        double yearDivident = Double.parseDouble(scanner.nextLine());
        double yearDividents = yearDivident / 100;

        double endSum = depositedMoney + depositDeadLine * ( (depositedMoney * yearDividents) / 12 );

        System.out.println(endSum);
    }
}
