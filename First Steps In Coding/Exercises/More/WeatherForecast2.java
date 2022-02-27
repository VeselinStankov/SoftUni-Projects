package Exercises.More;

import java.util.Scanner;

public class WeatherForecast2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String weather = scanner.nextLine();

        String a = "sunny";
        String b = "cloudy";
        String c = "snowy";

        if (weather.equals(a))
        {
            System.out.println("It's warm outside!");
        }
        else System.out.println("It's cold outside!");
    }
}
