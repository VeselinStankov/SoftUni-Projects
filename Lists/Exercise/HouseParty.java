package Exercise;

import org.w3c.dom.stylesheets.LinkStyle;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HouseParty {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<String> guestList = new ArrayList<>();
        int n = Integer.parseInt(scanner.nextLine());
        String line;
        String[] command;

        for (int i = 0; i < n; i++) {
            line = scanner.nextLine();
            command = line.split(" ");
            if (!command[2].equals("not")) {
                if (!guestList.contains(command[0])) {
                    guestList.add(command[0]);
                }
                else {
                    System.out.println(command[0] + " is already in the list!");
                }
            }
            else {
                if (guestList.contains(command[0])){
                    guestList.remove(command[0]);
                }
                else {
                    System.out.println(command[0] + " is not in the list!");
                }
            }
        }

        for (int i = 0; i < guestList.size(); i++) {
            System.out.println(guestList.get(i));
        }

    }
}
