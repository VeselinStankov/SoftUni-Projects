package Exercise;
import java.util.*;

public class CountCharsInAString {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();
        List<String> word = new ArrayList<>(Arrays.asList(line.split("")));
        Map<String, Integer> lettersCount = new LinkedHashMap<>();
        int count = 1;

        for (String s : word) {
            if (s.equals(" ")) {
                continue;
            }

            if (!lettersCount.containsKey(s)) {
                lettersCount.put(s,count);
            }
            else {
                lettersCount.put(s,lettersCount.get(s) + 1);
            }
        }

        for (Map.Entry<String, Integer> stringIntegerEntry : lettersCount.entrySet()) {
            System.out.println(stringIntegerEntry.getKey() + " -> " + stringIntegerEntry.getValue());
        }
    }
}
