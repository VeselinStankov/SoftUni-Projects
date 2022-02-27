package Exercise;

import java.util.Scanner;

public class HalfSumElement {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i ++){
            int number = Integer.parseInt(scanner.nextLine());
            sum += number;

            if (number > max){
                max = number;
            }
        }
        int sumWithoutMax = sum - max;

        if (sumWithoutMax == max){
            System.out.println("Yes");
            System.out.printf("Sum = %d", sum/2);
        }
        else {
            int diff = Math.abs(max - sumWithoutMax);
            System.out.println("No");
            System.out.printf("Diff = %d", diff);
        }

    }
}
