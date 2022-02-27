package More;

import java.util.Scanner;

public class ReportSystem {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int sum = Integer.parseInt(scanner.nextLine());
        String input = "";
        int money = 0;
        int moneyCash = 0;
        int moneyCard = 0;
        int allMoney = 0;
        boolean card = false;
        boolean cash = true;
        int counter = 0;
        int counterCard = 0;
        int counterCash = 0;
        double cashSum = 0;
        double cardSum = 0;

        while (true){
            cash = true;
            card = false;
            counter ++;
            input = scanner.nextLine();
            if (input.equals("End")){
                System.out.println("Failed to collect required money for charity.");
                break;
            }
            money = Integer.parseInt(input);
            if (counter % 2 == 0) {
                card = true;
                cash = false;
            }
            if (money > 100 && card){
                moneyCard = money;
                System.out.println("Product sold!");
                counterCard ++;
            }
            else if (money < 10 && card){
                System.out.println("Error in transaction!");
                continue;
            }
            else if (money > 100 && cash){
                System.out.println("Error in transaction!");
                continue;
            }
            else if (money < 10 && cash){
                moneyCash = money;
                System.out.println("Product sold!");
                counterCash ++;
            }
            else if (card){
                moneyCard = money;
                System.out.println("Product sold!");
                counterCard ++;
            }
            else if (cash){
                moneyCash = money;
                System.out.println("Product sold!");
                counterCash ++;
            }
            cashSum += moneyCash;
            cardSum += moneyCard;
            allMoney += moneyCash + moneyCard;
            moneyCash = 0;
            moneyCard = 0;
            if (allMoney >= sum){
                System.out.printf("Average CS: %.2f\n",cashSum / counterCash);
                System.out.printf("Average CC: %.2f",cardSum / counterCard);
                break;
            }
        }

    }
}
