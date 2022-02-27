import java.util.Scanner;

public class Graduation {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        double sum = 0;
        int end = 0;

        for (int i = 0; i < 12; i++){
            double grade = Double.parseDouble(scanner.nextLine());
            if (grade < 4){
                end ++;
            }
            if (grade >= 4 || end <= 1){
                sum += grade;
            }
            else{
                System.out.printf("%s has been excluded at %d grade", name,i);
            }
        }
        System.out.printf("%s graduated. Average grade: %.2f",name,sum/12);
    }
}
