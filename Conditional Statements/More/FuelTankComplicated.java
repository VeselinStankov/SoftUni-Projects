package More;

import java.util.Scanner;

public class FuelTankComplicated {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String typeOfFuel = scanner.nextLine();
        double litersFuel = Double.parseDouble(scanner.nextLine());
        String card = scanner.nextLine();

        double gasPrice = 0;
        double gasolinePrice = 0;
        double dieselPrice = 0;

        switch (typeOfFuel){
            case "Gas":
                gasPrice = litersFuel * 0.93;
                if (card.equals("Yes")){
                    gasPrice -= litersFuel * 0.08;
                }
                if (litersFuel >= 20 && litersFuel <= 25){
                    gasPrice -= gasPrice * 0.08;
                }
                if (litersFuel > 25){
                    gasPrice -= gasPrice * 0.1;
                }
                System.out.printf("%.2f lv.",gasPrice);
                break;
            case "Gasoline":
                gasolinePrice = litersFuel * 2.22;
                if (card.equals("Yes")){
                    gasolinePrice -= litersFuel * 0.18;
                }
                if (litersFuel >= 20 && litersFuel <= 25){
                    gasolinePrice -= gasolinePrice * 0.08;
                }
                if (litersFuel > 25){
                    gasolinePrice -= gasolinePrice * 0.1;
                }
                System.out.printf("%.2f lv.",gasolinePrice);
                break;
            case "Diesel":
                dieselPrice = litersFuel * 2.33;
                if (card.equals("Yes")){
                    dieselPrice -= litersFuel * 0.12;
                }
                if (litersFuel >= 20 && litersFuel <= 25){
                    dieselPrice -= dieselPrice * 0.08;
                }
                if (litersFuel > 25){
                    dieselPrice -= dieselPrice * 0.1;
                }
                System.out.printf("%.2f lv.",dieselPrice);
                break;
        }
    }
}
