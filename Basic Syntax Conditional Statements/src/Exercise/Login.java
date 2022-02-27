package Exercise;

import java.util.Scanner;

public class Login {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String username = scanner.nextLine();
        int counter = 0;
        String password = "";
        String input;

        for (int i = username.length() - 1; i >= 0; i --){
            password += username.charAt(i);
        }

        while (true){
            counter ++;
            if (counter > 4){
                System.out.println("User " + username + " blocked!");
                break;
            }
            input = scanner.nextLine();
            if (input.equals(password)){
                System.out.println("User " + username + " logged in.");
                break;
            }
            else if (counter < 4){
                System.out.println("Incorrect password. Try again.");
            }
        }

    }
}
