package Exercise;

import java.util.Scanner;

public class Vacation {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double moneyNeeded = Double.parseDouble(scanner.nextLine());
        double savings = Double.parseDouble(scanner.nextLine());

        int dayCounter = 0;
        int spendingDayCounter = 0;

        while (savings < moneyNeeded){
            String choose = scanner.nextLine();
            double chosenSum = Double.parseDouble(scanner.nextLine());
            dayCounter ++;
            if (choose.equals("save")){
                savings += chosenSum;
                spendingDayCounter = 0;
            }
            else if (choose.equals("spend")){
                double left = savings -= chosenSum;
                if (left < 0){
                    left = 0;
                    savings = left;
                }
                spendingDayCounter ++;
            }
            if (spendingDayCounter >= 5){
                System.out.println("You can't save the money.");
                System.out.println(dayCounter);
                break;
            }
        }
        if (moneyNeeded <= savings){
            System.out.printf("You saved the money for %d days.",dayCounter);
        }

    }
}
