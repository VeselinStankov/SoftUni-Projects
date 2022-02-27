package More;

import java.util.Scanner;

public class Vacation {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        String place = "";
        String location = "";

        if (budget <= 1000){
            place = "Camp";
            if (season.equals("Summer")){
                location = "Alaska";
                budget = budget * 0.65;
            }
            else {
                location = "Morocco";
                budget = budget * 0.45;
            }
        }
        else if (budget <= 3000){
            place = "Hut";
            if (season.equals("Summer")){
                location = "Alaska";
                budget = budget * 0.8;
            }
            else {
                location = "Morocco";
                budget = budget * 0.6;
            }
        }
        else {
            place = "Hotel";
            if (season.equals("Summer")){
                location = "Alaska";
                budget = budget * 0.9;
            }
            else {
                location = "Morocco";
                budget = budget * 0.9;
            }
        }
        System.out.printf("%s - %s - %.2f",location,place,budget);
    }
}
