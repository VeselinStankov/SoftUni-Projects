package Exercise;

import java.util.Scanner;

public class TrekkingMania {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int groupCount = Integer.parseInt(scanner.nextLine());
        int allPeople = 0;

        double Musala = 0;
        double Monblan = 0;
        double Kilimanjaro = 0;
        double K2 = 0;
        double Everest = 0;

        for (int i = 1; i <= groupCount; i ++){
            int people = Integer.parseInt(scanner.nextLine());
            allPeople += people;

            if (people <= 5){
                Musala += people;
            }
            else if (people >= 6 && people <= 12){
                Monblan += people;
            }
            else if (people >= 13 && people <= 25){
                Kilimanjaro += people;
            }
            else if (people >= 26 && people <= 40){
                K2 += people;
            }
            else{
                Everest += people;
            }
        }
        System.out.printf("%.2f%%\n",Musala / allPeople * 100.0);
        System.out.printf("%.2f%%\n",Monblan / allPeople * 100.0);
        System.out.printf("%.2f%%\n",Kilimanjaro / allPeople * 100.0);
        System.out.printf("%.2f%%\n",K2 / allPeople * 100.0);
        System.out.printf("%.2f%%\n",Everest / allPeople * 100.0);

    }
}
