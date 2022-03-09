import java.util.*;

public class WordSynonyms {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<String> words = new ArrayList<>();
        String key;
        String value;
        Map<String, List<String>> wordSynonyms = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            key = scanner.nextLine();
            value = scanner.nextLine();
            if (!wordSynonyms.containsKey(key)) {
                List<String> values = new ArrayList<>();
                values.add(value);
                wordSynonyms.put(key,values);
            }
            else {
                wordSynonyms.get(key).add(value);
            }
        }

        for (Map.Entry<String, List<String>> stringListEntry : wordSynonyms.entrySet()) {
            System.out.print(stringListEntry.getKey() + " - ");
            for (int i = 0; i < stringListEntry.getValue().size(); i++) {
                if (i == stringListEntry.getValue().size() - 1) {
                    System.out.print(stringListEntry.getValue().get(i));
                }
                else {
                    System.out.print(stringListEntry.getValue().get(i) + ", ");
                }
            }
            System.out.println();

        }


    }
}
