package More;

import java.util.Scanner;

public class SleepyTomCat {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int holiday = Integer.parseInt(scanner.nextLine());
        int workingDays = 365 - holiday;
        int playTime = holiday * 127 + workingDays * 63;

        if (playTime > 30000){
            System.out.println("Tom will run away");
            System.out.printf("%d hours and %d minutes more for play",(playTime - 30000) / 60,(playTime - 30000) % 60);
        }
        else{
            System.out.println("Tom sleeps well");
            System.out.printf("%d hours and %d minutes less for play",(30000 - playTime) / 60,(30000 - playTime) % 60);
        }
    }
}
