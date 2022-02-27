package Exercise.Students;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<Student> studentList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] data = scanner.nextLine().split(" ");
            Student student = new Student(data[0], data[1], Double.parseDouble(data[2]));
            studentList.add(student);
        }

        studentList.stream().sorted((s1, s2) -> Double.compare(s1.getGrade(), s2.getGrade()))
                .forEach(student -> System.out.println(student.toString()));
    }
}
