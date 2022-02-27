import java.util.Scanner;

public class RepeatString {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int repeater = Integer.parseInt(scanner.nextLine());

        RepeatString(input,repeater);

    }

    private static void RepeatString(String input, int repeater) {

        String result = "";

        for (int i = 0; i < repeater; i ++){
            result += input;
        }
        System.out.println(result);
    }
}
