package Exercise.More;

import java.util.Scanner;

public class FromLeftToTheRight {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        String number2;
        String number1;
        long biggerNum;
        long sum = 0;
        long digit;
        long num1;
        long num2;
        String biggerNumHolder;


        for (int i = 0; i < n; i ++){

            number1 = scanner.next();
            number2 = scanner.next();
            num1 = Long.parseLong(number1);
            num2 = Long.parseLong(number2);

            if (num1 >= num2){
                biggerNum = num1;
            }
            else {
                biggerNum = num2;
            }

            biggerNumHolder = Long.toString(biggerNum);

            for (int j = 0;j < biggerNumHolder.length(); j ++){

                    digit = biggerNum % 10;
                    sum += digit;
                    biggerNum /= 10;

            }
            System.out.println(Math.abs(sum));
            sum = 0;
        }
    }
}
