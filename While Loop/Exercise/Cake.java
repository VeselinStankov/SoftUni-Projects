package Exercise;

import java.util.Scanner;

public class Cake {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());

        int area = a * b;
        String input = "";

        while (area > 0){
            input = scanner.nextLine();
            if (input.equals("STOP")){
                break;
            }
            int piece = Integer.parseInt(input);

            area -= piece;
        }

        if (area > 0){
            System.out.printf("%d pieces are left.",area);
        }
        else {
            System.out.printf("No more cake left! You need %d pieces more.", -(area));
        }

    }
}