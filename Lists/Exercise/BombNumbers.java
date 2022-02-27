package Exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BombNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();
        String line = scanner.nextLine();
        String[] lineAsStrings = line.split(" ");

        for (int i = 0; i < lineAsStrings.length; i++) {
            numbers.add(Integer.parseInt(lineAsStrings[i]));
        }

        List<Integer> specialNumbers = new ArrayList<>();
        String specialLine = scanner.nextLine();
        String[] specialLineAsStrings = specialLine.split(" ");

        for (int i = 0; i < specialLineAsStrings.length; i++) {
            specialNumbers.add(Integer.parseInt(specialLineAsStrings[i]));
        }

        List<Integer> result = new ArrayList<>();


        int counter = 0;
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) == (specialNumbers.get(0))) {
                for (int j = i; j < numbers.size() ; j++) {
                    if (counter > specialNumbers.get(1)) {
                        result.add(numbers.get(j));
                    }
                    counter ++;
                }
                counter = 0;
                for (int j = i; j >= 0 ; j --) {
                    if (counter > specialNumbers.get(1)) {
                        result.add(numbers.get(j));
                    }
                    counter ++;
                }
            }
            break;
        }

        int sum = 0;
        for (int i = 0; i < result.size(); i++) {
            sum += result.get(i);
        }
        System.out.println(sum);

    }
}
