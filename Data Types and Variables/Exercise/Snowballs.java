package Exercise;

import java.util.Scanner;

public class Snowballs {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int snow;
        int time;
        int quality;

        double value;
        double maxValue = 0;
        int snowHolder = 0;
        int timeHolder = 0;
        int qualityHolder = 0;

        for (int i = 0; i < n; i++) {

            snow = Integer.parseInt(scanner.nextLine());
            time = Integer.parseInt(scanner.nextLine());
            quality = Integer.parseInt(scanner.nextLine());


            value = Math.pow(((double) snow / time),quality);

            if (value >= maxValue){
                maxValue = value;
                snowHolder = snow;
                timeHolder = time;
                qualityHolder = quality;
            }
        }
        System.out.printf("%d : %d = %.0f (%d)",snowHolder,timeHolder,maxValue,qualityHolder);
    }
}
