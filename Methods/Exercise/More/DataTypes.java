package Exercise.More;

import java.util.Scanner;

public class DataTypes {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        switch (input) {

            case "int":
                int a = Integer.parseInt(scanner.nextLine());
                System.out.println(a * 2);
                break;
            case "real":
                double b = Double.parseDouble(scanner.nextLine());
                System.out.printf("%.2f",b * 1.5);
                break;
            case "string":
                String c = scanner.nextLine();
                System.out.printf("$%s$",c);
                break;
        }
    }
}
