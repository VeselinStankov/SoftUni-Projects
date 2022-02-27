package Exercise.More;

import java.util.Scanner;

public class MultiplicationSign {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n1 = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());
        int n3 = Integer.parseInt(scanner.nextLine());

        if (n1 * n2 * n3 > 0) {
            System.out.println("positive");
        }
        else if (n1 * n2 * n3 < 0) {
            System.out.println("negative");
        }
        else {
            System.out.println("zero");
        }

    }
}
