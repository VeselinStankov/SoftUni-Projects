import java.util.Scanner;

public class DayOfWeek {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        String[] days = new String[] {"Invalid day!","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};

        if (number >= 0 && number <= 7){
            System.out.println(days[number]);
        }
        else {
            System.out.println("Invalid day!");
        }
    }
}
