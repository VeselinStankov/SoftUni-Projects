import javax.xml.transform.Result;
import java.util.*;

public class RandomizeWords {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();
        List<String> words = new ArrayList<>(Arrays.asList(line.split(" ")));
        List<String> result = new ArrayList<>(words.size());
        Random random = new Random();

        while (result.size() < words.size()) {

            for (int j = random.nextInt(words.size()); j < words.size(); j++) {

                if (!result.contains(words.get(j))) {
                    System.out.println(words.get(j));
                    result.add(words.get(j));
                }
                
            }
        }

    }
}
