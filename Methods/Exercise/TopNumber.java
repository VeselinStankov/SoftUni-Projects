package Exercise;

import java.util.Scanner;

public class TopNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String holder;
        int digitSum = 0;
        boolean dividableByEight = false;
        boolean containsOdd = false;

        for (int i = 1; i <= n; i ++) {

            holder = Integer.toString(i);

            for (int j = 0; j < holder.length(); j ++) {
                digitSum += Character.getNumericValue(holder.charAt(j));

                if (Character.getNumericValue(holder.charAt(j)) % 2 != 0){
                    containsOdd = true;
                }
            }

            if (digitSum % 8 == 0){
                dividableByEight = true;
            }

            if (containsOdd && dividableByEight) {
                System.out.println(holder);
            }
            containsOdd = false;
            dividableByEight = false;
            digitSum = 0;
        }

    }
}
