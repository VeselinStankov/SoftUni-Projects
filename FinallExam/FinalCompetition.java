import java.util.Scanner;

public class FinalCompetition {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int people = Integer.parseInt(scanner.nextLine());
        double points = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        String place = scanner.nextLine();

        double moneyPrice = 0;

        switch (place){
            case "Bulgaria":
                moneyPrice = points * people;
                if (season.equals("summer")){
                    moneyPrice -= moneyPrice * 0.05;
                }
                else if (season.equals("winter")){
                    moneyPrice -= moneyPrice * 0.08;
                }
                break;
            case "Abroad":
                moneyPrice = points * people;
                moneyPrice += moneyPrice * 0.5;
                if (season.equals("summer")){
                    moneyPrice -= moneyPrice * 0.1;
                }
                else if (season.equals("winter")){
                    moneyPrice -= moneyPrice * 0.15;
                }
                break;
        }
        double charity = moneyPrice * 0.75;

        System.out.printf("Charity - %.2f\n",charity);
        System.out.printf("Money per dancer - %.2f",(moneyPrice - charity)/people);

    }
}
