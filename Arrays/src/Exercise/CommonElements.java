package Exercise;

import java.util.Scanner;

public class CommonElements {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String firstLine = scanner.nextLine();
        String secondLine = scanner.nextLine();

        String [] firstArray = firstLine.split(" ");
        String [] secondArray = secondLine.split(" ");

        for (int i = 0; i < secondArray.length; i ++){
            for (int j = 0; j < firstArray.length; j ++){
                if (secondArray[i].equals(firstArray[j])){
                    System.out.print(secondArray[i] + " ");
                }
            }
        }

    }
}
