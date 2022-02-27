import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListManipulationBasics {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();
        String line = scanner.nextLine();
        String[] lineAsStrings = line.split(" ");

        for (int i = 0; i < lineAsStrings.length; i++) {
            numbers.add(Integer.parseInt(lineAsStrings[i]));
        }

        String input = scanner.nextLine();
        String[] command;

        while (!input.equals("end")){
            command = input.split(" ");
            switch (command[0]){
                case "Add":
                    numbers.add(Integer.parseInt(command[1]));
                    break;
                case "Remove":
                    Integer index = Integer.parseInt(command[1]);
                    numbers.remove(index);
                    break;
                case "RemoveAt":
                    numbers.remove(Integer.parseInt(command[1]));
                    break;
                case "Insert":
                    numbers.add(Integer.parseInt(command[2]),Integer.parseInt(command[1]));
            }
            input = scanner.nextLine();
        }

        for (int i = 0; i < numbers.size(); i++) {
            System.out.print(numbers.get(i) + " ");
        }


    }
}
