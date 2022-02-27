import java.util.Scanner;

public class NumberSequence {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int count = Integer.parseInt(scanner.nextLine());
        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;

        for (int number = 0; number < count; number++){
            int value = Integer.parseInt(scanner.nextLine());
            if (value < smallest){
                smallest = value;
            }
            if (value > largest){
                largest = value;
            }
        }
        System.out.printf("Max number: %d%n",largest);
        System.out.printf("Min number: %d",smallest);
    }
}
