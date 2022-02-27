package Exercise.More;

import java.util.Scanner;

public class LongerLine {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int x1 = Integer.parseInt(scanner.nextLine());
        int y1 = Integer.parseInt(scanner.nextLine());
        int x2 = Integer.parseInt(scanner.nextLine());
        int y2 = Integer.parseInt(scanner.nextLine());
        int x3 = Integer.parseInt(scanner.nextLine());
        int y3 = Integer.parseInt(scanner.nextLine());
        int x4 = Integer.parseInt(scanner.nextLine());
        int y4 = Integer.parseInt(scanner.nextLine());

        int a = Math.abs(x1);
        int b = Math.abs(y1);
        int c = Math.abs(x2);
        int d = Math.abs(y2);
        int e = Math.abs(x3);
        int f = Math.abs(y3);
        int g = Math.abs(x4);
        int h = Math.abs(y4);

        if ((a + b) - (c + d) > (e + f) - (g + h)){
            System.out.printf("(%d, %d)(%d, %d)",x2,y2,x1,y1);
        }
        else {
            System.out.printf("(%d, %d)(%d, %d)",x4,y4,x3,y3);
        }

    }
}
