package ExamPreparation;

import java.util.Scanner;

public class ComputerStore {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        double priceWithoutTax;
        double taxPrice;
        double sum = 0;
        double sumWithoutTax = 0;
        double taxes = 0;

        while (true) {
            if (command.equals("special") || command.equals("regular")) {
                break;
            }
            else {

                priceWithoutTax = Double.parseDouble(command);
                if (priceWithoutTax < 0) {
                    System.out.println("Invalid price!");
                }
                else {
                    taxPrice = priceWithoutTax + priceWithoutTax * 0.2;
                    taxes += priceWithoutTax * 0.2;
                    sumWithoutTax += priceWithoutTax;
                    sum += taxPrice;
                }
                command = scanner.nextLine();
            }
        }

        if (command.equals("special")) {
            sum = sum - sum * 0.1;
        }

        if (sum == 0) {
            System.out.println("Invalid order!");
        }
        else {
            System.out.println("Congratulations you've just bought a new computer!");
            System.out.printf("Price without taxes: %.2f$\n", sumWithoutTax);
            System.out.printf("Taxes: %.2f$\n", taxes);
            System.out.println("-----------");
            System.out.printf("Total price: %.2f$", sum);
        }
    }
}
