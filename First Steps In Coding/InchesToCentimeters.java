import java.util.Scanner;

public class InchesToCentimeters {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter cm: ");
        double a = Double.parseDouble(scanner.nextLine());

        double b = a * 2.54;

        System.out.println(b);
    }
}