package More;

import java.util.Scanner;

public class AverageNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        double num;
        double numSum = 0;
        int counter = 0;

        for (int i = 0; i < n; i++){
            num = Double.parseDouble(scanner.nextLine());
            counter ++;
            numSum += num;
        }
        System.out.printf("%.2f",numSum / counter);

    }
}
