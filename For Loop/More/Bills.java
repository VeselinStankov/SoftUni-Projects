package More;

import java.util.Scanner;

public class Bills {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int months = Integer.parseInt(scanner.nextLine());
        double powerBill;
        double electricityBill = 0;
        double otherBills = 0;


        for (int i = 1; i <= months; i ++){
            powerBill = Double.parseDouble(scanner.nextLine());
            electricityBill += powerBill;
            otherBills += powerBill + 35 +((powerBill + 20 + 15) * 0.2);
        }

        System.out.printf("Electricity: %.2f lv\n",electricityBill);
        System.out.printf("Water: %.2f lv\n",months * 20.0);
        System.out.printf("Internet: %.2f lv\n",months * 15.0);
        System.out.printf("Other: %.2f lv\n",otherBills);
        System.out.printf("Average: %.2f lv\n",(electricityBill + (months * 20) + (months * 15) + otherBills) / months);

    }
}
