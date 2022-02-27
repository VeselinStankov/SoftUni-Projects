package Exercise;

import java.util.Scanner;

public class MagicSum {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] line = scanner.nextLine().split(" ");

        int[] numbers = new int[line.length];

        for (int i = 0; i < line.length; i ++){
            numbers[i] = Integer.parseInt(line[i]);
        }

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numbers.length; i ++){
            for (int j = i + 1; j < numbers.length; j ++){
                if (numbers[i] + numbers[j] == n){
                    System.out.print(numbers[i] + " " + numbers[j] + "\n");
                }
            }
        }

    }
}
