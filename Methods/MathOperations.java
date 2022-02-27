import java.util.Scanner;

public class MathOperations {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();
        int b = Integer.parseInt(scanner.nextLine());

        switch (command){
            case "+":
                Add(a,b);
                break;

            case "*":
                Multiply(a,b);
                break;

            case "-":
                Subtract(a,b);
                break;

            case "/":
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
