import java.util.Scanner;

public class PetShop {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double dogFood = 2.50;
        int catFood = 4;
        double dogFoodNeeded = Double.parseDouble(scanner.nextLine());
        double catFoodNeeded = Double.parseDouble(scanner.nextLine());
        double dogFoodPrice = dogFoodNeeded * dogFood;
        double catFoodPrice = catFoodNeeded * catFood;
        double endPrice = catFoodPrice + dogFoodPrice;

        System.out.println(endPrice + " lv.");


    }
}
