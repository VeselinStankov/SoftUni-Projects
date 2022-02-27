package MyMidExam;

import java.util.Scanner;

public class ExperienceGaining {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double neededExp = Double.parseDouble(scanner.nextLine());
        int battles = Integer.parseInt(scanner.nextLine());
        double expPerBattle;
        int battleCount = 0;


        for (int i = 1; i <= battles; i++) {
            expPerBattle = Double.parseDouble(scanner.nextLine());
            if (i % 3 == 0) {
                expPerBattle += expPerBattle * 0.15;
            }
            if (i % 5 == 0) {
                expPerBattle -= expPerBattle * 0.1;
            }
            if (i % 15 == 0) {
                expPerBattle += expPerBattle * 0.05;
            }

            neededExp -= expPerBattle;
            if (neededExp <= 0){
                battleCount = i;
                break;
            }
        }
        if (neededExp <= 0) {
            System.out.println("Player successfully collected his needed experience for " + battleCount + " battles.");
        }
        else {
            System.out.printf("Player was not able to collect the needed experience, %.2f more needed.", neededExp);
        }
    }
}
