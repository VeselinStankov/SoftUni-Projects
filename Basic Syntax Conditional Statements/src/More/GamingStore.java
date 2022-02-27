package More;

import java.util.Scanner;

public class GamingStore {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double money = Double.parseDouble(scanner.nextLine());
        double allExpenses = 0;
        String command;

        while (true){

            if (money <= 0){
                System.out.println("Out of money!");
                break;
            }

            command = scanner.nextLine();
            if (command.equals("Game Time")){
                System.out.printf("Total spent: $%.2f. Remaining: $%.2f",allExpenses,money);
                break;
            }

            switch (command){
                case "OutFall 4":
                case "RoverWatch Origins Edition":

                    if (money <= 0){
                        break;
                    }
                    else if (money < 39.99){
                        System.out.println("Too Expensive");
                        break;
                    }
                    money -= 39.99;
                    allExpenses += 39.99;
                    System.out.println("Bought " + command);
                    break;

                case "CS: OG":
                    if (money <= 0){
                        break;
                    }
                    else if (money < 15.99){
                        System.out.println("Too Expensive");
                        break;
                    }
                    money -= 15.99;
                    allExpenses += 15.99;
                    System.out.println("Bought " + command);
                    break;

                case "Zplinter Zell":
                    if (money <= 0){
                        break;
                    }
                    else if (money < 19.99){
                        System.out.println("Too Expensive");
                        break;
                    }
                    money -= 19.99;
                    allExpenses += 19.99;
                    System.out.println("Bought " + command);
                    break;

                case "Honored 2":
                    if (money <= 0){
                        break;
                    }
                    else if (money < 59.99){
                        System.out.println("Too Expensive");
                        break;
                    }
                    money -= 59.99;
                    allExpenses += 59.99;
                    System.out.println("Bought " + command);
                    break;

                case "RoverWatch":
                    if (money <= 0){
                        break;
                    }
                    else if (money < 29.99){
                        System.out.println("Too Expensive");
                        break;
                    }
                    money -= 29.99;
                    allExpenses += 29.99;
                    System.out.println("Bought " + command);
                    break;

                default:
                    System.out.println("Not Found");
                    break;
            }

        }

    }
}
