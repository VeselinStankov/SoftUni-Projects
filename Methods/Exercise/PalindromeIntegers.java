package Exercise;

import java.util.Scanner;

public class PalindromeIntegers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int number;

        while (!input.equals("END")){
            System.out.println(PalindromeChecker(input));
            input = scanner.nextLine();
        }

    }

    private static boolean PalindromeChecker(String input) {

        String holder = "";

        for (int i = input.length() - 1; i >= 0; i--) {
            holder += input.charAt(i);
        }

        if (input.equals(holder)){
            return true;
        }

        return false;
    }
}
