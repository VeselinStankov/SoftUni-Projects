package More;

import java.util.Scanner;

public class StreamOfLetters {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input;
        int counterC = 0;
        int counterO = 0;
        int counterN = 0;
        String word = "";
        int counterSpace = 0;
        String newString = "";

        while (true){
            input = scanner.nextLine();
            if (input.equals("End")){
                for (int i = 0; i < word.length(); i++){
                    if (word.charAt(i) == ' '){
                        counterSpace --;
                    }
                    if (counterSpace == 0){
                        continue;
                    }
                    else {
                        newString += word.charAt(i);
                    }
                }
                System.out.println(newString);
                break;
            }
            boolean secret = false;
            if (Character.isLetter(input.charAt(0))) {
                if (counterC + counterN + counterO == 3){
                    word += " ";
                    counterC = 0;
                    counterO = 0;
                    counterN = 0;
                    counterSpace ++;
                }
                if (input.charAt(0) == 'c' && counterC > 0) {
                    word += input;
                    counterC --;
                } else if (input.charAt(0) == 'o' && counterO > 0) {
                    word += input;
                    counterO --;
                } else if (input.charAt(0) == 'n' && counterN > 0) {
                    word += input;
                    counterN --;
                }
                if (input.charAt(0) == 'c') {
                    counterC++;
                    secret = true;
                } else if (input.charAt(0) == 'o') {
                    counterO++;
                    secret = true;
                } else if (input.charAt(0) == 'n') {
                    counterN++;
                    secret = true;
                }
            }
            if (Character.isLetter(input.charAt(0)) && !secret) {
                word += input;
            }
            System.out.println(word);
        }
    }
}
