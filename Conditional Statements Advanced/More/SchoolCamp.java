package More;

import java.util.Scanner;

public class SchoolCamp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String season = scanner.nextLine();
        String groupType = scanner.nextLine();
        int groupCount = Integer.parseInt(scanner.nextLine());
        int nights = Integer.parseInt(scanner.nextLine());
        String sport = " ";
        double price = 0;

        switch (season){
            case "Spring":
                if (groupType.equals("mixed")){
                    price = 9.50 * nights * groupCount;
                    sport = "Cycling";
                }
                else if (groupType.equals("boys")){
                    price = 7.20 * nights * groupCount;
                    sport = "Tennis";
                }
                else{
                    price = 7.20 * nights * groupCount;
                    sport = "Athletics";
                }
                break;
            case "Summer":
                if (groupType.equals("mixed")){
                    price = 20 * nights * groupCount;
                    sport = "Swimming";
                }
                else if (groupType.equals("boys")){
                    price = 15 * nights * groupCount;
                    sport = "Football";
                }
                else {
                    price = 15 * nights * groupCount;
                    sport = "Volleyball";
                }
                break;
            case "Winter":
                if (groupType.equals("mixed")){
                    price = 10 * nights * groupCount;
                    sport = "Ski";
                }
                else if (groupType.equals("boys")){
                    price = 9.60 * nights * groupCount;
                    sport = "Judo";
                }
                else {
                    price = 9.60 * nights * groupCount;
                    sport = "Gymnastics";
                }
                break;
        }
        if (groupCount >= 50){
            price -= price * 0.5;
        }
        else if (groupCount >= 20){
            price -= price * 0.15;
        }
        else if (groupCount >= 10){
            price -= price * 0.05;
        }
        System.out.printf("%s %.2f lv.",sport,price);
    }
}
