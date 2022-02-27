package More;

import java.util.Scanner;

public class Dishwasher {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int fairy = Integer.parseInt(scanner.nextLine());
        String input = "";

        int pots = 0;
        int dishes = 0;
        int counter = 0;
        int allToBeWashed = 0;
        int wash = fairy * 750;
        int dishesSum = 0;
        int potsSum = 0;
        int washed = 0;

        while (true){
            input = scanner.nextLine();
            if (input.equals("End")){
                break;
            }
            counter ++;
            if (counter % 3 == 0){
                pots = Integer.parseInt(input);
                potsSum += pots;
            }
            else {
                dishes = Integer.parseInt(input);
                dishesSum += dishes;
            }
            allToBeWashed = potsSum * 15 + dishesSum * 5;
            washed = wash - allToBeWashed;

            if (washed < 0){
                System.out.printf("Not enough detergent, %d ml. more necessary!",allToBeWashed - wash);
                break;
            }
        }

        if (allToBeWashed <= wash){
            System.out.println("Detergent was enough!");
            System.out.printf("%d dishes and %d pots were washed.\n",dishesSum,potsSum);
            System.out.printf("Leftover detergent %d ml.",wash - allToBeWashed);
        }
    }
}
