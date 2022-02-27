package Exercise;

import java.util.Scanner;

public class WaterOverflow {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int tankCapacity = 0;
        int water;

        for (int i = 0; i < n; i ++){
            water = Integer.parseInt(scanner.nextLine());
            tankCapacity += water;
            if (tankCapacity > 255){
                System.out.println("Insufficient capacity!");
                tankCapacity -= water;
            }
        }

        System.out.println(tankCapacity);

    }
}
