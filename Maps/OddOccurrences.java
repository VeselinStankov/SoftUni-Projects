import java.util.*;

public class OddOccurrences {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine().toLowerCase(Locale.ROOT);
        String[] words = line.split(" ");
        Map<String, Integer> countWords = new LinkedHashMap<>();
        int count = 1;

        for (String word : words) {
            if (!countWords.containsKey(word)) {
                countWords.put(word,count);
            }
            else {
                count = countWords.containsKey(word) ? countWords.get(word) : 0;
                countWords.put(word, count + 1);
            }
        }
        List<String> result = new ArrayList<>();
        for (Map.Entry<String, Integer> stringIntegerEntry : countWords.entrySet()) {

            if (stringIntegerEntry.getValue() % 2 != 0) {
                result.add(stringIntegerEntry.getKey());
            }
        }

        for (int i = 0; i < result.size(); i++) {
            if (i == result.size() - 1) {
                System.out.print(result.get(i));
            }
            else {
                System.out.print(result.get(i) + ", ");
            }
        }

    }
}
