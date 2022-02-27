import java.util.Scanner;

public class MaxNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String number = scanner.nextLine();
        int max = -10000000;

        while (!number.equals("Stop")){
            int num = Integer.parseInt(number);
            if (num > max){
                max = num;
            }
            number = scanner.nextLine();
        }
        System.out.println(max);

    }
}
