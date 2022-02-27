package Exercise;

import java.util.Scanner;

public class PadawanEquipment {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int studentCount = Integer.parseInt(scanner.nextLine());
        double lightsaberPrice = Double.parseDouble(scanner.nextLine());
        double robePrice = Double.parseDouble(scanner.nextLine());
        double beltPrice = Double.parseDouble(scanner.nextLine());

        double totalPrice = (Math.ceil(studentCount + studentCount * 0.1) * lightsaberPrice) + (studentCount * robePrice) + ((studentCount - studentCount / 6) * beltPrice);

        if (totalPrice <= budget){
            System.out.printf("The money is enough - it would cost %.2flv.",totalPrice);
        }
        else{
            System.out.printf("George Lucas will need %.2flv more.",totalPrice - budget);
        }

    }
}
