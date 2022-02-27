import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Inventory {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();
        List<String> items = new ArrayList<>(Arrays.asList(line.split("[\\s,]+")));

        while (true){

            String input = scanner.nextLine();
            List<String> commands = new ArrayList<>(Arrays.asList(input.split("[\\s-\\s:]+")));

            if (commands.get(0).equals("Craft!")){
                break;
            }

            if (commands.get(0).equals("Collect")){
                if (!items.contains(commands.get(1))){
                    items.add(commands.get(1));
                }
            }
            else if (commands.get(0).equals("Drop")){
                items.remove(commands.get(1));
            }
            else if (commands.get(0).equals("Combine")){

                for (int i = 0; i < items.size(); i++) {

                    if (items.get(i).equals(commands.get(2))){
                        items.add(i + 1,commands.get(3));
                    }

                }
            }
            else if (commands.get(0).equals("Renew")){
                if (items.contains(commands.get(1))){
                    items.remove(commands.get(1));
                    items.add(commands.get(1));
                }
            }
        }

        for (int i = 0; i < items.size(); i++) {
            if (i < items.size() - 1) {
                System.out.print(items.get(i) + ", ");
            }
            else {
                System.out.print(items.get(i));
            }
        }

    }
}
