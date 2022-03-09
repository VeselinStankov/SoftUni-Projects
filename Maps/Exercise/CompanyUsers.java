package Exercise;

import java.util.*;

public class CompanyUsers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Map<String, List<String>> companyUser = new LinkedHashMap<>();
        String line = "";
        String[] command;

        while (true) {
            line = scanner.nextLine();
            if (line.equals("End")) {
                break;
            }
            command = line.split(" -> ");

                if (!companyUser.containsKey(command[0])) {
                        companyUser.put(command[0], new ArrayList<>());
                        companyUser.get(command[0]).add(command[1]);
                } else {
                    if (companyUser.get(command[0]).contains(command[1])) {
                        continue;
                    }
                        companyUser.get(command[0]).add(command[1]);

                }
        }

        for (Map.Entry<String, List<String>> stringListEntry : companyUser.entrySet()) {
            System.out.println(stringListEntry.getKey());
            for (String s : stringListEntry.getValue()) {
                System.out.println("-- " + s);
            }
        }

    }
}
