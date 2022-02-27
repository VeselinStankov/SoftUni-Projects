import java.util.Scanner;

public class EqualArrays {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String line1 = scanner.nextLine();
        String line2 = scanner.nextLine();

        String[] array1 = line1.split(" ");
        String[] array2 = line2.split(" ");

        int sum = 0;
        boolean flag = true;

        if (array1.length != array2.length) {
            System.out.println("Arrays are not identical. Found difference at " + (array2.length - 1) + " index.");
        }
        else {
            for (int i = 0; i < array1.length; i++) {
                sum += Integer.parseInt(array1[i]);
                if (Integer.parseInt(array1[i]) != Integer.parseInt(array2[i])) {
                    System.out.println("Arrays are not identical. Found difference at " + i + " index.");
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.println("Arrays are identical. Sum: " + sum);
            }
        }
    }
}
