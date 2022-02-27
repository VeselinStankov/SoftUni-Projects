package Exercises.More;

import java.util.Scanner;

public class CelsiusToFahrenheit {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double CelsiusDegree = Double.parseDouble(scanner.nextLine());
        double Fahrenheit = ( CelsiusDegree * 9 / 5 ) + 32;

        System.out.printf("%.2f", Fahrenheit);

    }
}
