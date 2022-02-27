package Exercise;

import java.util.Scanner;

public class NewHouse {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String flowers = scanner.nextLine();
        int count = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());

        switch (flowers){

            case "Roses":
                if (count > 80){
                    double discount = ( count * 5 ) * 0.1;
                    double endPrice = count * 5 - discount;
                    if (endPrice > budget){
                        double missing = endPrice - budget;
                        System.out.printf("Not enough money, you need %.2f leva more.", missing);
                    }
                    else if (endPrice < budget){
                        double left = budget - endPrice;
                        System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.",count , flowers , left);
                    }
                }
                else if ( 5 * count > budget){
                    double missing = (5 * count) - budget;
                    System.out.printf("Not enough money, you need %.2f leva more.", missing);
                }
                else if ( 5 * count <= budget){
                    double left = budget - (count * 5);
                    System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.",count , flowers , left);
                }
                break;

            case "Dahlias":
                if (count > 90){
                    double discount = ( count * 3.80 ) * 0.15;
                    double endPrice = count * 3.80 - discount;
                    if (endPrice > budget){
                        double missing = endPrice - budget;
                        System.out.printf("Not enough money, you need %.2f leva more.", missing);
                    }
                    else if (endPrice < budget){
                        double left = budget - endPrice;
                        System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.",count , flowers , left);
                    }
                }
                else if ( 3.80 * count > budget){
                    double missing = (3.80 * count) - budget;
                    System.out.printf("Not enough money, you need %.2f leva more.", missing);
                }
                else if ( 3.80 * count <= budget){
                    double left = budget - (count * 3.80);
                    System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.",count , flowers , left);
                }
                break;

            case "Tulips":
                if (count > 80){
                    double discount = ( count * 2.80 ) * 0.15;
                    double endPrice = count * 2.80 - discount;
                    if (endPrice > budget){
                        double missing = endPrice - budget;
                        System.out.printf("Not enough money, you need %.2f leva more.", missing);
                    }
                    else if (endPrice < budget){
                        double left = budget - endPrice;
                        System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.",count , flowers , left);
                    }
                }
                else if ( 2.80 * count > budget){
                    double missing = (2.80 * count) - budget;
                    System.out.printf("Not enough money, you need %.2f leva more.", missing);
                }
                else if ( 2.80 * count <= budget){
                    double left = budget - (count * 2.80);
                    System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.",count , flowers , left);
                }
                break;

            case "Narcissus":
                if (count < 120){
                    double discount = ( count * 3 ) * 0.15;
                    double endPrice = count * 3 + discount;
                    if (endPrice > budget){
                        double missing = endPrice - budget;
                        System.out.printf("Not enough money, you need %.2f leva more.", missing);
                    }
                    else if (endPrice < budget){
                        double left = budget - endPrice;
                        System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.",count , flowers , left);
                    }
                }
                else if ( 3 * count > budget){
                    double missing = (3 * count) - budget;
                    System.out.printf("Not enough money, you need %.2f leva more.", missing);
                }
                else if ( 3 * count <= budget){
                    double left = budget - (count * 3);
                    System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.",count , flowers , left);
                }
                break;

            case "Gladiolus":
                if (count < 80){
                    double discount = ( count * 2.50 ) * 0.20;
                    double endPrice = count * 2.50 + discount;
                    if (endPrice > budget){
                        double missing = endPrice - budget;
                        System.out.printf("Not enough money, you need %.2f leva more.", missing);
                    }
                    else if (endPrice < budget){
                        double left = budget - endPrice;
                        System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.",count , flowers , left);
                    }
                }
                else if ( 2.50 * count > budget){
                    double missing = (2.50 * count) - budget;
                    System.out.printf("Not enough money, you need %.2f leva more.", missing);
                }
                else if ( 2.50 * count <= budget){
                    double left = budget - (count * 2.50);
                    System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.",count , flowers , left);
                }
                break;
        }

    }
}
