package Exercise;

import java.util.Scanner;

public class Orders {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        double pricePerCapsule;
        int days;
        int capsulesCount;
        double totalPrice = 0;
        double singlePrice;

        for (int i = 0; i < n; i ++){
            pricePerCapsule = Double.parseDouble(scanner.nextLine());
            days = Integer.parseInt(scanner.nextLine());
            capsulesCount = Integer.parseInt(scanner.nextLine());
            singlePrice = ((days * capsulesCount) * pricePerCapsule);
            totalPrice += singlePrice;
            System.out.printf("The price for the coffee is: $%.2f\n",singlePrice);
        }

        System.out.printf("Total: $%.2f",totalPrice);
    }
}
