package Exercise;

import java.util.Scanner;

public class Moving {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());

        int vol = a * b * c;

        String input = "";

        while (vol >= 0){
            input = scanner.nextLine();
            if (input.equals("Done")){
                break;
            }
            int box = Integer.parseInt(input);
            vol -= box;
        }
        if (input.equals("Done")){
            System.out.printf("%d Cubic meters left.",vol);
        }
        else {
            System.out.printf("No more free space! You need %d Cubic meters more.",-(vol));
        }
    }
}
