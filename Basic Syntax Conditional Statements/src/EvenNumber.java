import java.util.Scanner;

public class EvenNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number;

        while (true){

            number = Integer.parseInt(scanner.nextLine());

            if (number % 2 == 0){
                System.out.println("The number is: " + Math.abs(number));
                break;
            }
            else {
                System.out.println("Please write an even number.");
            }
        }

    }
}
