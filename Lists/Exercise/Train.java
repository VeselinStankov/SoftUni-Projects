package Exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Train {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Integer> passengers = new ArrayList<>();
        String line = scanner.nextLine();
        String[] lineAsStrings = line.split(" ");

        for (int i = 0; i < lineAsStrings.length; i++) {
            passengers.add(Integer.parseInt(lineAsStrings[i]));
        }

        int maxCapacity = Integer.parseInt(scanner.nextLine());

        String input = scanner.nextLine();
        String[] command;

        while (!input.equals("end")) {
            command = input.split(" ");
            if (command[0].equals("Add")) {
                passengers.add(Integer.parseInt(command[1]));
            }
            else {
                for (int i = 0; i < passengers.size(); i++) {
                    if (passengers.get(i) + Integer.parseInt(command[0]) <= maxCapacity){
                        passengers.set(i,passengers.get(i) + Integer.parseInt(command[0]));
                        break;
                    }
                }
            }
            input = scanner.nextLine();
        }

        for (int i = 0; i < passengers.size(); i++) {
            System.out.print(passengers.get(i) + " ");
        }

    }
}
