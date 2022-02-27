package Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayManipulator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String[] holder = line.split(" ");
        int[] numbers = new int[holder.length];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(holder[i]);
        }

        String command = scanner.nextLine();
        String[] input;

        while (!command.equals("end")) {

            input = command.split(" ");

            if (input[0].equals("exchange")) {
                numbers = exchange(Integer.parseInt(input[1]),numbers);
            }
            else if (command.equals("max even")){
                maxEven(numbers);
            }
            else if (command.equals("max odd")){
                maxOdd(numbers);
            }
            else if (command.equals("min even")){
                minEven(numbers);
            }
            else if (command.equals("min odd")){
                minOdd(numbers);
            }
            else if (input[0].equals("first")) {

                if (input[2].equals("even")){
                    firstEven(numbers,Integer.parseInt(input[1]));
                }
                else {
                    firstOdd(numbers,Integer.parseInt(input[1]));
                }
            }
            else if (input[0].equals("last")) {

                if (input[2].equals("even")){
                    lastEven(numbers,Integer.parseInt(input[1]));
                }
                else {
                    lastOdd(numbers,Integer.parseInt(input[1]));
                }
            }

            command = scanner.nextLine();
        }

        System.out.println(Arrays.toString(numbers));
    }

    private static void lastOdd(int[] numbers, int count) {

        if (count > numbers.length){
            System.out.println("Invalid count");
        }
        else {

            int size = 0;
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] % 2 != 0) {
                    size ++;
                }
            }
            int finalSize;
            if (size > count){
                finalSize = count;
            }
            else {
                finalSize = size;
            }
            int[] result = new int[finalSize];
            int j = 0;
            for (int i = numbers.length - 1; i >= 0; i--) {
                if (numbers[i] % 2 != 0){
                    result[j] = numbers[i];
                    j ++;
                    count --;
                    if (count == 0){
                        break;
                    }
                }
            }
            System.out.println(Arrays.toString(result));
        }

    }

    private static void lastEven(int[] numbers, int count) {

        if (count > numbers.length){
            System.out.println("Invalid count");
        }
        else {

            int size = 0;
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] % 2 == 0) {
                    size ++;
                }
            }
            int finalSize;
            if (size > count){
                finalSize = count;
            }
            else {
                finalSize = size;
            }
            int[] result = new int[finalSize];
            int j = 0;
            for (int i = numbers.length - 1; i >= 0; i--) {
                if (numbers[i] % 2 == 0){
                    result[j] = numbers[i];
                    j ++;
                    count --;
                    if (count == 0){
                        break;
                    }
                }
            }
            System.out.println(Arrays.toString(result));
        }

    }

    private static void firstOdd(int[] numbers, int count) {

        if (count > numbers.length){
            System.out.println("Invalid count");
        }
        else {

            int size = 0;
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] % 2 != 0) {
                    size ++;
                }
            }
            int finalSize;
            if (size > count){
                finalSize = count;
            }
            else {
                finalSize = size;
            }
            int[] result = new int[finalSize];
            int j = 0;
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] % 2 != 0){
                    result[j] = numbers[i];
                    j ++;
                    count --;
                    if (count == 0){
                        break;
                    }
                }
            }
            System.out.println(Arrays.toString(result));
        }

    }

    private static void firstEven(int[] numbers, int count) {

        if (count > numbers.length){
            System.out.println("Invalid count");
        }
        else {

            int size = 0;
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] % 2 == 0) {
                    size ++;
                }
            }
            int finalSize;
            if (size > count){
                finalSize = count;
            }
            else {
                finalSize = size;
            }
            int[] result = new int[finalSize];
            int j = 0;
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] % 2 == 0){
                    result[j] = numbers[i];
                    j ++;
                    count --;
                    if (count == 0){
                        break;
                    }
                }
            }
            System.out.println(Arrays.toString(result));
        }

    }

    private static void minOdd(int[] numbers) {

        int min = Integer.MAX_VALUE;
        int index = 0;
        boolean flag = false;

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] % 2 != 0) {
                if (numbers[i] <= min) {
                    min = numbers[i];
                    index = i;
                    flag = true;
                }
            }
        }
        if (!flag){
            System.out.println("No matches");
        }
        else {
            System.out.println(index);
        }
    }

    private static void minEven(int[] numbers) {

        int min = Integer.MAX_VALUE;
        int index = 0;
        boolean flag = false;

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] % 2 == 0) {
                if (numbers[i] <= min) {
                    min = numbers[i];
                    index = i;
                    flag = true;
                }
            }
        }
        if (!flag){
            System.out.println("No matches");
        }
        else {
            System.out.println(index);
        }
    }

    private static void maxOdd(int[] numbers) {

        int max = Integer.MIN_VALUE;
        int index = 0;
        boolean flag = false;

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] % 2 != 0) {
                if (numbers[i] >= max) {
                    max = numbers[i];
                    index = i;
                    flag = true;
                }
            }
        }
        if (!flag){
            System.out.println("No matches");
        }
        else {
            System.out.println(index);
        }

    }

    private static void maxEven(int[] numbers) {

        int max = Integer.MIN_VALUE;
        int index = 0;
        boolean flag = false;

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] % 2 == 0) {
                if (numbers[i] >= max) {
                    max = numbers[i];
                    index = i;
                    flag = true;
                }
            }
        }
        if (!flag){
            System.out.println("No matches");
        }
        else {
            System.out.println(index);
        }
    }

    private static int[] exchange(int index, int[] numbers) {

        if (index > numbers.length || index < 0) {
            System.out.println("Invalid index");
        }
        else {

            int[] secondHalf = new int[index + 1];
            int[] firstHalf = new int[numbers.length - index - 1];

            for (int i = 0; i <= index; i++) {

                secondHalf[i] = numbers[i];
            }

            int j = 0;
            for (int i = index + 1; i < numbers.length; i++) {

                firstHalf[j] = numbers[i];
                j++;
            }

            int[] result = new int[numbers.length];

            for (int i = 0; i < firstHalf.length; i++) {

                result[i] = firstHalf[i];
            }
            int k = 0;
            for (int i = firstHalf.length; i < result.length; i++) {

                result[i] = secondHalf[k];
                k++;
            }
            System.out.println(Arrays.toString(result));
            return result;
        }
        return numbers;
    }
}


