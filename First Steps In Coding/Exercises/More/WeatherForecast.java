package Exercises.More;

import java.util.Scanner;

public class WeatherForecast {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double weather = Double.parseDouble(scanner.nextLine());

        if (weather >= 26 && weather <= 35) {
            System.out.println("Hot");
        } else if (weather <= 25.9 && weather >= 20.1)
        {
            System.out.println("Warm");
        }
        else if (weather >= 15 && weather <= 20)
        {
            System.out.println("Mild");
        }
        else if (weather >= 12 && weather <= 14.9)
        {
            System.out.println("Cool");
        }
        else if (weather <= 11.9 && weather >= 5)
        {
            System.out.println("Cold");
        }
        else System.out.println("unknown");
    }
}
