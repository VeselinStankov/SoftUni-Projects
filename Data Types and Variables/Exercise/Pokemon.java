package Exercise;

import java.util.Scanner;

public class Pokemon {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int pokePower = Integer.parseInt(scanner.nextLine());
        int distance = Integer.parseInt(scanner.nextLine());
        int exhaustionFactor = Integer.parseInt(scanner.nextLine());

        int targetsPoked = 0;
        int pokePowerHolder = pokePower;

        while (pokePower >= distance){
            pokePower -= distance;
            targetsPoked ++;

            if (pokePower == pokePowerHolder / 2 && exhaustionFactor != 0){
                pokePower = pokePower / exhaustionFactor;
                if (pokePower < distance){
                    break;
                }
            }
        }

        System.out.println(pokePower);
        System.out.println(targetsPoked);

    }
}
