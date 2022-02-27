import java.util.Scanner;

public class MinNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String number = scanner.nextLine();
        int min = 999999999;

        while (!number.equals("Stop")){
            int num = Integer.parseInt(number);
            if (num < min){
                min = num;
            }
            number = scanner.nextLine();
        }
        System.out.println(min);

    }
}
