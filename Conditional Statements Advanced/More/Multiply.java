package More;

import java.util.Scanner;

public class Multiply {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double n = 0;

        while (n >= 0){
            n = Double.parseDouble(scanner.nextLine());
            if (n < 0){
                System.out.println("Negative number!");
                break;
            }
            System.out.printf("Result: %.2f\n",n * 2);
        }
    }
}
