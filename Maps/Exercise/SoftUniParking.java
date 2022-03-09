package Exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class SoftUniParking {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        String line = scanner.nextLine();
        String[] command;
        Map<String, String> parkingLot = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            command = line.split(" ");
            switch (command[0]) {
                case "register":
                    if (!parkingLot.containsKey(command[1])) {
                        parkingLot.put(command[1],command[2]);
                        System.out.println(command[1] + " registered " + command[2] + " successfully");
                    }
                    else {
                        System.out.println("ERROR: already registered with plate number "+ parkingLot.get(command[1]));
                    }
                    break;

                case "unregister":
                    if (!parkingLot.containsKey(command[1])) {
                        System.out.println("ERROR: user " + command[1] + " not found");
                    }
                    else {
                        parkingLot.remove(command[1]);
                        System.out.println(command[1] + " unregistered successfully");
                    }
                    break;
            }
            if (i < n - 1) {
                line = scanner.nextLine();
            }
        }

        for (Map.Entry<String, String> stringStringEntry : parkingLot.entrySet()) {
            System.out.println(stringStringEntry.getKey() + " => " + stringStringEntry.getValue());
        }
    }
}
