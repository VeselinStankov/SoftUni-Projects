import java.util.Scanner;

public class OddEvenSum {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int SumEven = 0;
        int SumOdd = 0;

        for (int i = 1; i <= n; i ++){
            int numbers = Integer.parseInt(scanner.nextLine());

            if (i % 2 == 0){
                SumEven += numbers;
            }
            else{
                SumOdd += numbers;
            }
        }
        if (SumEven > SumOdd){
            int diff = SumEven - SumOdd;
            System.out.println("No");
            System.out.printf("Diff = %d",diff);
        }
        else if (SumOdd > SumEven){
            int diff = SumOdd - SumEven;
            System.out.println("No");
            System.out.printf("Diff = %d",diff);
        }
        else{
            System.out.println("Yes");
            System.out.printf("Sum = %d",SumEven);
        }
    }
}
