package Exercise;

import java.util.Scanner;

public class TennisRanklist {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int tournaments = Integer.parseInt(scanner.nextLine());
        double points = Double.parseDouble(scanner.nextLine());

        double win = 0;
        double pointsLeft = points;

        for (int i = 0; i < tournaments; i ++){
            String result = scanner.nextLine();
            switch (result){
                case "W":
                    points += 2000;
                    win ++;
                    break;
                case "F":
                    points += 1200;
                    break;
                case "SF":
                    points += 720;
                    break;
            }
        }
        System.out.printf("Final points: %.0f\n",points);
        System.out.printf("Average points: %.0f\n",Math.floor((points - pointsLeft) / tournaments));
        System.out.printf("%.2f%%",win / tournaments * 100);



    }
}
