package Exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class MinerTask {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int i = 1;
        String resource = null;
        int quantity = 0;
        Map<String, Integer> resourceQuantity = new LinkedHashMap<>();

        while (!input.equals("stop")) {
            if (i == 1) {
                resource = input;
            }
            else if (i == 2) {
                quantity = Integer.parseInt(input);
            }
            else if (i % 2 != 0) {
                resource = input;
            }
            else {
                quantity = Integer.parseInt(input);
            }

            if (i % 2 == 0) {

                if (!resourceQuantity.containsKey(resource)) {
                    resourceQuantity.put(resource, quantity);
                } else {
                    resourceQuantity.put(resource,resourceQuantity.get(resource) + quantity);
                }
            }
            i++;
            input = scanner.nextLine();
        }

        for (Map.Entry<String, Integer> stringIntegerEntry : resourceQuantity.entrySet()) {
            System.out.println(stringIntegerEntry.getKey() + " -> " + stringIntegerEntry.getValue());
        }


    }
}
