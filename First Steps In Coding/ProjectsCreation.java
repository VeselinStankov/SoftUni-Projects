import java.util.Scanner;

public class ProjectsCreation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String architectsName = scanner.nextLine();
        int projectCount = Integer.parseInt(scanner.nextLine());

        int hoursNeeded = projectCount * 3;

        System.out.println("The architect " + architectsName + " will need " + hoursNeeded + " hours to complete " + projectCount + " project/s.");

    }
}
