import java.util.Arrays;
import java.util.Scanner;

public class SumEvenNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();
        String[] numberString = line.split(" ");
        int number;
        int sum = 0;

        for (int i = 0; i < numberString.length; i ++){
            number = Integer.parseInt(numberString[i]);
            if (number % 2 == 0) {
                sum += number;
            }
        }
        System.out.println(sum);
    }
}
