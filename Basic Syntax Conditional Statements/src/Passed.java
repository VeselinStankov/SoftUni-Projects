import java.util.Scanner;

public class Passed {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double garde = Double.parseDouble(scanner.nextLine());

        if (garde >= 3){
            System.out.println("Passed!");
        }

    }
}
