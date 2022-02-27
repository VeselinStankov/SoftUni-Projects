import java.util.Scanner;

public class ConcatenateData {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String FirstName = scanner.nextLine();
        String LastName = scanner.nextLine();
        int Age = Integer.parseInt(scanner.nextLine());
        String Town = scanner.nextLine();


        System.out.println("You are " + FirstName + " " + LastName + ", a " + Age + "-years old person from " + Town + ".");

    }
}