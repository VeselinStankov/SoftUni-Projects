package More;

import java.util.Scanner;

public class EqualPairs {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int input;
        int number = 0;
        int pair = 0;
        int pair1 = 0;
        int pair2 = 0;
        int pair3 = 0;
        int pair4 = 0;
        int maxDiff = 0;

        for (int i = 1; i <= n*2; i ++){
            input = Integer.parseInt(scanner.nextLine());
            if (i == 2) {
                pair = input + number;
            }
            if (i == 4){
                pair1 = input + number;
            }
            if (i == 6){
                pair2 = input + number;
            }
            if (i == 8){
                pair3 = input + number;
            }
            if (i == 10){
                pair4 = input + number;
            }
            number = input;
        }
        pair = pair / 2;
        pair1 = pair1 / 2;
        pair2 = pair2 / 2;
        pair3 = pair3 / 2;
        pair4 = pair4 / 2;
        if (true){
            if (pair > pair1){
                maxDiff = pair - pair1;
            }
            else {
                maxDiff = pair1 - pair;
            }
            if (pair > pair2){
                maxDiff = pair - pair2;
            }
            else {
                maxDiff = pair2 - pair;
            }
            if (pair > pair3){
                maxDiff = pair - pair3;
            }
            else {
                maxDiff = pair3 - pair;
            }
            if (pair > pair4){
                maxDiff = pair - pair4;
            }
            else {
                maxDiff = pair4 - pair;
            }
            if (pair1> pair2){
                maxDiff = pair1 - pair2;
            }
            else {
                maxDiff = pair2 - pair1;
            }
            if (pair1 > pair3){
                maxDiff = pair1 - pair3;
            }
            else {
                maxDiff = pair3 - pair1;
            }
            if (pair1 > pair4){
                maxDiff = pair1 - pair4;
            }
            else {
                maxDiff = pair4 - pair1;
            }
            if (pair2 > pair3){
                maxDiff = pair2 - pair3;
            }
            else {
                maxDiff = pair3 - pair2;
            }
            if (pair2 > pair4){
                maxDiff = pair2 - pair4;
            }
            else {
                maxDiff = pair4 - pair2;
            }
            if (pair3 > pair4){
                maxDiff = pair3 - pair4;
            }
            else {
                maxDiff = pair4 - pair3;
            }
            System.out.printf("No, maxdiff=%d",maxDiff);
        }
        else {
            System.out.printf("Yes, value=%d",pair);
        }
    }
}
