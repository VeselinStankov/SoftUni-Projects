package More;

import java.util.Scanner;

public class Hospital {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        int patients = 0;
        int treatedPatients = 0;
        int untreatedPatients= 0;
        int dayCounter = 0;
        int doctors = 7;

        for (int i = 0; i < days; i++){
            dayCounter ++;
            patients = Integer.parseInt(scanner.nextLine());
            if (dayCounter % 3 == 0 && untreatedPatients > treatedPatients){
                doctors ++;
            }
            if (patients <= doctors){
                treatedPatients += patients;
            }
            else {
                treatedPatients += doctors;
                untreatedPatients += patients - doctors;
            }
        }

        System.out.printf("Treated patients: %d.\n",treatedPatients);
        System.out.printf("Untreated patients: %d.",untreatedPatients);

    }
}
