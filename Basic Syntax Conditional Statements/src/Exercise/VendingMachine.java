package Exercise;

import java.util.Scanner;

public class VendingMachine {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input;
        double coins;
        double money = 0;
        boolean flag = false;
        int counter = 0;

        while (true){
            input = scanner.nextLine();
            if (input.equals("Start")){
                flag = true;
            }
            else if (!flag){
                coins = Double.parseDouble(input);
                switch (input) {
                    case "0.1":
                    case "2":
                    case "1":
                    case "0.5":
                    case "0.2":
                        money += coins;
                        break;
                    default:
                        System.out.printf("Cannot accept %.2f\n", coins);
                        break;
                }
            }

            if (flag && input.equals("End")){
                System.out.printf("Change: %.2f", money);
                break;
            }
            else if (input.equals("Start")){
                counter ++;
            }
            else if (flag && counter > 0){
                switch (input){
                    case "Nuts":
                        if (money >= 2){
                            money -= 2;
                            System.out.println("Purchased " + input);
                        }
                        else {
                            System.out.println("Sorry, not enough money");
                        }
                        break;
                    case "Water":
                        if (money >= 0.7){
                            money -= 0.7;
                            System.out.println("Purchased " + input);
                        }
                        else {
                            System.out.println("Sorry, not enough money");
                        }
                        break;
                    case "Crisps":
                        if (money >= 1.5){
                            money -= 1.5;
                            System.out.println("Purchased " + input);
                        }
                        else {
                            System.out.println("Sorry, not enough money");
                        }
                        break;
                    case "Soda":
                        if (money >= 0.8){
                            money -= 0.8;
                            System.out.println("Purchased " + input);
                        }
                        else {
                            System.out.println("Sorry, not enough money");
                        }
                        break;
                    case "Coke":
                        if (money >= 1){
                            money -= 1;
                            System.out.println("Purchased " + input);
                        }
                        else {
                            System.out.println("Sorry, not enough money");
                        }
                        break;
                    default:
                        System.out.println("Invalid product");
                }
            }
        }

    }
}
