package Exercises;

import java.util.Scanner;

public class USDtoBGN {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double USD = Double.parseDouble(scanner.nextLine());
        double BGN = 1.79549 * USD;

        System.out.println(BGN);

    }
}
