package More;

import java.util.Scanner;

public class FootballLeague {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double stadiumCapacity = Integer.parseInt(scanner.nextLine());
        double fans = Integer.parseInt(scanner.nextLine());
        String sector;

        int sectorACounter = 0;
        int sectorBCounter = 0;
        int sectorVCounter = 0;
        int sectorGCounter = 0;

        for (int i = 1; i <= fans; i ++) {
            sector = scanner.nextLine();
            switch (sector){
                case "A":
                    sectorACounter ++;
                    break;
                case "B":
                    sectorBCounter ++;
                    break;
                case "V":
                    sectorVCounter ++;
                    break;
                case "G":
                    sectorGCounter ++;
                    break;
            }
        }
        System.out.printf("%.2f%%\n",sectorACounter / fans * 100.0);
        System.out.printf("%.2f%%\n",sectorBCounter / fans * 100.0);
        System.out.printf("%.2f%%\n",sectorVCounter / fans * 100.0);
        System.out.printf("%.2f%%\n",sectorGCounter / fans * 100.0);
        System.out.printf("%.2f%%\n",(sectorACounter + sectorBCounter + sectorVCounter + sectorGCounter) / stadiumCapacity * 100.0);
    }
}
