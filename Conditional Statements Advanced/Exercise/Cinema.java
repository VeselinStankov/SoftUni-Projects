package Exercise;

import java.util.Scanner;

public class Cinema {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String type = scanner.nextLine();
        int r = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());

        switch (type){

            case "Premiere":
                System.out.printf("%.2f leva" ,r*c*12.00);
                break;
            case "Normal":
                System.out.printf("%.2f leva" ,r*c*7.50);
                break;
            case "Discount":
                System.out.printf("%.2f leva" ,r*c*5.00);
                break;

        }
    }
}
