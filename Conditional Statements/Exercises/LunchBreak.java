package Exercises;

import java.util.Scanner;

public class LunchBreak {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        double epTime = Double.parseDouble(scanner.nextLine());
        double breakTime = Double.parseDouble(scanner.nextLine());

        double lunchTime = breakTime / 8;
        double chillTime = breakTime / 4;

        double timeTaken = lunchTime + chillTime;
        double timeLeft = breakTime - timeTaken;

        if (timeLeft >= epTime){
            double left = timeLeft - epTime;
            left = Math.ceil(left);
            int value = (int)left;
            System.out.println("You have enough time to watch " + name + " and left with " + value + " minutes free time.");
        }
        if (epTime > timeLeft){
            double missing = epTime - timeLeft;
            missing = Math.ceil(missing);
            int value = (int)missing;
            System.out.println("You don't have enough time to watch " + name + ", you need " + value + " more minutes.");
        }
    }
}
