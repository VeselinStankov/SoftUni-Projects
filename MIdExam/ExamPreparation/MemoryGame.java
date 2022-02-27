package ExamPreparation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MemoryGame {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        List<String> line = new ArrayList<>(Arrays.asList(input.split(" ")));

        String ints = scanner.nextLine();
        String[] command;
        int moves = 0;

        while (!ints.equals("end")) {
            command = ints.split(" ");
            if (
                    command[0].equals(command[1])
                            || Integer.parseInt(command[0]) < 0
                            || Integer.parseInt(command[0]) > line.size() - 1
                            || Integer.parseInt(command[1]) < 0
                            || Integer.parseInt(command[1]) > line.size() - 1
            ) {
                moves++;
                line.add(line.size() / 2, "-" + moves + "a");
                line.add(line.size() / 2, "-" + moves + "a");
                System.out.println("Invalid input! Adding additional elements to the board");
            }
            else {

                if (line.get(Integer.parseInt(command[0])).equals(line.get(Integer.parseInt(command[1])))) {
                    System.out.println("Congrats! You have found matching elements - " + line.get(Integer.parseInt(command[0])) + "!");
                    line.remove(Integer.parseInt(command[0]));
                    if (Integer.parseInt(command[1]) > 0) {
                        line.remove(Integer.parseInt(command[1]) - 1);
                    }
                    else {
                        line.remove(Integer.parseInt(command[1]));
                    }
                    moves++;
                }
                else {
                    moves++;
                    System.out.println("Try again!");
                }

                if (line.size() == 0) {
                    System.out.println("You have won in " + moves + " turns!");
                    break;
                }
            }
            ints = scanner.nextLine();
        }

        if (line.size() > 0) {
            System.out.println("Sorry you lose :(");
            for (int i = 0; i < line.size(); i++) {
                System.out.print(line.get(i) + " ");
            }
        }
    }
}
