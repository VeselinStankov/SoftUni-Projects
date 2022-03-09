import java.util.Scanner;

public class WordFilter {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();
        String[] lineAsArray = line.split(" ");

        for (String s : lineAsArray) {
            if (s.length() % 2 == 0) {
                System.out.println(s);
            }
        }


    }
}
