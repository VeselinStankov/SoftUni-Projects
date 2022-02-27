package More;

import java.util.Scanner;

public class PipesInPool {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int v = Integer.parseInt(scanner.nextLine());
        int p1 = Integer.parseInt(scanner.nextLine());
        int p2 = Integer.parseInt(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());

        double p1per = p1 * h;
        double p2per = p2 * h;
        double fill = p1per + p2per;

        if (v >= fill){
            System.out.printf("The pool is %.2f%% full. Pipe 1: %.2f%%. Pipe 2: %.2f%%.",fill/v*100,p1per/fill*100,p2per/fill*100);
        }
        else{
            System.out.printf("For %f hours the pool overflows with %f liters",h,fill - v);
        }

    }
}
