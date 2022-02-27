package Exercise;

import java.util.Scanner;

public class KaminoFactory {

    public static int bestDNA(int[] numbers){

        int counter = 0;
        int max = 0;

        for (int i = 0; i < numbers.length - 1; i ++){
            if (numbers[i] == numbers[i + 1]){
                counter ++;
                if (counter > max){
                    max = counter;
                }
            }
            else {
                counter = 0;
            }
        }

        return max + 1;

    }

    public static int startingIndex(int numbers[]){

        int counter = 0;
        int index = 0;

        for (int i = 0; i < numbers.length - 1; i ++){
            if (numbers[i] == numbers[i + 1]){
                counter ++;
                if (counter > index){
                    index = i;
                }
            }
            else {
                counter = 0;
            }
        }

        return index;
    }

    public static int sumOnes(int[] numbers){

        int sum = 0;

        for (int i = 0; i < numbers.length; i ++){
            sum += numbers[i];
        }

        return sum;
    }



    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        String line = "";
        int [] dna = new int[n];
        String[] array = null;
        int index = 0;
        int oneLength = 0;
        int maxOnes = 0;
        int minIndex = 0;
        int maxSum = 0;
        int counter = 1;
        int indexCounter = 0;
        int[] result = new int[n];


        while (true){
            line = scanner.nextLine();
            if (line.equals("Clone them!")) {
                break;
            }

            line = line.replace('!',' ');
            array = line.split("\\s+");

            for (int i = 0; i < array.length; i++) {
                dna[i] = Integer.parseInt(array[i]);
            }

            oneLength = bestDNA(dna);
            if (oneLength > maxOnes){
                maxOnes = oneLength;
                indexCounter = counter;
                maxSum = sumOnes(dna);
                minIndex = startingIndex(dna);
                result = dna.clone();
            }
            else if (oneLength == maxOnes){
                index = startingIndex(dna);
                if (index < minIndex){
                    minIndex = index;
                    indexCounter = counter;
                    maxSum = sumOnes(dna);
                    result = dna.clone();
                }
                else if (index == minIndex){
                    if (sumOnes(dna) >= maxSum){
                        maxSum = sumOnes(dna);
                        indexCounter = counter;
                        result = dna.clone();
                    }
                }
            }
            counter ++;
        }
        System.out.printf("Best DNA sample %d with sum: %d.\n",indexCounter, maxSum);
        for (int i = 0; i < dna.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
