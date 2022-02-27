package Exercise;

import java.util.Scanner;

public class VowelsCount {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();

        System.out.println(CountVowels(word));

    }

    private static int CountVowels(String word) {

        int vowelCounter = 0;
        char [] vowels = {'a', 'o', 'e', 'u', 'i','A', 'O', 'E', 'I', 'U'};
        for (int i = 0; i < word.length(); i ++){
            for (int j = 0; j < vowels.length; j++) {
                if (word.charAt(i) == vowels[j]){
                    vowelCounter ++;
                }
            }
        }
        return vowelCounter;
    }
}
