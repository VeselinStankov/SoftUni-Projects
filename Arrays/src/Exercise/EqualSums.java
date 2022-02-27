package Exercise;

import java.util.Scanner;

public class EqualSums {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] line = scanner.nextLine().split(" ");

        int[] numbers = new int[line.length];

        for (int i = 0; i < line.length; i ++){
            numbers[i] = Integer.parseInt(line[i]);
        }

        if (numbers.length == 1){
            System.out.println(0);
        }
        else{

            int leftSum = 0;
            int rightSum = 0;
            boolean flag = false;

            for (int i = 0; i < numbers.length; i ++) {
                for (int j = i + 1; j < numbers.length ; j ++) {
                    rightSum += numbers[j];
                }
                for (int k = i - 1; k >= 0 ; k --) {
                    leftSum += numbers[k];
                }

                if (rightSum == leftSum){
                    System.out.println(i);
                    flag = true;
                    break;
                }
                else {
                    leftSum = 0;
                    rightSum = 0;
                }
            }

            if (!flag) {
                System.out.println("no");
            }

        }

    }
}
