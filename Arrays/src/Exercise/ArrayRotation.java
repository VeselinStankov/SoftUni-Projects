package Exercise;

import java.util.Scanner;

public class ArrayRotation {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");
        int[] array = new int[input.length];


        for (int i = 0; i < input.length; i ++) {
            array[i] = Integer.parseInt(input[i]);
        }

        int n = Integer.parseInt(scanner.nextLine());


        if (n > array.length){
            n -= array.length;
        }

        if (n == array.length){
            for (int i = 0; i < array.length; i ++){
                System.out.print(array[i] + " ");
            }
        }
        else {

            int[] elements = new int[n];
            int[] remaining = new int[array.length - n];

            for (int i = 0; i < n; i++) {
                elements[i] = array[i];
            }

            int j = 0;
            for (int i = n; i < array.length; i++) {
                remaining[j] = array[i];
                j++;
            }

            for (int i = 0; i < remaining.length; i++) {
                System.out.print(remaining[i] + " ");
            }

            for (int i = 0; i < elements.length; i++) {
                System.out.print(elements[i] + " ");
            }
        }

    }
}
