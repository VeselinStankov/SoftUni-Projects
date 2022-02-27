package Exercise;

import java.util.Scanner;

public class CharactersInRange {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        char a = scanner.nextLine().charAt(0);
        char b = scanner.nextLine().charAt(0);

        PrintCharacters(a,b);

    }

    private static void PrintCharacters(char a, char b) {
        if (Character.getNumericValue(a) < Character.getNumericValue(b)) {
            for (int i = a + 1; i < b; i++) {
                System.out.printf("%c ", i);
            }
        }
        else {
            for (int i = b + 1; i < a; i++) {
                System.out.printf("%c ", i);
            }
        }
    }
}
