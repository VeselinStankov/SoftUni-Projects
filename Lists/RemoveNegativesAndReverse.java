import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RemoveNegativesAndReverse {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();
        String line = scanner.nextLine();
        String[] lineAsStrings = line.split(" ");

        for (int i = 0; i < lineAsStrings.length; i++) {
            numbers.add(Integer.parseInt(lineAsStrings[i]));
        }

        int i = 0;
        int counter = numbers.size();

        while (counter > 0) {
            if (numbers.get(i) < 0) {
                numbers.remove(i);
                counter --;
            }
            else {
                i ++;
                counter --;
            }
        }

        if (numbers.size() > 0) {
            for (int j = numbers.size() - 1; j >= 0; j--) {
                System.out.print(numbers.get(j) + " ");
            }
        }
        else {
            System.out.println("empty");
        }



    }
}
