package Exercise;

import java.util.Scanner;

public class AppendArrays {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\|");

        for (int i = 0; i < input.length; i ++) {
            input[i] = input[i].replace(" ", "");
        }

        if (input.length == 1) {
            for (int i = input[0].length() - 1; i >= 0; i --) {
                System.out.print(input[0].charAt(i) + " ");
            }
        }
        else {
            for (int i = input.length - 1; i >= 0; i --) {
                for (int j = 0; j < input[i].length(); j ++) {
                    System.out.print(input[i].charAt(j) + " ");
                }
            }
        }
    }
}
