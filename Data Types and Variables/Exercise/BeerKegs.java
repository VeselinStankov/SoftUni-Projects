package Exercise;

import java.util.Scanner;

public class BeerKegs {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        String model;
        double radius;
        double height;

        double biggestVolume = 0;
        String modelHolder = "";

        for (int i = 0; i < n; i ++){
            model = scanner.nextLine();
            radius = Double.parseDouble(scanner.nextLine());
            height = Double.parseDouble(scanner.nextLine());

            if (biggestVolume <= Math.PI * radius * radius * height){
                biggestVolume = Math.PI * radius * radius * height;
                modelHolder = model;
            }
        }

        System.out.println(modelHolder);

    }
}
