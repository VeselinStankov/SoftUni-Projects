import java.util.Scanner;

public class SmallShop {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String drink = scanner.nextLine();
        String city = scanner.nextLine();
        double count = Double.parseDouble(scanner.nextLine());

        if (city.equals("Sofia")) {

            switch (drink) {
                case "coffee":
                    System.out.println(0.50 * count);
                    break;
                case "water":
                    System.out.println(0.80 * count);
                    break;
                case "beer":
                    System.out.println(1.20 * count);
                    break;
                case "sweets":
                    System.out.println(1.45 * count);
                    break;
                case "peanuts":
                    System.out.println(1.60 * count);
                    break;
            }

        } else if (city.equals("Plovdiv")) {

            switch (drink) {
                case "coffee":
                    System.out.println(0.40 * count);
                    break;
                case "water":
                    System.out.println(0.70 * count);
                    break;
                case "beer":
                    System.out.println(1.15 * count);
                    break;
                case "sweets":
                    System.out.println(1.30 * count);
                    break;
                case "peanuts":
                    System.out.println(1.50 * count);
                    break;
            }

        } else if (city.equals("Varna")) {

            switch (drink) {
                case "coffee":
                    System.out.println(0.45 * count);
                    break;
                case "water":
                    System.out.println(0.70 * count);
                    break;
                case "beer":
                    System.out.println(1.10 * count);
                    break;
                case "sweets":
                    System.out.println(1.35 * count);
                    break;
                case "peanuts":
                    System.out.println(1.55 * count);
                    break;
            }

        }
    }
}
