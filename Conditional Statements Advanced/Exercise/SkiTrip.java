package Exercise;

import java.util.Scanner;

public class SkiTrip {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int actualDays = Integer.parseInt(scanner.nextLine());
        String room = scanner.nextLine();
        String grade = scanner.nextLine();

        int days = actualDays - 1;
        double price;
        double discountA;
        double discountPA;

        switch (room){

            case "room for one person":
                price = 18 * days;
                if (grade.equals("positive")){
                    price = price + price * 0.25;
                }
                else if (grade.equals("negative")){
                    price = price - price * 0.1;
                }
                System.out.printf("%.2f",price);
                break;

            case "apartment":
                price = 25 * days;
                if (days < 10){
                    discountA = price * 0.3;
                    price -= discountA;
                }
                else if (days >= 10 && days <= 15){
                    discountA = price * 0.35;
                    price -= discountA;
                }
                else{
                    discountA = price * 0.5;
                    price -= discountA;
                }
                if (grade.equals("positive")){
                    price = price + price * 0.25;
                }
                else if (grade.equals("negative")){
                    price = price - price * 0.1;
                }
                System.out.printf("%.2f",price);
                break;

            case "president apartment":
                price = 35 * days;
                if (days < 10){
                    discountPA = price * 0.1;
                }
                else if (days >= 10 && days <= 15){
                    discountPA = price * 0.15;
                    price -= discountPA;
                }
                else{
                    discountPA = price * 0.2;
                    price -= discountPA;
                }
                if (grade.equals("positive")){
                    price = price + price * 0.25;
                }
                else if (grade.equals("negative")){
                    price = price - price * 0.1;
                }
                System.out.printf("%.2f",price);
                break;

        }

    }
}
