package Exercise;

import java.util.Scanner;

public class HotelRoom {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String month = scanner.nextLine();
        int days = Integer.parseInt(scanner.nextLine());

        double price;
        double discount;
        double apartmentDiscount;

        switch (month){

            case "May":
            case "October":
                double studioPrice = 50 * days;
                double apartmentPrice = 65 * days;
                if (days > 7 && days <= 14){
                    discount = studioPrice * 0.05;
                    studioPrice -= discount;
                }
                else if (days > 14){
                    discount = studioPrice * 0.3;
                    studioPrice -= discount;
                    apartmentDiscount = apartmentPrice * 0.1;
                    apartmentPrice -= apartmentDiscount;
                }
                System.out.printf("Apartment: %.2f lv.\n",apartmentPrice);
                System.out.printf("Studio: %.2f lv.",studioPrice);

                break;

            case "June":
            case "September":
                double studioPriceSummer = 75.20 * days;
                double apartmentPriceSummer = 68.70 * days;
                    if (days > 14){
                    discount = studioPriceSummer * 0.2;
                    studioPriceSummer -= discount;
                    apartmentDiscount = apartmentPriceSummer * 0.1;
                    apartmentPriceSummer -= apartmentDiscount;
                }
                System.out.printf("Apartment: %.2f lv.\n",apartmentPriceSummer);
                System.out.printf("Studio: %.2f lv.",studioPriceSummer);

                break;

            case "July":
            case "August":
                double studioPriceLate = 76 * days;
                double apartmentPriceLate = 77 * days;
                if (days > 14){
                    apartmentDiscount = apartmentPriceLate * 0.1;
                    apartmentPriceLate -= apartmentDiscount;
                }
                System.out.printf("Apartment: %.2f lv.\n",apartmentPriceLate);
                System.out.printf("Studio: %.2f lv.",studioPriceLate);

                break;

        }
    }
}
