package More;

import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();
        char letter;
        String reversedWord = "";

        for (int i = 0; i < word.length(); i ++){

            letter = word.charAt(i);
            reversedWord = letter + reversedWord;
        }

        System.out.println(reversedWord);

    }
}
