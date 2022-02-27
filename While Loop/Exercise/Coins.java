package Exercise;

import java.util.Scanner;

public class Coins {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double changeOriginal = Double.parseDouble(scanner.nextLine());

        double change = changeOriginal * 100;
        int coins = 0;

        while (change > 0) {

            if (change >= 200) {
                coins++;
                change -= 200;
                continue;
            }
            else if (change >= 100){
                coins ++;
                change -= 100;
                continue;
            }
            else if (change >= 50){
                coins ++;
                change -= 50;
                continue;
            }
            else if (change >= 20){
                coins ++;
                change -= 20;
                continue;
            }
            else if (change >= 10){
                coins ++;
                change -= 10;
                continue;
            }
            else if (change >= 5){
                coins ++;
                change -= 5;
                continue;
            }
            else if (change >= 2){
                coins ++;
                change -= 2;
                continue;
            }
            else if (change >= 1){
                coins ++;
                change -= 1;
                continue;
            }
         break;
        }
        System.out.println(coins);
    }
}
