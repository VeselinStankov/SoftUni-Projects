package ExamPreparation;

import java.util.Scanner;

public class SoftUniReception {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int firstEmployeePerHour = Integer.parseInt(scanner.nextLine());
        int secondEmployeePerHour = Integer.parseInt(scanner.nextLine());
        int thirdEmployeePerHour = Integer.parseInt(scanner.nextLine());
        int studentCount = Integer.parseInt(scanner.nextLine());

        int studentsHandledPerHour = firstEmployeePerHour + secondEmployeePerHour + thirdEmployeePerHour;
        int hours = 0;

        while (studentCount > 0) {
            hours ++;
            if (hours % 4 != 0) {
                studentCount -= studentsHandledPerHour;
            }
        }

        System.out.println("Time needed: " + hours + "h.");


    }
}
