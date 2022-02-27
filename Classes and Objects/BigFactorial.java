import java.util.Scanner;

public class BigFactorial {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int facN = 1;

        for (int i = 1; i <= n; i++) {
            facN *= i;
        }

        System.out.println(facN);
    }
}
