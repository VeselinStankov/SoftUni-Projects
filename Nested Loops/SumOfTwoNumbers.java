import java.util.Scanner;

public class SumOfTwoNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int beginning = Integer.parseInt(scanner.nextLine());
        int ending = Integer.parseInt(scanner.nextLine());
        int magic = Integer.parseInt(scanner.nextLine());

        boolean isFound = false;
        int counter = 0;
        overloop:
        for (int n = beginning; n <= ending; n++) {
            for (int i = beginning; i <= ending; i++) {
                counter++;
                if (n + i == magic) {
                    isFound = true;
                    System.out.printf("Combination N:%d (%d + %d = %d)", counter, n, i, magic);
                    break overloop;
                }
            }
        }
        if (isFound == false) {
            System.out.printf("%d combinations - neither equals %d", counter, magic);
        }
    }
}
