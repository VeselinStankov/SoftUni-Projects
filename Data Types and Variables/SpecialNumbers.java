import java.util.Scanner;

public class SpecialNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        String holder;
        int digit1 = 0;
        int digit2 = 0;

        for (int i = 1; i <= n; i ++){
            holder = String.valueOf(i);
            digit1 = Character.getNumericValue(holder.charAt(0));
            if (holder.length() > 1) {
                digit2 = Character.getNumericValue(holder.charAt(1));
            }
            if (digit1 + digit2 == 5 || digit1 + digit2 == 7 || digit1 + digit2 == 11){
                System.out.printf("%d -> True\n",i);
            }
            else {
                System.out.printf("%d -> False\n",i);
            }
        }
    }
}
