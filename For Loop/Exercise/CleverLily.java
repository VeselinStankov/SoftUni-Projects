package Exercise;

import java.util.Scanner;

public class CleverLily {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int age = Integer.parseInt(scanner.nextLine());
        double washingMachinePrice = Double.parseDouble(scanner.nextLine());
        double toyPrice = Double.parseDouble(scanner.nextLine());

        double money = 0;
        double moneyAdded = 0;
        int toys = 0;

        for (int i = 1; i <= age; i++){
            if (i % 2 == 0){
                moneyAdded += 10;
                money += moneyAdded;
                money -= 1;
            }
            else {
                toys ++;
            }
        }

        money += toyPrice * toys;

        if (money > washingMachinePrice) {
            System.out.printf("Yes! %.2f", money - washingMachinePrice);
        }
        else {
            System.out.printf("No! %.2f", washingMachinePrice - money);
        }

    }
}
