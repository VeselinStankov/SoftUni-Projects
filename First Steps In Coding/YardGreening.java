import java.util.Scanner;

public class YardGreening {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double greenedMeters = Double.parseDouble(scanner.nextLine());
        double finalPrice = greenedMeters * 7.61;
        double discount = finalPrice * 0.18;
        finalPrice = finalPrice - discount;

        System.out.println("The final price is: " + finalPrice + " lv.");
        System.out.println("The discount is: " + discount + " lv.");
    }
}