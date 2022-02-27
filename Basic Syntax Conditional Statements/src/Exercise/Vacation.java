package Exercise;

import java.util.Scanner;

public class Vacation {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int groupCount = Integer.parseInt(scanner.nextLine());
        String groupType = scanner.nextLine();
        String day = scanner.nextLine();
        double totalPrice = 0;

        switch (day){

            case "Friday":
                if (groupType.equals("Students")){
                    totalPrice = groupCount * 8.45;
                    if (groupCount >= 30){
                        totalPrice -= totalPrice * 0.15;
                    }
                }
                else if (groupType.equals("Business")){
                    totalPrice = groupCount * 10.90;
                    if (groupCount >= 100){
                        totalPrice -= totalPrice - 10 * 10.90;
                    }
                }
                else if (groupType.equals("Regular")){
                    totalPrice = groupCount * 15;
                    if (groupCount >= 10 && groupCount <= 20){
                        totalPrice -= totalPrice * 0.05;
                    }
                }
                break;

            case "Saturday":
                if (groupType.equals("Students")){
                    totalPrice = groupCount * 9.80;
                    if (groupCount >= 30){
                        totalPrice -= totalPrice * 0.15;
                    }
                }
                else if (groupType.equals("Business")){
                    totalPrice = groupCount * 15.60;
                    if (groupCount >= 100){
                        totalPrice -= totalPrice - 10 * 15.60;
                    }
                }
                else if (groupType.equals("Regular")){
                    totalPrice = groupCount * 20;
                    if (groupCount >= 10 && groupCount <= 20){
                        totalPrice -= totalPrice * 0.05;
                    }
                }
                break;

            case "Sunday":
                if (groupType.equals("Students")){
                    totalPrice = groupCount * 10.46;
                    if (groupCount >= 30){
                        totalPrice -= totalPrice * 0.15;
                    }
                }
                else if (groupType.equals("Business")){
                    totalPrice = groupCount * 16;
                    if (groupCount >= 100){
                        totalPrice -= totalPrice - 10 * 16;
                    }
                }
                else if (groupType.equals("Regular")){
                    totalPrice = groupCount * 22.50;
                    if (groupCount >= 10 && groupCount <= 20){
                        totalPrice -= totalPrice * 0.05;
                    }
                }
                break;
        }
        System.out.printf("Total price: %.2f",totalPrice);
    }
}
