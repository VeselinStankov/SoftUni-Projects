package ExamPreparation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Numbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String[] lineAsIntegers = new String[line.length()];
        lineAsIntegers = line.split(" ");
        List<Integer> numbers = new ArrayList<>(5);

        for (int i = 0; i < lineAsIntegers.length; i++) {
            numbers.add(Integer.parseInt(lineAsIntegers[i]));
        }

        double sum = 0;

        for (int i = 0; i < numbers.size(); i++) {
            sum += numbers.get(i);
        }

        double averageValue = sum / numbers.size();

        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) > averageValue) {
                result.add(numbers.get(i));
            }
        }

        Collections.sort(result,Collections.reverseOrder());

        if (result.size() == 0) {
            System.out.println("No");
        }
        else if (result.size() > 5) {
            for (int i = 0; i < 5; i++) {
                System.out.print(result.get(i) + " ");
            }
        }
        else {
            for (int i = 0; i < result.size(); i++) {
                System.out.print(result.get(i) + " ");
            }
        }


    }
}
