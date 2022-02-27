package ExamPreparation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ArrayModifier {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();
        String[] lineAsIntegers = new String[line.length()];
        lineAsIntegers = line.split(" ");
        List<Integer> numbers = new ArrayList<>(5);

        for (int i = 0; i < lineAsIntegers.length; i++) {
            numbers.add(Integer.parseInt(lineAsIntegers[i]));
        }

        String lineCommand = scanner.nextLine();
        String[] command;

        while (!lineCommand.equals("end")) {
            command = lineCommand.split(" ");

            switch (command[0]) {
                case "swap":
                    int temp = numbers.get(Integer.parseInt(command[1]));
                    numbers.set(Integer.parseInt(command[1]),numbers.get(Integer.parseInt(command[2])));
                    numbers.set(Integer.parseInt(command[2]),temp);
                    break;
                case "multiply":
                    numbers.set(Integer.parseInt(command[1]),numbers.get(Integer.parseInt(command[1])) * numbers.get(Integer.parseInt(command[2])));
                    break;
                case "decrease":
                    for (int i = 0; i < numbers.size(); i++) {
                        numbers.set(i,numbers.get(i) - 1);
                    }
                    break;
            }

            lineCommand = scanner.nextLine();
        }

        for (int i = 0; i < numbers.size(); i++) {
            if (i == numbers.size() - 1) {
                System.out.println(numbers.get(i));
            }
            else {
                System.out.print(numbers.get(i) + ", ");
            }
        }

    }
}
