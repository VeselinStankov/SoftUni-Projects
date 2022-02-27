package Exercises;

import java.util.Scanner;

public class TimePlusMinutes {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int hour = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());
        int plus = minutes + 15;
        if ( plus >= 60){
            hour ++;
            plus -= 60;
        }
        if ( hour > 23){
            hour = 24 - hour;
        }
        if ( plus < 10){
            System.out.printf(hour + ":0" + plus);
        }
        else System.out.printf(hour + ":" + plus);
    }
}
