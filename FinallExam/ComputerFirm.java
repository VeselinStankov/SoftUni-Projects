import java.util.Scanner;

public class ComputerFirm {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        double sales = 0;
        double sum = 0;
        double sumRating = 0;

        for (int i = 0; i < n; i ++){
            double salesRating = Double.parseDouble(scanner.nextLine());
            double rating = salesRating % 10;
            sumRating += rating;
            double possibleSales = salesRating / 10;
            possibleSales -= possibleSales % 10;


            if (rating == 2){
                sales = 0;
            }
            else if (rating == 3){
                sales = possibleSales * 0.5;
            }
            else if (rating == 4){
                sales = possibleSales * 0.7;
            }
            else if (rating == 5){
                sales = possibleSales * 0.85;
            }
            else if (rating == 6){
                sales = possibleSales;
            }
            sum += sales;
        }
        System.out.printf("%.2f\n",sum);
        System.out.printf("%.2f",sumRating / n);
    }
}
