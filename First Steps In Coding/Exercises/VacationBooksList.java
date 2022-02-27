package Exercises;

import java.util.Scanner;

public class VacationBooksList {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int pageCount = Integer.parseInt(scanner.nextLine());
        int pagesPerHour = Integer.parseInt(scanner.nextLine());
        int daysPerBook = Integer.parseInt(scanner.next());

        int hoursNeeded = ( pageCount / pagesPerHour ) / daysPerBook;

        System.out.println(hoursNeeded);

    }
}
