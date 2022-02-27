import java.util.Scanner;

public class CondenseArrayToNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();
        String [] array = line.split(" ");
        int[] numbers = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            numbers[i] = Integer.parseInt(array[i]);
        }

        for (int j = 0; j < numbers.length - 1; j ++) {
            for (int i = 0; i < numbers.length - 1; i++) {
                numbers[i] += numbers[i + 1];
            }
        }
        System.out.println(numbers[0]);
    }
}
