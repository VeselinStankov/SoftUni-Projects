package Exercise;

import java.util.Scanner;

public class PasswordValidator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();
        int digitCounter = 0;
        int letterCounter = 0;

        for (int i = 0; i < password.length(); i ++) {
            if (Character.isDigit(password.charAt(i))){
                digitCounter ++;
            }
            if (Character.isLetter(password.charAt(i))){
                letterCounter ++;
            }
        }

        int validCounter = 3;

        if (password.length() < 6 || password.length() > 10) {
            System.out.println("Password must be between 6 and 10 characters");
            validCounter --;
        }
        if (digitCounter + letterCounter != password.length()) {
            System.out.println("Password must consist only of letters and digits");
            validCounter --;
        }
        if (digitCounter < 2) {
            System.out.println("Password must have at least 2 digits");
            validCounter --;
        }
        if (validCounter == 3) {
            System.out.println("Password is valid");
        }
    }
}
