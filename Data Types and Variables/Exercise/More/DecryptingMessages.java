package Exercise.More;

import java.util.Scanner;

public class DecryptingMessages {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int key = Integer.parseInt(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());

        char symbol;
        String word = "";

        for (int i = 0; i < n; i ++){
            symbol = scanner.nextLine().charAt(0);
            word += (char)(symbol + key);
        }

        System.out.println(word);
    }
}
