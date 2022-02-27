package Exercise.More;

import java.util.Arrays;
import java.util.Scanner;

public class EncryptAndSortAndPrintArray {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        String input;
        char[] vowels = {'a','e','o','u','i','A','E','O','U','I'};
        char symbol;
        int[] sum = new int[n];
        boolean flag = false;
        int k;

        for (int i = 0; i < n; i ++){
            input = scanner.nextLine();
            for (int j = 0; j < input.length(); j++){
                symbol = input.charAt(j);
                for (k = 0; k < vowels.length; k ++){
                    if (vowels[k] == symbol){
                        flag = true;
                        sum[i] += symbol * input.length();
                        break;
                    }
                }
                if (!flag){
                    sum[i] += symbol / input.length();
                }
                flag = false;
            }
        }

        Arrays.sort(sum);

        for (int j : sum) {
            System.out.println(j);
        }
    }
}
