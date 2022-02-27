package Exercise;

import java.util.Scanner;

public class RageExpenses {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int lostGamesCount = Integer.parseInt(scanner.nextLine());
        double headsetPrice = Double.parseDouble(scanner.nextLine());
        double mousePrice = Double.parseDouble(scanner.nextLine());
        double keyboardPrice = Double.parseDouble(scanner.nextLine());
        double displayPrice = Double.parseDouble(scanner.nextLine());

        double totalExpenses = 0;
        boolean isHeadsetBroken = false;
        boolean isMouseBroken = false;
        boolean isKeyboardBroken = false;
        int keyboardCounter = 0;

        for (int i = 1; i <= lostGamesCount; i ++){
            if (i % 2 == 0){
                totalExpenses += headsetPrice;
                isHeadsetBroken = true;
            }
            if (i % 3 == 0){
                totalExpenses += mousePrice;
                isMouseBroken = true;
            }
            if (isHeadsetBroken && isMouseBroken){
                totalExpenses += keyboardPrice;
                isKeyboardBroken = true;
                keyboardCounter ++;
            }
            if (isKeyboardBroken && keyboardCounter % 2 == 0){
                totalExpenses += displayPrice;
            }

            isHeadsetBroken = false;
            isMouseBroken = false;
            isKeyboardBroken = false;
        }
        System.out.printf("Rage expenses: %.2f lv.",totalExpenses);

    }
}
