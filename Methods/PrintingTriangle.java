import java.util.Scanner;

public class PrintingTriangle {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= number; i ++){
            PrintTriangle(i);
            System.out.println();
        }

        for (int i = number; i > 0; i --){
            if (i != number) {
                PrintTriangle(i);
                System.out.println();
            }
        }

    }

    public static void PrintTriangle(int number){

        for (int i = 1; i <= number; i ++){
            System.out.print(i);
            if (i != number){
                System.out.print(" ");
            }
        }
    }
}
