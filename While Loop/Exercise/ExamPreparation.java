package Exercise;

import java.util.Scanner;

public class ExamPreparation {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int badGrades = Integer.parseInt(scanner.nextLine());
        int grade;

        int score = 0;
        int badCounter = 0;
        double gradeCounter = 0;
        String lastProblem = "";


        while (badCounter < badGrades){
            String task = scanner.nextLine();
            if (!task.equals("Enough")){
                lastProblem = task;
            }
            if (task.equals("Enough")) {
                System.out.printf("Average score: %.2f\n",score / gradeCounter);
                System.out.printf("Number of problems: %.0f\n",gradeCounter);
                System.out.printf("Last problem: %s",lastProblem);
                break;
            }
            grade = Integer.parseInt(scanner.nextLine());
            gradeCounter ++;

            if (grade <= 4){
                badCounter ++;
            }
            if (badCounter >= badGrades){
                System.out.printf("You need a break, %d poor grades.", badCounter);
                break;
            }
            score += grade;
        }
    }
}
