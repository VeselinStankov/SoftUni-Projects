import java.util.Scanner;

public class MultiplyEvensByOdds {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int input = Math.abs(Integer.parseInt(scanner.nextLine()));
        String number = Integer.toString(input);
        int evenSum = 0;
        int oddSum = 0;

        for (int i = 0; i < number.length(); i ++){
            if (Character.getNumericValue(number.charAt(i)) % 2 == 0){
                evenSum += Character.getNumericValue(number.charAt(i));
            }
            else {
                oddSum += Character.getNumericValue(number.charAt(i));
            }
        }

        System.out.println(evenSum * oddSum);



    }
}
