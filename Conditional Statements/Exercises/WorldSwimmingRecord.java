package Exercises;

import java.util.Scanner;

public class WorldSwimmingRecord {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double worldRecord = Double.parseDouble(scanner.nextLine());
        double metersRecord = Double.parseDouble(scanner.nextLine());
        double sekForMeter = Double.parseDouble(scanner.nextLine());

        double slowing = metersRecord / 15;
        slowing = Math.floor(slowing);
        double timeLost = slowing * 12.5;

        double time = metersRecord * sekForMeter + timeLost;

        if (time < worldRecord){
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", time);
        }
        else if ( time >= worldRecord){
            double diff = time - worldRecord;
            System.out.printf("No, he failed! He was %.2f seconds slower.",diff);
        }
    }
}
