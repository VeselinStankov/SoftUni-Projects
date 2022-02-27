package Exercise.More;

import java.util.Scanner;

public class BalancedBrackets {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        String input;
        boolean flag = false;
        boolean isBalanced = false;
        int counterOpen = 0;
        int counterClose = 0;

        for (int i = 0; i < n; i ++){
            input = scanner.nextLine();

            if (input.equals(")") && !flag) {
                counterClose++;
            }
            if (input.equals("(") && isBalanced){
                counterOpen ++;
            }

            if (input.equals("(")){
                flag = true;
                counterOpen ++;
            }
            else if (input.equals(")") && flag){
                isBalanced = true;
                counterClose ++;
            }
        }

        if (isBalanced && counterClose == counterOpen){
            System.out.println("BALANCED");
        }
        else {
            System.out.println("UNBALANCED");
        }

    }
}
