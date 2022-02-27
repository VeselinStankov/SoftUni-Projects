import java.util.Scanner;

public class CharsToString {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        char symbol1 = scanner.nextLine().charAt(0);
        char symbol2 = scanner.nextLine().charAt(0);
        char symbol3 = scanner.nextLine().charAt(0);

        System.out.print(symbol1);
        System.out.print(symbol2);
        System.out.print(symbol3);
    }
}
