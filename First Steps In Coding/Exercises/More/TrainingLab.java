package Exercises.More;

import java.util.Scanner;

public class TrainingLab {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double w = Double.parseDouble(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());

        double desksH = ( h - 1 ) / 0.7;
        double deskW = w / 1.2;

        int valueH = (int)desksH;
        int valueW = (int)deskW;

        int result = valueH * valueW - 3;

        System.out.println(result);
    }
}
