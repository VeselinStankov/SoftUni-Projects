import java.util.Scanner;

public class SumOfOddNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int i = 0;
        int counter = 0;
        int sum = 0;

        while (counter < n){
            if (i % 2 != 0){
                System.out.println(i);
                sum += i;
                counter ++;
            }
            i ++;
        }

        System.out.println("Sum: " + sum);

    }
}
