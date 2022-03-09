package Exercise;

import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class LegendaryFarming {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean legendaryFound = false;
        String material = null;
        int quantity = 0;
        int turnCounter = 1;
        Map<String, Integer> keyItems = new LinkedHashMap<>();
        keyItems.put("shards", 0);
        keyItems.put("fragments", 0);
        keyItems.put("motes", 0);
        Map<String, Integer> junkItems = new LinkedHashMap<>();
        int commandCounter = 0;
        String input;
        String winner;

        while (!legendaryFound) {
            String[] commands = scanner.nextLine().split(" ");
            for (int i = 0; i < commands.length; i+=2) {

                quantity = Integer.parseInt(commands[i]);
                material = commands[i + 1].toLowerCase(Locale.ROOT);

                if (material.equals("shards") || material.equals("fragments") || material.equals("motes")) {
                    if (!keyItems.containsKey(material)) {
                        keyItems.put(material, quantity);
                    } else {
                        keyItems.put(material, keyItems.get(material) + quantity);
                    }
                } else {
                    if (!junkItems.containsKey(material)) {
                        junkItems.put(material, quantity);
                    } else {
                        junkItems.put(material, junkItems.get(material) + quantity);
                    }
                }

                if (keyItems.containsKey(material)) {
                    if (keyItems.get(material) >= 250) {

                        legendaryFound = true;
                        winner = material;
                        break;
                    }
                }

            }
        }

        String item = null;

        if (keyItems.get("shards") >= 250) {
            keyItems.put("shards", keyItems.get("shards") - 250);
            item = "Shadowmourne";
        }
        else if(keyItems.get("fragments") >= 250) {
            keyItems.put("fragments", keyItems.get("fragments") - 250);
            item = "Valanyr";
        }
        else if(keyItems.get("motes") >= 250) {
            keyItems.put("motes", keyItems.get("motes") - 250);
            item = "Dragonwrath";
        }

        System.out.println(item + " obtained!");
        for (Map.Entry<String, Integer> stringIntegerEntry : keyItems.entrySet()) {
            System.out.println(stringIntegerEntry.getKey().toLowerCase(Locale.ROOT) + ": " + stringIntegerEntry.getValue());
        }
        for (Map.Entry<String, Integer> stringIntegerEntry : junkItems.entrySet()) {
            System.out.println(stringIntegerEntry.getKey().toLowerCase(Locale.ROOT) + ": " + stringIntegerEntry.getValue());
        }


    }
}
