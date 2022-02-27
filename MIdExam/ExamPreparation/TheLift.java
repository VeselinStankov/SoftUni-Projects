package ExamPreparation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TheLift {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int people = Integer.parseInt(scanner.nextLine());
        String line = scanner.nextLine();
        String[] lineAsIntegers = new String[line.length()];
        lineAsIntegers = line.split(" ");
        List<Integer> lift = new ArrayList<>(5);

        for (int i = 0; i < lineAsIntegers.length; i++) {
            lift.add(Integer.parseInt(lineAsIntegers[i]));
        }

        for (int i = 0; i < lift.size(); i++) {
            while (lift.get(i) < 4 && people > 0) {
                lift.set(i,lift.get(i) + 1);
                people --;
            }
        }

        if (people == 0 && lift.get(lift.size() - 1) < 4) {
            System.out.println("The lift has empty spots!");
            for (int i = 0; i < lift.size(); i++) {
                System.out.print(lift.get(i) + " ");
            }
        }
        else if (people > 0 && lift.get(lift.size() - 1) == 4) {
            System.out.println("There isn't enough space! " + people + " people in a queue!");
            for (int i = 0; i < lift.size(); i++) {
                System.out.print(lift.get(i) + " ");
            }
        }
        else {
            for (int i = 0; i < lift.size(); i++) {
                System.out.print(lift.get(i) + " ");
            }
        }



    }
}
