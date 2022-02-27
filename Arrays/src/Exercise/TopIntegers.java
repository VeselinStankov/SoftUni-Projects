package Exercise;

import java.util.Scanner;

public class TopIntegers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] line = scanner.nextLine().split(" ");

        int[] numbers = new int[line.length];

        for (int i = 0; i < line.length; i ++){
            numbers[i] = Integer.parseInt(line[i]);
        }

        boolean flag = true;
        
        for (int i = 0; i < numbers.length; i ++){
            flag = true;
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] <= numbers[j]){
                    flag = false;
                    break;
                }
            }
            if (flag){
                System.out.print(numbers[i] + " ");
            }
        }

    }
}
