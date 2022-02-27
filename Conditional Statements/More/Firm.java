package More;

import java.util.Scanner;

public class Firm {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int hoursNeeded = Integer.parseInt(scanner.nextLine());
        int days = Integer.parseInt(scanner.nextLine());
        int workers = Integer.parseInt(scanner.nextLine());
        double workingDays = days * 0.9 * 8;
        double workingHours = workers * 2 * days + workingDays ;
        double floor = Math.floor(workingHours);

        if (workingHours >= hoursNeeded){
            System.out.printf("Yes!%.0f hours left.",floor - hoursNeeded);
        }
        else {
            System.out.printf("Not enough time!%.0f hours needed.", hoursNeeded - floor);
        }
    }
}
