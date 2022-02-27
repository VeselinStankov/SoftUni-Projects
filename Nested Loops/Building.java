import java.util.Scanner;

public class Building {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int floors = Integer.parseInt(scanner.nextLine());
        int rooms = Integer.parseInt(scanner.nextLine());

        for (int i = floors; i >= 1; i--) {
            for (int n = 0; n <= rooms - 1; n++) {

                if (i == floors){
                    System.out.printf("L%d%d ",i,n);
                }
                else if (i % 2 == 0){
                    System.out.printf("O%d%d ",i,n);
                }
                else {
                    System.out.printf("A%d%d ",i,n);
                }
            }
            System.out.println();
        }
    }
}
