import java.util.Scanner;

public class EvenAndOddSubtraction {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();
        String [] numbersAsStrings = line.split(" ");
        int oddSum = 0;
        int evenSum = 0;

        for (int i = 0; i< numbersAsStrings.length; i ++){
            if (Integer.parseInt(numbersAsStrings[i]) % 2 == 0){
                evenSum += Integer.parseInt(numbersAsStrings[i]);
            }
            else {
                oddSum += Integer.parseInt(numbersAsStrings[i]);
            }
        }

        System.out.println(evenSum - oddSum);

    }
}
