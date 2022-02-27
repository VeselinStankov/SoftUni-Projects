package More;

import java.util.Scanner;

public class Grades {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double students = Integer.parseInt(scanner.nextLine());
        double grade;
        double allGrades = 0 ;

        int grade5Counter = 0;
        int grade4Counter = 0;
        int grade3Counter = 0;
        int grade2Counter = 0;


        for (int i = 1; i <= students; i ++){
            grade = Double.parseDouble(scanner.nextLine());
            allGrades += grade;
            if (grade >= 5){
                grade5Counter ++;
            }
            else if (grade >= 4){
                grade4Counter ++;
            }
            else if (grade >= 3){
                grade3Counter ++;
            }
            else {
                grade2Counter ++;
            }
        }

        System.out.printf("Top students: %.2f%%\n",grade5Counter / students * 100);
        System.out.printf("Between 4.00 and 4.99: %.2f%%\n",grade4Counter / students * 100);
        System.out.printf("Between 3.00 and 3.99: %.2f%%\n", grade3Counter / students * 100);
        System.out.printf("Fail: %.2f%%\n",grade2Counter / students * 100);
        System.out.printf("Average: %.2f\n",allGrades / students);

    }
}
