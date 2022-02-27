package Exercise;

import java.util.Scanner;

public class AddAndSubtract {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());

        System.out.println(Sum(a,b,c));

    }

    private static int Sum(int a, int b, int c) {

        return subtract(a+b,c);

    }

    private static int subtract(int i, int c) {

        return i - c;
    }
}
