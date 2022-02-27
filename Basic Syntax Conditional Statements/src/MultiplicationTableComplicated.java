import java.util.Scanner;

public class MultiplicationTableComplicated {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int multiplier = Integer.parseInt(scanner.nextLine());
        boolean flag = false;

        for (; multiplier <= 10; multiplier ++){
            System.out.printf("%d X %d = %d\n",number,multiplier,number*multiplier);
            flag = true;
        }

        if (!flag){
            System.out.printf("%d X %d = %d\n",number,multiplier,number*multiplier);
        }
    }
}
