import java.util.Scanner;

public class AccountBalance {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String number = scanner.nextLine();
        double balance = 0;

        while (!(number.equals("NoMoreMoney"))){

            double money = Double.parseDouble(number);
            if (money > 0) {
                balance += money;
                System.out.printf("Increase: %.2f\n",money);
            }
            else {
                System.out.println("Invalid operation!");
                break;
            }
            number = scanner.nextLine();
        }
        System.out.printf("Total: %.2f",balance);

    }
}
