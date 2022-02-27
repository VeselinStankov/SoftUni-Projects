import java.util.Scanner;

public class FootballKit {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double shirtPrice = Double.parseDouble(scanner.nextLine());
        double target = Double.parseDouble(scanner.nextLine());

        double shortPrice = shirtPrice * 0.75;
        double sockPrice = shortPrice * 0.2;
        double bootsPrice = (shirtPrice + shortPrice) * 2;

        double total = shirtPrice + shortPrice + sockPrice + bootsPrice - ((shirtPrice + shortPrice + sockPrice + bootsPrice) * 0.15);

        if (total >= target){
            System.out.println("Yes, he will earn the world-cup replica ball!");
            System.out.printf("His sum is %.2f lv.",total);
        }
        else {
            System.out.println("No, he will not earn the world-cup replica ball.");
            System.out.printf("He needs %.2f lv. more.",target - total);
        }
    }
}
