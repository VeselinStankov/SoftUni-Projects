package Exercise;

import java.util.*;

public class StudentAcademy {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Map<String, List<Double>> studentGrade = new LinkedHashMap<>();
        String name;
        double grade;

        for (int i = 0; i < n; i ++) {
            name = scanner.nextLine();
            grade = Double.parseDouble(scanner.nextLine());

            if (!studentGrade.containsKey(name)) {
                studentGrade.put(name,new ArrayList<>());
                studentGrade.get(name).add(grade);
            }
            else {
                studentGrade.get(name).add(grade);
            }
        }

        double averageGrade = 0;

        for (Map.Entry<String, List<Double>> stringListEntry : studentGrade.entrySet()) {

            for (Double aDouble : stringListEntry.getValue()) {
                averageGrade += aDouble;
            }

            if (averageGrade / stringListEntry.getValue().size() >= 4.5) {
                System.out.printf("%s -> ", stringListEntry.getKey());
                System.out.printf("%.2f\n", averageGrade / stringListEntry.getValue().size());
            }
            averageGrade = 0;
        }


    }
}
