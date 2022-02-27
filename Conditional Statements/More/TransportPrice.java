package More;

import java.util.Scanner;

public class TransportPrice {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int kilometers = Integer.parseInt(scanner.nextLine());
        String dayOrNight = scanner.nextLine();

        double taxi = 0;
        double train = 0;
        double bus = 0;

        if (kilometers >= 20){
            bus = 0.09 * kilometers;
        }
        else{
            bus = 9999;
        }
        if (kilometers >= 100){
            train = 0.06 * kilometers;
        }
        else {
            train = 9999;
        }
        switch (dayOrNight){
            case "day":
                taxi = 0.70 + 0.79 * kilometers;
                if (kilometers >= 20){
                    bus = 0.09 * kilometers;
                }
                if (kilometers >= 100){
                    train = 0.06 * kilometers;
                }
                break;
            case "night":
                taxi = 0.70 + 0.90 * kilometers;
                if (kilometers >= 20){
                    bus = 0.09 * kilometers;
                }
                if (kilometers >= 100){
                    train = 0.06 * kilometers;
                }
                break;
        }
        if (taxi < bus && taxi < train){
            System.out.printf("%.2f",taxi);
        }
        else if (bus < taxi && bus < train){
            System.out.printf("%.2f",bus);
        }
        else if (train < taxi && train < bus){
            System.out.printf("%.2f",train);
        }
    }
}
