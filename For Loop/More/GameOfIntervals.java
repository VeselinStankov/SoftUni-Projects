package More;

import java.util.Scanner;

public class GameOfIntervals {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double turns = Integer.parseInt(scanner.nextLine());
        int number;
        double points = 0;

        int invalidNumbers = 0;
        int numbersTo9 = 0;
        int numbersTo19 = 0;
        int numbersTo29 = 0;
        int numbersTo39 = 0;
        int numbersTo50 = 0;

        for (int i = 1; i <= turns; i ++){
            number = Integer.parseInt(scanner.nextLine());
            if (number > 50 || number < 0){
                invalidNumbers ++;
                points /= 2;
            }
            else {
                if (number <= 9){
                    points += number * 0.2;
                    numbersTo9 ++;
                }
                else if (number <= 19){
                    points += number * 0.3;
                    numbersTo19 ++;
                }
                else if (number <= 29){
                    points += number * 0.4;
                    numbersTo29 ++;
                }
                else if (number <= 39){
                    points += 50;
                    numbersTo39 ++;
                }
                else if (number <= 50){
                    points += 100;
                    numbersTo50 ++;
                }
            }
        }
        System.out.printf("%.2f\n",points);
        System.out.printf("From 0 to 9: %.2f%%\n",numbersTo9 / turns * 100 );
        System.out.printf("From 10 to 19: %.2f%%\n",numbersTo19 / turns * 100 );
        System.out.printf("From 20 to 29: %.2f%%\n",numbersTo29 / turns * 100 );
        System.out.printf("From 30 to 39: %.2f%%\n",numbersTo39 / turns * 100 );
        System.out.printf("From 40 to 50: %.2f%%\n",numbersTo50 / turns * 100 );
        System.out.printf("Invalid numbers: %.2f%%\n",invalidNumbers / turns * 100);

    }
}
