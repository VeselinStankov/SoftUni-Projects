package Exercise;

import java.util.Scanner;

public class OperationsBetweenNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double a = Double.parseDouble(scanner.nextLine());
        double b = Double.parseDouble(scanner.nextLine());
        String symbol = scanner.nextLine();

        int a1 = (int) a;
        int b1 = (int) b;

        switch (symbol){

            case "+":
                if ((a1 + b1) % 2 == 0){
                    int c = a1 + b1;
                    System.out.printf("%d + %d = %d - even", a1 , b1 ,c);
                }
                else if ((a1 + b1) % 2 != 0){
                    int c = a1 + b1;
                    System.out.printf("%d + %d = %d - odd", a1 , b1,c);
                }
                break;
            case "-":
                if ((a1 - b1) % 2 == 0){
                    int c = a1 - b1;
                    System.out.printf("%d - %d = %d - even", a1 , b1,c);
                }
                else if ((a1 - b1) % 2 != 0){
                    int c = a1 - b1;
                    System.out.printf("%d - %d = %d - odd", a1 , b1,c);
                }
                break;
            case "*":
                if ((a1 * b1) % 2 == 0){
                    int c = a1 * b1;
                    System.out.printf("%d * %d = %d - even", a1 , b1,c);
                }
                else if ((a1 * b1) % 2 != 0){
                    int c = a1 * b1;
                    System.out.printf("%d * %d = %d - odd", a1 , b1, c);
                }
                break;
            case "/":
                if (b == 0){
                    System.out.printf("Cannot divide %d by zero",a1);
                }
                else {
                    double c = a / b;
                    System.out.printf("%d / %d = %.2f",a1,b1,c);
                }
                break;
            case "%":
                if (b == 0){
                    System.out.printf("Cannot divide %d by zero",a1);
                }
                else {
                    double c = a % b;
                    System.out.printf("%d %% %d = %.0f",a1,b1,c);
                }

        }

    }
}
