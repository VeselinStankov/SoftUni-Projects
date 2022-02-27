package Exercise;

import java.util.Scanner;

public class Salary {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        double salary = Double.parseDouble(scanner.nextLine());

        for (int i = 0; i < n; i ++){
            String tab = scanner.nextLine();
            switch (tab){
                case "Facebook":
                    salary -= 150;
                    break;
                case "Instagram":
                    salary -= 100;
                    break;
                case "Reddit":
                    salary -= 50;
                    break;
            }
        }
        if ( salary <= 0){
            System.out.println("You have lost your salary.");
        }
        else {
            System.out.printf("%.0f",salary);
        }

    }
}
