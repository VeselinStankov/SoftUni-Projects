package Exercise;

import java.util.Scanner;

public class MaxSequenceOfEqualElements {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] line = scanner.nextLine().split(" ");

        int[] numbers = new int[line.length];

        for (int i = 0; i < line.length; i ++){
            numbers[i] = Integer.parseInt(line[i]);
        }

        // 2 1 1 2 3 3 2 2 2 1
        int counter = 0;
        int max = 0;
        int[] result = null;

        for (int i = 0; i < numbers.length - 1; i ++){
            if (numbers[i] == numbers[i + 1]){
                counter ++;
                if (counter > max){
                    max = counter;
                    result = new int[max + 1];
                    for (int j = 0; j < result.length; j ++){
                        result[j] = numbers[i];
                    }
                }
            }
            else {
                counter = 0;
            }
        }
        for (int j = 0; j < result.length; j ++){
            System.out.print(result[j] + " ");
        }
    }
}
