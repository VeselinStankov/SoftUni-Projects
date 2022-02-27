package Exercises;

import java.util.Scanner;

public class SumSeconds {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int sec1 = Integer.parseInt(scanner.nextLine());
        int sec2 = Integer.parseInt(scanner.nextLine());
        int sec3 = Integer.parseInt(scanner.nextLine());
        int secAll = sec1 + sec2 + sec3;
        int minutes = secAll / 60;
        int seconds = secAll % 60;

        System.out.printf(minutes+":");

        if ( seconds < 10){
            System.out.println("0"+seconds);
        }
        else System.out.println(seconds);

    }
}
