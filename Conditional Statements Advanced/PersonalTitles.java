import java.util.Scanner;

public class PersonalTitles {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double age = Double.parseDouble(scanner.nextLine());
        String sex = scanner.nextLine();

        if (sex.equals("m") && age >= 16){
            System.out.println("Mr.");
        }
        else if (sex.equals("m") && age < 16){
            System.out.println("Master");
        }
        else if (sex.equals("f") && age >= 16){
            System.out.println("Ms.");
        }
        else if (sex.equals("f") && age < 16){
            System.out.println("Miss");
        }
    }
}
