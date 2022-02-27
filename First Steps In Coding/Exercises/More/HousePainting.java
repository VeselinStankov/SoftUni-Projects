package Exercises.More;

import java.util.Scanner;

public class HousePainting {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double x = Double.parseDouble(scanner.nextLine());
        double y = Double.parseDouble(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());

        double areaFB = ( ( x * x ) * 2 ) - 2 * 1.2;
        double areaS = ( ( x * y ) * 2 ) - 2 * ( 1.5 * 1.5 );
        double areaR = 2 * ( x * y ) + 2 * ( ( x *  h ) / 2 );

        double greenUsed = ( areaFB + areaS ) / 3.4;
        double redUsed = areaR / 4.3;

        System.out.printf("%.2f", greenUsed);
        System.out.println("");
        System.out.printf("%.2f", redUsed);

    }
}
