package Exercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class OpinionPoll {

    public static void main(String[] args) {

         Scanner scanner = new Scanner(System.in);
         int n = Integer.parseInt(scanner.nextLine());

         List<String> people = new ArrayList<>();
         String input;
         String[] all;

        for (int i = 0; i < n; i++) {
            input = scanner.nextLine();
            all = input.split(" ");
            if (Integer.parseInt(all[1]) > 30) {
                people.add(all[0] + " - " + all[1]);
            }
        }

        Collections.sort(people);

        for (int i = 0; i < people.size(); i++) {
            System.out.println(people.get(i));
        }
    }
}
