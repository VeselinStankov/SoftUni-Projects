package Exercise.More;

import java.util.Scanner;

public class FloatingEquality {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double a = Double.parseDouble(scanner.nextLine());
        double b = Double.parseDouble(scanner.nextLine());

        double epsilon = 0.000001;

        for (int i = 1; i <= 11; i ++){
            a += 0.1;
            b += 0.1;
        }


        if (Math.abs(a - b) < epsilon){
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }

    }
}
