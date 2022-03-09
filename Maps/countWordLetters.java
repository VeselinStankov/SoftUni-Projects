import java.util.*;

public class countWordLetters {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine().toLowerCase(Locale.ROOT);
        List<String> letters = new ArrayList<>(Arrays.asList(word.split("")));

        Map<String, Integer> countLetters = new LinkedHashMap<>();
        int count = 1;

        for (String letter : letters) {
            if (letter.equals(" ")){
                continue;
            }

            if (!countLetters.containsKey(letter)) {
                countLetters.put(letter,count);
            }
            else {
                countLetters.put(letter,countLetters.get(letter) + 1);
            }
        }

        for (Map.Entry<String, Integer> stringIntegerEntry : countLetters.entrySet()) {
            System.out.println(stringIntegerEntry.getKey() + " - " + stringIntegerEntry.getValue());
        }


    }

}
