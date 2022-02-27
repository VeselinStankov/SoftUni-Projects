import java.util.Scanner;

public class Calculations {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());

        switch (command){
            case "add":
                Add(a,b);
                break;

            case "multiply":
                Multiply(a,b);
                break;

            case "subtract":
                Subtract(a,b);
                break;

            case "divide":
                Divide(a,b);
                break;
        }

    }

    private static void Divide(int a, int b) {

        System.out.println(a / b);

    }

    private static void Subtract(int a, int b) {

        System.out.println(a - b);

    }

    private static void Multiply(int a, int b) {

        System.out.println(a * b);

    }

    private static void Add(int a, int b) {

        System.out.println(a + b);

    }
}
