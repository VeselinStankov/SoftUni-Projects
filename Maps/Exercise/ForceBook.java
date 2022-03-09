package Exercise;

import java.util.*;

public class ForceBook {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();
        Map<String, List<String>> sideUser = new LinkedHashMap<>();

        while (!line.equals("Lumpawaroo")) {

            String[] input = line.split(" ");


            for (String s : input) {
                if (s.equals("|")) {

                    String[] forceSideUser = line.split(" \\| ");

                    boolean add = true;

                    for (Map.Entry<String, List<String>> stringListEntry : sideUser.entrySet()) {
                        if (stringListEntry.getValue().contains(forceSideUser[1])) {
                            add = false;
                            break;
                        }
                    }

                    if (!sideUser.containsKey(forceSideUser[0])) {
                        List<String> users = new ArrayList<>();
                        sideUser.put(forceSideUser[0], users);
                        if (add) {
                            users.add(forceSideUser[1]);
                        }
                    }
                    else {
                        boolean flag = true;
                        for (Map.Entry<String, List<String>> stringListEntry : sideUser.entrySet()) {
                            if (stringListEntry.getValue().contains(forceSideUser[1])) {
                                flag = false;
                                break;
                            }
                        }

                        if (flag) {
                            sideUser.get(forceSideUser[0]).add(forceSideUser[1]);
                        }
                    }
                }
                if (s.equals("->")) {

                    String[] forceSideUser = line.split(" -> ");

                    for (Map.Entry<String, List<String>> stringListEntry : sideUser.entrySet()) {
                        stringListEntry.getValue().remove(forceSideUser[0]);
                    }

                    if (!sideUser.containsKey(forceSideUser[1])) {
                        List<String> users = new ArrayList<>();
                        sideUser.put(forceSideUser[1], users);
                        users.add(forceSideUser[0]);
                        System.out.println(forceSideUser[0] + " joins the " + forceSideUser[1] + " side!");
                    }
                    else {
                        sideUser.get(forceSideUser[1]).add(forceSideUser[0]);
                        System.out.println(forceSideUser[0] + " joins the " + forceSideUser[1] + " side!");
                    }
                }
            }
            line = scanner.nextLine();
        }
        for (Map.Entry<String, List<String>> entry : sideUser.entrySet()) {
            if (entry.getValue().size() != 0) {
                System.out.println("Side: " + entry.getKey() + ", Members: " + entry.getValue().size());
                for (String s : entry.getValue()) {
                    System.out.print("! " + s + "\n");
                }
            }

        }

    }
}
