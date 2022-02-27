package Exercise;

import java.util.Scanner;

public class SumDigits {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        String holder = Integer.toString(number);
        int sum = 0;

        for (int i = 0; i < holder.length(); i ++){
            sum += Character.getNumericValue(holder.charAt(i));
        }

        System.out.println(sum);

    }
}
