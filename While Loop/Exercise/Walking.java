package Exercise;

import java.util.Scanner;

public class Walking {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String steps = scanner.nextLine();
        int stepsDone = 0;

        while (!steps.equals("Going home")) {
            int stepsInt = Integer.parseInt(steps);

            stepsDone += stepsInt;
            if (stepsDone >= 10000) {
                System.out.println("Goal reached! Good job!");
                System.out.printf("%d steps over the goal!\n", stepsDone - 10000);
                break;
            }
            steps = scanner.nextLine();
        }

        if (steps.equals("Going home")){
            steps = scanner.nextLine();
        int stepsInt = Integer.parseInt(steps);
        stepsDone += stepsInt;
        if (stepsDone < 10000) {
            System.out.printf("%d more steps to reach goal.", 10000 - stepsDone);
        } else {
            System.out.println("Goal reached! Good job!");
            System.out.printf("%d steps over the goal!\n", stepsDone - 10000);
        }
    }
    }
    }
