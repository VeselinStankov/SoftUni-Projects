import java.util.Scanner;

public class NumberInRange {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double a = Double.parseDouble(scanner.nextLine());

        if (a >= -100 && a <= 100 && a != 0){
            System.out.println("Yes");
        }
        else System.out.println("No");

    }
}
