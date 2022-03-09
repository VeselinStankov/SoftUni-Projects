package Exercise;
import java.util.*;

public class Courses {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Map<String, List<String>> courseStudents = new LinkedHashMap<>();

        String line = scanner.nextLine();
        String[] command;

        while (!line.equals("end")) {
            command = line.split(" : ");

            if (!courseStudents.containsKey(command[0])) {
                courseStudents.put(command[0], new ArrayList<>());
                courseStudents.get(command[0]).add(command[1]);
            }
            else {
                courseStudents.get(command[0]).add(command[1]);
            }
            line = scanner.nextLine();
        }

        for (Map.Entry<String, List<String>> stringListEntry : courseStudents.entrySet()) {
            System.out.println(stringListEntry.getKey() + ": " + stringListEntry.getValue().size());
            for (String s : stringListEntry.getValue()) {
                System.out.println("-- " + s);
            }
        }


    }
}
