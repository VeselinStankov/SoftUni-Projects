package Exercise;

import java.util.Scanner;

public class SpiceMustFlow {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int startingYield = Integer.parseInt(scanner.nextLine());

        int days = 0;
        int spice = 0;

        while (startingYield >= 100){
            spice += startingYield - 26;
            days ++;
            startingYield -= 10;
        }

        if (spice >= 26) {
            spice -= 26;
        }
        else {
            spice = 0;
        }

        System.out.println(days);
        System.out.println(spice);
    }
}
