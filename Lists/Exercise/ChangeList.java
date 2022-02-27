package Exercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ChangeList {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Integer> passengers = new ArrayList<>();
        String line = scanner.nextLine();
        String[] lineAsStrings = line.split(" ");

        for (int i = 0; i < lineAsStrings.length; i++) {
            passengers.add(Integer.parseInt(lineAsStrings[i]));
        }

        String input = scanner.nextLine();
        String[] command;

        while (!input.equals("end")) {
            command = input.split(" ");
            if (command[0].equals("Delete")) {
                passengers.removeAll(Collections.singleton(Integer.parseInt(command[1])));
            }
            else {
                passengers.add(Integer.parseInt(command[2]),Integer.parseInt(command[1]));
            }
            input = scanner.nextLine();
        }

        for (int i = 0; i < passengers.size(); i++) {
            System.out.print(passengers.get(i) + " ");
        }


    }
}
