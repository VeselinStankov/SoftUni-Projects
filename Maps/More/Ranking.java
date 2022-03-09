package More;
import java.util.*;

public class Ranking {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] lineContestPass = scanner.nextLine().split(":");
        Map<String, String> contestPass = new LinkedHashMap<>();

        while (!lineContestPass[0].equals("end of contests")) {
            contestPass.put(lineContestPass[0], lineContestPass[1]);
            lineContestPass = scanner.nextLine().split(":");
        }

        String[] lineUsernamePoints = scanner.nextLine().split("=>");
        Map<String, Map<String, Integer>> userContentPoints = new TreeMap<>();

        while (!lineUsernamePoints[0].equals("end of submissions")) {

            String contest = lineUsernamePoints[0];
            String password = lineUsernamePoints[1];
            String username = lineUsernamePoints[2];
            int points = Integer.parseInt(lineUsernamePoints[3]);

            if (contestPass.containsKey(contest)) {
                if (contestPass.get(contest).equals(password)) {

                    if (!userContentPoints.containsKey(username)) {
                        Map<String, Integer> contestPoints = new TreeMap<>();
                        userContentPoints.put(username, contestPoints);
                        contestPoints.put(contest, points);
                    }
                    else {
                        if (!userContentPoints.get(username).containsKey(contest)) {
                            userContentPoints.get(username).put(contest, points);
                        }
                        else {
                            if (userContentPoints.get(username).get(contest) < points) {
                                userContentPoints.get(username).put(contest, points);
                            }
                        }
                    }
                }
            }
            lineUsernamePoints = scanner.nextLine().split("=>");
        }

        int sumPoints = 0;
        int maxPoint = 0;
        String maxPointsName = "";

        for (Map.Entry<String, Map<String, Integer>> outerEntry : userContentPoints.entrySet()) {
            for (Map.Entry<String, Integer> innerEntry : outerEntry.getValue().entrySet()) {
                sumPoints += innerEntry.getValue();
            }
            if (sumPoints > maxPoint) {
                maxPoint = sumPoints;
                maxPointsName = outerEntry.getKey();
            }
            sumPoints = 0;
        }

        System.out.println("Best candidate is " + maxPointsName + " with total "  + maxPoint  + " points.");
        System.out.println("Ranking: ");

        for (Map.Entry<String, Map<String, Integer>> outerEntry : userContentPoints.entrySet()) {
            List<Integer> values = new ArrayList<>();
            System.out.println(outerEntry.getKey());
            for (Map.Entry<String, Integer> innerEntry : outerEntry.getValue().entrySet()) {
                values.add(innerEntry.getValue());
            }
            values.sort(Collections.reverseOrder());
            for (Integer value : values) {
                for (Map.Entry<String, Integer> innerEntry : outerEntry.getValue().entrySet()) {
                    if (value.equals(innerEntry.getValue())) {
                        System.out.println("#  " + innerEntry.getKey() + " -> " + value);
                    }
                }
            }
        }
    }
}
