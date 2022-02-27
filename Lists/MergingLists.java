import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MergingLists {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Integer> firstNumbers = new ArrayList<>();
        String firstLine = scanner.nextLine();
        String[] firstLineAsStrings = firstLine.split(" ");

        for (int i = 0; i < firstLineAsStrings.length; i++) {
            firstNumbers.add(Integer.parseInt(firstLineAsStrings[i]));
        }

        List<Integer> secondNumbers = new ArrayList<>();
        String secondLine = scanner.nextLine();
        String[] secondLineAsStrings = secondLine.split(" ");

        for (int i = 0; i < secondLineAsStrings.length; i++) {
            secondNumbers.add(Integer.parseInt(secondLineAsStrings[i]));
        }

        List<Integer> result = new ArrayList<>();

        int i = 0;
        int j = 0;

        while (i < firstNumbers.size() || j < secondNumbers.size() ){
            if (i < firstNumbers.size()) {
                result.add(firstNumbers.get(i));
                i++;
            }
            if (j < secondNumbers.size()) {
                result.add(secondNumbers.get(j));
                j++;
            }
        }

        for (int k = 0; k < result.size(); k++) {
            System.out.print(result.get(k) + " ");
        }
    }
}
