package More;

import java.util.Scanner;

public class FlowerShop {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int magnolii = Integer.parseInt(scanner.nextLine());
        int zumbuli = Integer.parseInt(scanner.nextLine());
        int rozi = Integer.parseInt(scanner.nextLine());
        int cactusi = Integer.parseInt(scanner.nextLine());
        double giftPrice = Double.parseDouble(scanner.nextLine());

        double income = (magnolii * 3.25 + zumbuli * 4 + rozi * 3.50 + cactusi * 8) - ((magnolii * 3.25 + zumbuli * 4 + rozi * 3.50 + cactusi * 8) * 0.05);

        if (income >= giftPrice){
            System.out.printf("She is left with %.0f leva.",Math.floor(income - giftPrice));
        }
        else {
            System.out.printf("She will have to borrow %.0f leva.",Math.ceil(giftPrice - income));
        }

    }
}
