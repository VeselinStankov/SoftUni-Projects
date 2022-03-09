import java.text.DecimalFormat;
import java.util.*;

public class CountRealNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToDouble(Double::parseDouble).toArray();

        Map<Double,Integer> realNumbersCount = new TreeMap<>();

        for (double num : numbers) {
            if (realNumbersCount.containsKey(num)) {
                realNumbersCount.put(num, realNumbersCount.get(num) + 1);
            }
            else {
                realNumbersCount.put(num, 1);
            }
        }

        for (Map.Entry<Double, Integer> entry : realNumbersCount.entrySet()) {
            DecimalFormat df = new DecimalFormat("#.##");
            System.out.printf("%s -> %d%n", df.format(entry.getKey()), entry.getValue());
        }

    }
}
