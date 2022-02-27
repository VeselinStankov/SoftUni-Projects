import java.util.Scanner;

public class PCStore {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double processorPrice = Double.parseDouble(scanner.nextLine());
        double videoCardPrice = Double.parseDouble(scanner.nextLine());
        double ramPrice = Double.parseDouble(scanner.nextLine());
        int ramCount = Integer.parseInt(scanner.nextLine());
        double discount = Double.parseDouble(scanner.nextLine());

        double moneyNeeded = (processorPrice + videoCardPrice -( ( processorPrice + videoCardPrice ) * discount )) + ramPrice * ramCount;
        double moneyInLv = moneyNeeded * 1.57;

        System.out.printf("Money needed - %.2f leva.",moneyInLv);

    }
}
