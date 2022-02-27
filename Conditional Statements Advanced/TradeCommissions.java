import java.util.Scanner;

public class TradeCommissions {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String city = scanner.nextLine();
        double s = Double.parseDouble(scanner.nextLine());

        if (s >= 0 && s <= 500){

            switch (city){
                case "Sofia":
                    System.out.printf("%.2f" , s * 0.05);
                    break;
                case "Varna":
                    System.out.printf("%.2f" , s * 0.045);
                    break;
                case "Plovdiv":
                    System.out.printf("%.2f" , s * 0.055);
                    break;
                default:
                    System.out.println("error");
                    break;
            }

        }

        else if (s > 500 && s <= 1000){

            switch (city){
                case "Sofia":
                    System.out.printf("%.2f" , s * 0.07);
                    break;
                case "Varna":
                    System.out.printf("%.2f" , s * 0.075);
                    break;
                case "Plovdiv":
                    System.out.printf("%.2f" , s * 0.08);
                    break;
                default:
                    System.out.println("error");
                    break;
            }

        }

        else if (s > 1000 && s <= 10000){

            switch (city){
                case "Sofia":
                    System.out.printf("%.2f" , s * 0.08);
                    break;
                case "Varna":
                    System.out.printf("%.2f" , s * 0.1);
                    break;
                case "Plovdiv":
                    System.out.printf("%.2f" , s * 0.12);
                    break;
                default:
                    System.out.println("error");
                    break;
            }

        }

        else if (s > 10000){

            switch (city){
                case "Sofia":
                    System.out.printf("%.2f" , s * 0.12);
                    break;
                case "Varna":
                    System.out.printf("%.2f" , s * 0.13);
                    break;
                case "Plovdiv":
                    System.out.printf("%.2f" , s * 0.145);
                    break;
                default:
                    System.out.println("error");
                    break;
            }

        }
        else System.out.println("error");

    }
}
