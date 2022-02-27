import java.util.Scanner;

public class UniquePINCodes {

    public static boolean primeChecker(int n){
        int m = n/2;
        for(int i=2; i<=m;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());
        int thirdNum = Integer.parseInt(scanner.nextLine());

        for (int i = 2; i <= firstNum; i++){

            if (i % 2 == 0){
                for (int j = 2; j <= secondNum; j++){
                    if (primeChecker(j)){
                        for (int k = 1; k <= thirdNum; k++){
                            if (k % 2 == 0){
                                System.out.println(i + " " + j + " " + k);
                            }
                        }
                    }
                }
            }
        }
    }
}
