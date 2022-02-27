import java.io.LineNumberInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GaussTrick {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = new ArrayList<>();
        String line = scanner.nextLine();
        String[] lineAsStrings = line.split(" ");

        for (int i = 0; i < lineAsStrings.length; i++) {
            numbers.add(Integer.parseInt(lineAsStrings[i]));
        }


        List<Integer> result = new ArrayList<>(2);

        int i = 0;

        while (numbers.size() > 0){
            if (numbers.size() == 1) {
                result.add(numbers.get(0));
                break;
            }
                result.add(numbers.get(i) + numbers.get(numbers.size() - 1));
                numbers.remove(numbers.get(numbers.size() - 1));
                numbers.remove(numbers.get(i));
        }

        for (int j = 0; j < result.size(); j++) {
            System.out.print(result.get(j) + " ");
        }

    }
}
