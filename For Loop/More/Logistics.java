package More;

import java.util.Scanner;

public class Logistics {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int loads = Integer.parseInt(scanner.nextLine());
        int tons;
        int allTons = 0;
        double allMoney = 0;

        double microBusMoney = 0;
        double truckMoney = 0;
        double trainMoney = 0;
        double microBusTons = 0;
        double truckTons = 0;
        double trainTons = 0;
        double microBusPercentage;
        double truckPercentage;
        double trainPercentage;


        for (int i = 1; i <= loads; i++){
            tons = Integer.parseInt(scanner.nextLine());
            allTons += tons;
            if (tons <= 3){
                microBusMoney += tons * 200;
                microBusTons += tons;
            }
            else if (tons <= 11){
                truckMoney += tons * 175;
                truckTons += tons;
            }
            else {
                trainMoney += tons * 120;
                trainTons += tons;
            }
        }
        allMoney = trainMoney + truckMoney + microBusMoney;
        microBusPercentage = microBusTons / allTons * 100;
        truckPercentage = truckTons / allTons * 100;
        trainPercentage = trainTons / allTons * 100;

        System.out.printf("%.2f\n",allMoney / allTons);
        System.out.printf("%.2f%%\n",microBusPercentage);
        System.out.printf("%.2f%%\n",truckPercentage);
        System.out.printf("%.2f%%\n",trainPercentage);
    }
}
