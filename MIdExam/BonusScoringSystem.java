import java.util.Scanner;

public class BonusScoringSystem {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int students = Integer.parseInt(scanner.nextLine());
        int lectures = Integer.parseInt(scanner.nextLine());
        int additionalBonus = Integer.parseInt(scanner.nextLine());
        double attendances ;
        double totalBonus;
        double maxBonus = Integer.MIN_VALUE;
        double attendancesHolder = 0;

        for (int i = 0; i < students; i++) {
            attendances = Double.parseDouble(scanner.nextLine());
            totalBonus = Math.round(attendances / lectures * (5 +additionalBonus));
            if (totalBonus > maxBonus){
                maxBonus = totalBonus;
                attendancesHolder = attendances;
            }
        }

        maxBonus = Math.ceil(maxBonus);
        attendancesHolder = Math.ceil(attendancesHolder);
        System.out.printf("Max Bonus: %.0f.\n",maxBonus);
        System.out.printf("The student has attended %.0f lectures.",attendancesHolder);
    }
}
