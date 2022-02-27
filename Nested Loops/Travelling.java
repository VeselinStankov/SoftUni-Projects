import java.util.Scanner;

public class Travelling {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.next();
        double money = 0;
        double sum = 0;
        double moneyNeeded;

        while (!input.equals("End")){
            moneyNeeded = scanner.nextDouble();
            while (money < moneyNeeded) {
                sum = scanner.nextDouble();
                money += sum;
            }
            System.out.println("Going to " + input + "!");
            money = 0;
            input = scanner.next();
        }
    }
}
