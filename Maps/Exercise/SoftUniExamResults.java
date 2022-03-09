package Exercise;

import java.net.Inet4Address;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class SoftUniExamResults {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();
        String[] command;
        Map<String, Integer> userPoints = new LinkedHashMap<>();
        Map<String, Integer> languageSubmissions = new LinkedHashMap<>();

        while (!line.equals("exam finished")) {
            command = line.split("-");
            String name = command[0];
            String language = command[1];
            int points = 0;
            int submissions = 0;

            if (language.equals("banned")) {
                userPoints.remove(name);
                line = scanner.nextLine();
                continue;
            }
            else {
                points = Integer.parseInt(command[2]);
            }

            if (!userPoints.containsKey(command[0])) {
                userPoints.put(name, points);
                submissions ++;
            }
            else {
                if (userPoints.get(name) < points) {
                    userPoints.put(name, points);
                }
                submissions ++;
            }

            if (!languageSubmissions.containsKey(language)) {
                languageSubmissions.put(language, submissions);
            }
            else {
                languageSubmissions.put(language,languageSubmissions.get(language) + submissions);
            }
            line = scanner.nextLine();
        }

        System.out.println("Results: ");
        for (Map.Entry<String, Integer> stringIntegerEntry : userPoints.entrySet()) {
            System.out.println(stringIntegerEntry.getKey() + " | " + stringIntegerEntry.getValue());
        }

        System.out.println("Submissions:");
        for (Map.Entry<String, Integer> stringIntegerEntry : languageSubmissions.entrySet()) {
            System.out.println(stringIntegerEntry.getKey() + " - " + stringIntegerEntry.getValue());
        }
    }
}
