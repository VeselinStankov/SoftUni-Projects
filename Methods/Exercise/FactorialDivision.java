package Exercise;

import java.util.Scanner;

public class FactorialDivision {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        double factA = 1;
        double factB = 1;

        for (int i = 1; i <= a; i++) {
            factA *= i;
        }

        for (int i = 1; i <= b; i++) {
            factB *= i;
        }

        System.out.printf("%.2f",factA / factB);
    }
}
